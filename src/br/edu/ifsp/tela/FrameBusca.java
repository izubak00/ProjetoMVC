package br.edu.ifsp.tela;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class FrameBusca extends JFrame {
	private JLabel lblId;
	private JTextField textField;
	private JButton btnBuscar;
	private JButton btnVoltar;
	private JTextArea textArea;

	/**
	 * Create the frame.
	 */
	public FrameBusca() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 361, 200);
		getContentPane().setLayout(null);
		
		lblId = new JLabel("ID:");
		lblId.setBounds(56, 11, 46, 14);
		getContentPane().add(lblId);
		
		textField = new JTextField();
		textField.setBounds(111, 8, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(56, 54, 89, 23);
		getContentPane().add(btnBuscar);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(155, 54, 89, 23);
		getContentPane().add(btnVoltar);
		
		textArea = new JTextArea();
		textArea.setBounds(56, 95, 188, 22);
		getContentPane().add(textArea);
	}

	public JTextField gettextField() {
		return textField;
	}

	public void settextField(JTextField textField) {
		this.textField = textField;
	}
	
	public JButton getbtnBuscar() {
		return btnBuscar;
	}

	public void setbtnBuscar(JButton btnBuscar) {
		this.btnBuscar = btnBuscar;
	}
	
	public JButton getbtnVoltar() {
		return btnVoltar;
	}

	public void setbtnVoltar(JButton btnVoltar) {
		this.btnVoltar = btnVoltar;
	}
	
	public void settextArea(String textField) {
		textArea.setText(textField);
	}
	

}
