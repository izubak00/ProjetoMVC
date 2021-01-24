package br.edu.ifsp.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import br.edu.ifsp.dao.PessoaDAO;
import br.edu.ifsp.modelo.Pessoa;
import br.edu.ifsp.tela.FrameEdita;
import br.edu.ifsp.tela.FrameInsere;
import br.edu.ifsp.tela.FramePrincipal;

public class EditaController implements ActionListener {

	private FrameEdita tela;
	
	public EditaController(FrameEdita fe) {
		this.tela = fe;
		this.tela.getbtnEditar().addActionListener(this);
		this.tela.getBtnLimpar().addActionListener(this);
		this.tela.getbtnVoltar().addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == this.tela.getbtnEditar()) {
			
			String nome = this.tela.getTfNomeCompleto().getText();
			int idade = Integer.parseInt(this.tela.getTfIdade().getText());
			int id = Integer.parseInt(this.tela.getTfIdade().getText());
		
			PessoaDAO dao = new PessoaDAO();
			dao.editarPessoaPorId(id, nome, idade);
		
			JOptionPane.showMessageDialog(null, "Pessoa editada com Sucesso");
			
		}
		if(e.getSource() == this.tela.getbtnVoltar()) {
			
			tela.setVisible(false);
			
		}
		if(e.getSource() == this.tela.getBtnLimpar()) {
		
			this.tela.getTfNomeCompleto().setText("");
			this.tela.getTfIdade().setText("");
			tela.setVisible(false);
		
		}
	}

}
