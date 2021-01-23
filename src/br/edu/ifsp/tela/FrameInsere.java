package br.edu.ifsp.tela;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameInsere extends JFrame {
	
	private JTextField tfNomeCompleto;
	private JTextField tfIdade;
	private JButton btnSalvarPessoa;
	private JButton btnVoltar;
	private JButton btnLimpar;

	/**
	 * Create the frame.
	 */
	public FrameInsere() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 361, 178);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome Completo:");
		lblNewLabel.setBounds(25, 11, 82, 14);
		getContentPane().add(lblNewLabel);
		
		tfNomeCompleto = new JTextField();
		tfNomeCompleto.setBounds(117, 8, 187, 20);
		getContentPane().add(tfNomeCompleto);
		tfNomeCompleto.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Idade:");
		lblNewLabel_1.setBounds(69, 54, 38, 14);
		getContentPane().add(lblNewLabel_1);
		
		tfIdade = new JTextField();
		tfIdade.setBounds(117, 51, 86, 20);
		getContentPane().add(tfIdade);
		tfIdade.setColumns(10);
		
		btnSalvarPessoa = new JButton("Salvar");
		btnSalvarPessoa.setBounds(44, 97, 89, 23);
		getContentPane().add(btnSalvarPessoa);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(137, 97, 89, 23);
		getContentPane().add(btnLimpar);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(236, 97, 89, 23);
		getContentPane().add(btnVoltar);
	}

	public JTextField getTfNomeCompleto() {
		return tfNomeCompleto;
	}

	public void setTfNomeCompleto(JTextField tfNomeCompleto) {
		this.tfNomeCompleto = tfNomeCompleto;
	}

	public JTextField getTfIdade() {
		return tfIdade;
	}

	public void setTfIdade(JTextField tfIdade) {
		this.tfIdade = tfIdade;
	}

	public JButton getBtnSalvarPessoa() {
		return btnSalvarPessoa;
	}

	public void setBtnSalvarPessoa(JButton btnSalvarPessoa) {
		this.btnSalvarPessoa = btnSalvarPessoa;
	}

	public JButton getBtnLimpar() {
		return btnLimpar;
	}

	public void setBtnLimpar(JButton btnLimpar) {
		this.btnLimpar = btnLimpar;
	}
	
	public JButton getbtnVoltar() {
		return btnVoltar;
	}

	public void setbtnVoltar(JButton btnVoltar) {
		this.btnVoltar = btnVoltar;
	}

}
