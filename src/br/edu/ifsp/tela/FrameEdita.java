package br.edu.ifsp.tela;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameEdita extends JFrame {
	
	private JTextField tfNomeCompleto;
	private JTextField tfIdade;
	private JButton btnVoltar;
	private JButton btnLimpar;
	private JButton btnEditar;
	private JLabel lblId;
	private JTextField id;

	/**
	 * Create the frame.
	 */
	public FrameEdita() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 361, 256);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome Completo:");
		lblNewLabel.setBounds(23, 47, 82, 14);
		getContentPane().add(lblNewLabel);
		
		tfNomeCompleto = new JTextField();
		tfNomeCompleto.setBounds(115, 44, 187, 20);
		getContentPane().add(tfNomeCompleto);
		tfNomeCompleto.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Idade:");
		lblNewLabel_1.setBounds(67, 72, 38, 14);
		getContentPane().add(lblNewLabel_1);
		
		tfIdade = new JTextField();
		tfIdade.setBounds(117, 69, 86, 20);
		getContentPane().add(tfIdade);
		tfIdade.setColumns(10);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(137, 97, 89, 23);
		getContentPane().add(btnLimpar);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(236, 97, 89, 23);
		getContentPane().add(btnVoltar);
		
		btnEditar = new JButton("Editar");
		btnEditar.setBounds(38, 97, 89, 23);
		getContentPane().add(btnEditar);
		
		lblId = new JLabel("ID:");
		lblId.setBounds(59, 11, 46, 14);
		getContentPane().add(lblId);
		
		id = new JTextField();
		id.setBounds(115, 8, 86, 20);
		getContentPane().add(id);
		id.setColumns(10);
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
	
	public JTextField getid() {
		return tfIdade;
	}

	public void setid(JTextField id) {
		this.id = id;
	}

	public JButton getbtnEditar() {
		return btnEditar;
	}

	public void setbtnEditar(JButton btnEditar) {
		this.btnEditar = btnEditar;
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
