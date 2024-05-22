package codigoInterface;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.text.BadLocationException;

import codigoInterface.gals.LexicalError;
import codigoInterface.gals.ScannerConstants;

public class CustomTextArea extends JTextArea {
	private static final Pattern WORD_PATTERN = Pattern.compile("\\w+");
    private static final Pattern WORD_OR_SYMBOL = Pattern.compile("([\\W&&[^\\h]]{2}|\\w*)\\h*");

    public CustomTextArea() {
        super();
    }

    public CustomTextArea(String text) {
        super(text);
    }

    public void wordBreaksBackwards(int n) {
        try {
            int caretPosition = getCaretPosition();
            if (caretPosition == 0) return;

            String text = getText(0, caretPosition);
            Matcher matcher = WORD_OR_SYMBOL.matcher(text);

            int prevWordStart = 0;
            while (matcher.find()) {
                if (matcher.end() >= caretPosition) break;
                prevWordStart = matcher.start();
            }

            setCaretPosition(prevWordStart);
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
    }

    public void wordBreaksForwards(int n) {
        try {
            int caretPosition = getCaretPosition();
            String text = getText(caretPosition, getDocument().getLength() - caretPosition);
            Matcher matcher = WORD_OR_SYMBOL.matcher(text);

            while (matcher.find()) {
                if (matcher.start() > 0) {
                    setCaretPosition(caretPosition + matcher.start());
                    break;
                }
                if (matcher.hitEnd()) {
                    setCaretPosition(getDocument().getLength());
                }
            }
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
    }

    public void selectWord() {
        try {
            int caretPosition = getCaretPosition();
            String text = getText(0, getDocument().getLength());
            Matcher matcher = WORD_PATTERN.matcher(text);

            while (matcher.find()) {
                if (matcher.start() <= caretPosition && matcher.end() >= caretPosition) {
                    select(matcher.start(), matcher.end());
                    break;
                }
            }
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
    }

    private int getLineNumber(CustomTextArea texto, int offset) {
        int lineNumber = 1;
        try {
            for (int i = 0; i < offset && i < texto.getDocument().getLength(); i++) {
                if (texto.getText(i, 1).charAt(0) == '\n') {
                    lineNumber++;
                }
            }
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
        return lineNumber;
    }

    private String formatarMensagemErro(LexicalError error, CustomTextArea texto) {
        try {
            return ScannerConstants.SCANNER_ERROR[0].equals(error.getMessage())
                    ? texto.getText(error.getPosition(), 1) + " " + error.getMessage()
                    : error.getMessage();
        } catch (BadLocationException e) {
            e.printStackTrace();
            return "Erro de localização inválida: " + e.getMessage();
        }
    }

    private int obterLinha(CustomTextArea entrada, int position) {
        try {
            if (position < 0 || position > entrada.getDocument().getLength()) {
                throw new IndexOutOfBoundsException("Position out of bounds");
            }
            entrada.setCaretPosition(position);
            int linha = entrada.getLineOfOffset(position);
            return linha + 1;
        } catch (BadLocationException e) {
            e.printStackTrace();
            return -1;
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            entrada.setCaretPosition(0);
            return 1;
        }
    }

//    public static void main(String[] args) {
//        JFrame frame = new JFrame("CustomTextArea Example");
//        CustomTextArea textArea = new CustomTextArea();
//        textArea.setText("public class Example {\n    public static void main(String[] args) {\n        System.out.println(\"Hello World\");\n    }\n}");
//        frame.add(new JScrollPane(textArea));
//
//        LexicalError error = new LexicalError(25, "Error message");
//        String errorMessage = textArea.formatarMensagemErro(error, textArea);
//        System.out.println("Error message: " + errorMessage);
//
//        int lineNumber = textArea.obterLinha(textArea, 25);
//        System.out.println("Line number at position 25: " + lineNumber);
//
//        textArea.addKeyListener(new KeyAdapter() {
//            @Override
//            public void keyPressed(KeyEvent e) {
//                if ((e.getKeyCode() == KeyEvent.VK_LEFT) && ((e.getModifiersEx() & KeyEvent.CTRL_DOWN_MASK) != 0)) {
//                    textArea.wordBreaksBackwards(1);
//                } else if ((e.getKeyCode() == KeyEvent.VK_RIGHT) && ((e.getModifiersEx() & KeyEvent.CTRL_DOWN_MASK) != 0)) {
//                    textArea.wordBreaksForwards(1);
//                } else if ((e.getKeyCode() == KeyEvent.VK_W) && ((e.getModifiersEx() & KeyEvent.CTRL_DOWN_MASK) != 0)) {
//                    textArea.selectWord();
//                }
//            }
//        });
//
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(400, 300);
//        frame.setVisible(true);
//    }
}