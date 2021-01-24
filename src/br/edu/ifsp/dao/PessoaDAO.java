package br.edu.ifsp.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.edu.ifsp.conexao.Conexao;
import br.edu.ifsp.modelo.Pessoa;

public class PessoaDAO {
	
	public Conexao con = null;

	public void salvarPessoa(Pessoa pessoa) {
		
		try {
		
			this.con = Conexao.getInstance();
		
			String sql = "insert into pessoa (nomecompleto, idade) values (?, ?)";
			PreparedStatement pstm = con.getConexao().prepareStatement(sql);
			pstm.setInt(2, pessoa.getIdade());
			pstm.setString(1, pessoa.getNome());
			pstm.executeUpdate();
			
			System.out.println("Foi inserido com sucesso");
			
		} catch(SQLException e) {
			
			System.out.println("Problema ao inserir uma pessoa");
			e.printStackTrace();
		}	
	}
	
	public ArrayList<Pessoa> consultarTodos() {
		
		ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
		
		try {
			
			this.con = Conexao.getInstance();
			
			String sql = "SELECT * FROM pessoa";
			
			PreparedStatement pstm = con.getConexao().prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			
			while(rs.next()) {
				
				Pessoa p = new Pessoa();
				p.setId(rs.getInt("id"));
				p.setNome(rs.getString("nomecompleto"));
				p.setIdade(rs.getInt("idade"));
				
				listaPessoas.add(p);
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
			
		return listaPessoas;
	}
	
	public Pessoa consultarPessoaPorId(int id) {
		
		Pessoa p = new Pessoa();

		try {

			this.con = Conexao.getInstance();

			String sql = "SELECT `nomecompleto`, `idade` FROM `pessoa` WHERE `id` = ?";

			PreparedStatement pstm = con.getConexao().prepareStatement(sql);
			pstm.setInt(1, id);
			ResultSet rs = pstm.executeQuery();
			
			while (rs.next()) {

				p.setNome(rs.getString("nomecompleto"));
				p.setIdade(rs.getInt("idade"));
			}

		} catch(SQLException e) {
			
			System.out.println("Problema ao encontrar uma pessoa");
			e.printStackTrace();
		}
		
		
		return p;
	}
	
	//O HEADER QUE O PROFESSOR PASSOU SÓ TINHA O ID COMO PARAMETRO, NÃO CONSEGUI PENSAR NUMA MANEIRA DE EDITAR
	//SÓ CONSEGUINDO PASSAR O ID, ENTÃO MUDEI PRA RECEBER OS 3 VALORES
	
	public void editarPessoaPorId(int id, String nome, int idade) {
		
		try {
			
			this.con = Conexao.getInstance();
		
			String sql = "UPDATE `pessoa` SET `nomecompleto`= ? ,`idade`= ? WHERE `id` = ?";
			PreparedStatement pstm = con.getConexao().prepareStatement(sql);
			pstm.setString(1, nome);
			pstm.setInt(2, idade);
			pstm.setInt(3, id);
			pstm.executeUpdate();
			
			System.out.println("Foi Editado com sucesso");
			
		} catch(SQLException e) {
			
			System.out.println("Problema ao editar uma pessoa");
			e.printStackTrace();
		}	
		
	}

	public void removerPessoaPorId(int id) {		
		try {
			
			this.con = Conexao.getInstance();
		
			String sql = "DELETE FROM `pessoa` WHERE `id` = ?";
			PreparedStatement pstm = con.getConexao().prepareStatement(sql);
			pstm.setInt(1, id);
			pstm.executeUpdate();
			
			System.out.println("Foi removido com sucesso");
			
		} catch(SQLException e) {
			
			System.out.println("Problema ao remover uma pessoa");
			e.printStackTrace();
		}	
		
	}

}
