package br.edu.ifsp.tela;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameRemove extends JFrame {
	private JLabel lblId;
	private JTextField textField;
	private JButton btnRemover;
	private JButton btnVoltar;

	/**
	 * Create the frame.
	 */
	public FrameRemove() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 361, 178);
		getContentPane().setLayout(null);
		
		lblId = new JLabel("ID:");
		lblId.setBounds(56, 11, 46, 14);
		getContentPane().add(lblId);
		
		textField = new JTextField();
		textField.setBounds(111, 8, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		btnRemover = new JButton("Remover");
		btnRemover.setBounds(56, 54, 89, 23);
		getContentPane().add(btnRemover);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(155, 54, 89, 23);
		getContentPane().add(btnVoltar);
	}

	public JTextField gettextField() {
		return textField;
	}

	public void settextField(JTextField textField) {
		this.textField = textField;
	}
	
	public JButton getbtnRemover() {
		return btnRemover;
	}

	public void setbtnRemover(JButton btnRemover) {
		this.btnRemover = btnRemover;
	}
	
	public JButton getbtnVoltar() {
		return btnVoltar;
	}

	public void setbtnVoltar(JButton btnVoltar) {
		this.btnVoltar = btnVoltar;
	}



}
