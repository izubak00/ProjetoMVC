package br.edu.ifsp.tela;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class FramePrincipal extends JFrame {

	
	private JButton btnInserir;
	private JButton btnRemover;
	private JButton btnEditar;
	private JButton btnBuscar;
	private JButton btnListarTodos;
	private JTextArea textArea;
	
	/**
	 * Create the frame.
	 */
	public FramePrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 361, 360);
		getContentPane().setLayout(null);
		
		JLabel lblSelecioneAOperao = new JLabel("Selecione a opera\u00E7\u00E3o desejada");
		lblSelecioneAOperao.setBounds(89, 11, 162, 14);
		getContentPane().add(lblSelecioneAOperao);
		
		btnInserir = new JButton("Inserir");
		btnInserir.setBounds(125, 36, 89, 23);
		getContentPane().add(btnInserir);
		
		btnRemover = new JButton("Remover");
		btnRemover.setBounds(125, 70, 89, 23);
		getContentPane().add(btnRemover);
		
		btnEditar = new JButton("Editar");
		btnEditar.setBounds(125, 104, 89, 23);
		getContentPane().add(btnEditar);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(125, 138, 89, 23);
		getContentPane().add(btnBuscar);
		
		btnListarTodos = new JButton("Listar todos");
		btnListarTodos.setBounds(125, 172, 89, 23);
		getContentPane().add(btnListarTodos);
		
		textArea = new JTextArea();
		textArea.setBounds(46, 220, 254, 90);
		getContentPane().add(textArea);
	}


	public JButton getbtnInserir() {
		return btnInserir;
	}

	public void setbtnInserir(JButton btnInserir) {
		this.btnInserir = btnInserir;
	}
	
	public JButton getbtnRemover() {
		return btnRemover;
	}

	public void setbtnRemover(JButton btnRemover) {
		this.btnRemover = btnRemover;
	}
	
	public JButton getbtnEditar() {
		return btnEditar;
	}

	public void setbtnEditar(JButton btnEditar) {
		this.btnEditar = btnEditar;
	}	
	public JButton getbtnBuscar() {
		return btnBuscar;
	}

	public void setbtnBuscar(JButton btnBuscar) {
		this.btnBuscar = btnBuscar;
	}	
	
	public JButton getbtnListarTodos() {
		return btnListarTodos;
	}

	public void setbtnListarTodos(JButton btnListarTodos) {
		this.btnListarTodos = btnListarTodos;
	}
	
	public JTextArea gettextArea() {
		return textArea;
	}
	
	public void settextArea(String text) {		
		
		textArea.append(text);
	}
}
