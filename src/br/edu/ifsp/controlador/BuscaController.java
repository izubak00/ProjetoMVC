package br.edu.ifsp.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import br.edu.ifsp.dao.PessoaDAO;
import br.edu.ifsp.modelo.Pessoa;
import br.edu.ifsp.tela.FrameBusca;
import br.edu.ifsp.tela.FrameRemove;

public class BuscaController implements ActionListener {

	private FrameBusca tela;
	private Pessoa modelo;
	
	public BuscaController(FrameBusca fb) {
		this.tela = fb;
		this.tela.getbtnBuscar().addActionListener(this);
		this.tela.getbtnVoltar().addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == this.tela.getbtnBuscar()) {
			
			int id = Integer.parseInt(this.tela.gettextField().getText());
			
			PessoaDAO dao = new PessoaDAO();
			modelo = dao.consultarPessoaPorId(id);
			
			tela.settextArea("Nome: " + modelo.getNome() + " Idade: " + modelo.getIdade());
		
			JOptionPane.showMessageDialog(null, "Busca efetuada com Sucesso");
			
		}
		if(e.getSource() == this.tela.getbtnVoltar()) {
			
			tela.setVisible(false);
		}

	}
}
