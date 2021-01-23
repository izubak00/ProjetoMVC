package br.edu.ifsp.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import br.edu.ifsp.dao.PessoaDAO;
import br.edu.ifsp.tela.FrameRemove;

public class RemoveController implements ActionListener {

	private FrameRemove tela;
	
	public RemoveController(FrameRemove fr) {
		this.tela = fr;
		this.tela.getbtnRemover().addActionListener(this);
		this.tela.getbtnVoltar().addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == this.tela.getbtnRemover()) {
			
			int id = Integer.parseInt(this.tela.gettextField().getText());
		
			PessoaDAO dao = new PessoaDAO();
			dao.removerPessoaPorId(id);
		
			JOptionPane.showMessageDialog(null, "Pessoa removida com Sucesso");
			
		}
		if(e.getSource() == this.tela.getbtnVoltar()) {
			
			tela.setVisible(false);
		}

	}
}
