package br.edu.ifsp.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.edu.ifsp.tela.FrameEdita;
import br.edu.ifsp.tela.FrameInsere;
import br.edu.ifsp.tela.FramePrincipal;
import br.edu.ifsp.tela.FrameRemove;


public class PrincipalController implements ActionListener {

	private FramePrincipal tela;
	
	public PrincipalController(FramePrincipal fp) {
		this.tela = fp;
		this.tela.getbtnInserir().addActionListener(this);
		this.tela.getbtnRemover().addActionListener(this);
		this.tela.getbtnEditar().addActionListener(this);
		this.tela.getbtnBuscar().addActionListener(this);
		this.tela.getbtnListarTodos().addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == this.tela.getbtnInserir()) {
			
			FrameInsere fi = new FrameInsere();
			InserePessoaController pc = new InserePessoaController(fi);
			fi.setVisible(true);
			
		}
		if(e.getSource() == this.tela.getbtnRemover()) {
			
			FrameRemove fr = new FrameRemove();
			RemoveController rc = new RemoveController(fr);
			fr.setVisible(true);
		}
		if(e.getSource() == this.tela.getbtnEditar()) {
			
			FrameEdita fe = new FrameEdita();
			EditaController rc = new EditaController(fe);
			fe.setVisible(true);
		}
	}

}
