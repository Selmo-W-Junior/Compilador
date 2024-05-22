package codigoInterface;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.KeyStroke;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.text.BadLocationException;
import javax.swing.ImageIcon;

public class Interface extends JFrame {

	private JPanel contentPane;
	private final JSeparator separator = new JSeparator();
	JTextArea textArea = new JTextArea();
	JTextArea txtAreaMsg = new JTextArea();
	JTextPane txtpnNomeDoPrograma = new JTextPane();
	String copiado = new String();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface frame = new Interface();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Interface() {
		setTitle("Compilador 1º Semestre 2024");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setMinimumSize(new Dimension(900, 600));
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JButton btnNovo = new JButton("Novo (ctrl-n)");
		btnNovo.setIcon(new ImageIcon(codigoInterface.Interface.class.getResource("/imagens/btnNovo.png")));
		btnNovo.setSelectedIcon(new ImageIcon(Interface.class.getResource("/imagens/btnNovo.png")));
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				txtAreaMsg.setText("");
				txtpnNomeDoPrograma.setText("");
			}
		});
		
		// Definindo ação para Ctrl + N
        String actionKey = "ativarBotao";
        btnNovo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke("control N"), actionKey
        );
        btnNovo.getActionMap().put(actionKey, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	btnNovo.doClick();  
            }
        });		
		
		JButton btnAbrir = new JButton("Abrir (ctrl-o)");
		btnAbrir.setIcon(new ImageIcon(Interface.class.getResource("/imagens/OpenFolder.png")));
		btnAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
                Component frame = null;
				int result = fileChooser.showOpenDialog(frame);

                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    txtpnNomeDoPrograma.setText(selectedFile.getAbsolutePath());
                    try {
                        BufferedReader reader = new BufferedReader(new FileReader(selectedFile));
                        StringBuilder content = new StringBuilder();
                        String line;
                        while ((line = reader.readLine()) != null) {
                            content.append(line).append("\n");
                        }
                        reader.close();
                        textArea.setText(content.toString());
                        txtAreaMsg.setText("");
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                } else {
                    
                }
			}
		});
		
		// Definindo ação para Ctrl + O
        String actionKeyCrtlO = "ativarBotaoCrtlO";
        btnAbrir.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke("control O"), actionKeyCrtlO
        );
        btnAbrir.getActionMap().put(actionKeyCrtlO, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	btnAbrir.doClick();  
            }
        });	
		
		JButton btnSalvar = new JButton("Salvar (ctrl-s)");
		btnSalvar.setIcon(new ImageIcon(Interface.class.getResource("/imagens/save.png")));
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
                Component frame = null;
				if (!txtpnNomeDoPrograma.getText().isEmpty()) {
					File selectedFile = new File(txtpnNomeDoPrograma.getText());
					if (selectedFile.exists()) {
						try {
	                        BufferedWriter writer = new BufferedWriter(new FileWriter(selectedFile));
	                        writer.write(textArea.getText());
	                        writer.close();
	                        
	                    } catch (Exception ex) {
	                        ex.printStackTrace();
	                    }
                    }
				}else {
					int result = fileChooser.showSaveDialog(frame);
					if (result == JFileChooser.APPROVE_OPTION) {
	                    File selectedFile = fileChooser.getSelectedFile();
	                    try {
	                        BufferedWriter writer = new BufferedWriter(new FileWriter(selectedFile));
	                        writer.write(textArea.getText());
	                        writer.close();
	                        JOptionPane.showMessageDialog(frame, "Arquivo salvo com sucesso.");
	                        File parentDirectory = selectedFile.getParentFile();
	                        String nomeArquivo = selectedFile.getName();
	                        if(txtpnNomeDoPrograma.getText().isBlank()) {
	                        	txtpnNomeDoPrograma.setText(parentDirectory.getAbsolutePath()+"\\" + nomeArquivo);
	                        }
	                    } catch (Exception ex) {
	                        ex.printStackTrace();
	                    }
	                }
				}
				txtAreaMsg.setText("");
			}
		});
		
		// Definindo ação para Ctrl + S
        String actionKeyCrtlS = "ativarBotaoCrtlS";
        btnSalvar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke("control S"), actionKeyCrtlS
        );
        btnSalvar.getActionMap().put(actionKeyCrtlS, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	btnSalvar.doClick();  
            }
        });	
		
		JButton btnCopiar = new JButton("Copiar (ctrl-c)");
		btnCopiar.setIcon(new ImageIcon(Interface.class.getResource("/imagens/copy.png")));
		btnCopiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedText = textArea.getSelectedText();
                if (selectedText != null && !selectedText.isEmpty()) {
                    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                    clipboard.setContents(new StringSelection(selectedText), null);
                }
            }
        });
		
		// Definindo ação para Ctrl + C
        String actionKeyCrtlC = "ativarBotaoCrtlC";
        btnCopiar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke("control C"), actionKeyCrtlC
        );
        btnCopiar.getActionMap().put(actionKeyCrtlC, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	btnCopiar.doClick();  
            }
        });	
        
		JButton btnColar = new JButton("Colar (ctrl-v)");
		btnColar.setIcon(new ImageIcon(Interface.class.getResource("/imagens/paste.png")));
		btnColar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                Transferable contents = clipboard.getContents(null);
                if (contents != null && contents.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                    try {
                        String text = (String) contents.getTransferData(DataFlavor.stringFlavor);
                        int caretPosition = textArea.getCaretPosition();
                        textArea.insert(text, caretPosition);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });
		
		// Definindo ação para Ctrl + V
        String actionKeyCrtlV = "ativarBotaoCrtlV";
        btnColar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke("control V"), actionKeyCrtlV
        );
        btnColar.getActionMap().put(actionKeyCrtlV, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	btnColar.doClick();  
            }
        });	
		JButton btnRecortar = new JButton("Recortar (ctrl-x)");
		btnRecortar.setIcon(new ImageIcon(Interface.class.getResource("/imagens/cut.png")));
		btnRecortar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int start = textArea.getSelectionStart();
                int end = textArea.getSelectionEnd();
                if (start != end) {
                    String text = textArea.getText();
                    textArea.setText(text.substring(0, start) + text.substring(end));
                }
            }
        });
		
		// Definindo ação para Ctrl + R
        String actionKeyCrtlR = "ativarBotaoCrtlR";
        btnRecortar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke("control R"), actionKeyCrtlR
        );
        btnRecortar.getActionMap().put(actionKeyCrtlR, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	btnRecortar.doClick();  
            }
        });	
		JButton btnEquipe = new JButton("Equipe (F1)");
		btnEquipe.setIcon(new ImageIcon(Interface.class.getResource("/imagens/group.png")));
		btnEquipe.setToolTipText("F1");
		btnEquipe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtAreaMsg.append("Iran Andrei Costa, Lucas Queiroz dos Reis e Selmo Werner Junior\n");
			}
		});
		// Definindo ação para F1
        String actionKeyF1 = "ativarBotaoF1";
        btnEquipe.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke("F1"), actionKeyF1
        );
        btnEquipe.getActionMap().put(actionKeyF1, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	btnEquipe.doClick();  
            }
        });
        
		JButton btnCompilar = new JButton("Compilar (F7)");
		btnCompilar.setIcon(new ImageIcon(Interface.class.getResource("/imagens/play.png")));
		btnCompilar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtAreaMsg.setText("");
				CompilerController compile = new CompilerController();
			
				txtAreaMsg.append(compile.compilar(textArea.getText()));
			}
		});
		// Definindo ação para F7
        String actionKeyF7 = "ativarBotaoF7";
        btnCompilar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke("F7"), actionKeyF7
        );
        btnCompilar.getActionMap().put(actionKeyF7, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	btnCompilar.doClick();  
            }
        });
		
		int buttonHeight = 70;
		btnNovo.setPreferredSize(new Dimension(100, 70));
		btnNovo.setFont(new Font("Arial", Font.PLAIN, 10));
		btnAbrir.setPreferredSize(new Dimension(100, 70));
		btnAbrir.setFont(new Font("Arial", Font.PLAIN, 10));
		btnSalvar.setPreferredSize(new Dimension(100, 70));
		btnSalvar.setFont(new Font("Arial", Font.PLAIN, 10));
		btnCopiar.setPreferredSize(new Dimension(100, 70));
		btnCopiar.setFont(new Font("Arial", Font.PLAIN, 10));
		btnColar.setPreferredSize(new Dimension(100, 70));
		btnColar.setFont(new Font("Arial", Font.PLAIN, 10));
		btnRecortar.setPreferredSize(new Dimension(100, 70));
		btnRecortar.setFont(new Font("Arial", Font.PLAIN, 10));
		btnEquipe.setPreferredSize(new Dimension(100, 70));
		btnEquipe.setFont(new Font("Arial", Font.PLAIN, 10));
		btnCompilar.setPreferredSize(new Dimension(100, 70));
		btnCompilar.setFont(new Font("Arial", Font.PLAIN, 10));

		JSeparator separator_1 = new JSeparator();

		JSplitPane splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnColar, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnCopiar, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAbrir, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSalvar, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNovo, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnEquipe, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnCompilar, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnRecortar, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(txtpnNomeDoPrograma, GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(2)
							.addComponent(splitPane, GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(23)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnNovo, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnAbrir, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnSalvar, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnCopiar, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnColar, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnRecortar, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnCompilar, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnEquipe, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
							.addGap(12))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(59)
									.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(splitPane, GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
									.addGap(8)))
							.addComponent(txtpnNomeDoPrograma, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
					.addGap(21))
		);

		textArea.setFont(new Font("Monospaced", Font.PLAIN, 16));

		splitPane.setDividerLocation(300); 
		splitPane.setResizeWeight(1.0); 		
		
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		NumberedBorder numberedBorder = new NumberedBorder();
		textArea.setBorder(BorderFactory.createCompoundBorder(numberedBorder, BorderFactory.createEmptyBorder(0, 5, 0, 0)));
		splitPane.setLeftComponent(scrollPane);
		
		JScrollPane scrollPaneAreaMsg = new JScrollPane();
		scrollPaneAreaMsg.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPaneAreaMsg.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		splitPane.setRightComponent(scrollPaneAreaMsg);
		txtAreaMsg.setForeground(Color.WHITE);
		txtAreaMsg.setEditable(false);
		txtAreaMsg.setBackground(Color.GRAY);
		scrollPaneAreaMsg.setViewportView(txtAreaMsg);
		contentPane.setLayout(gl_contentPane);
	}
}