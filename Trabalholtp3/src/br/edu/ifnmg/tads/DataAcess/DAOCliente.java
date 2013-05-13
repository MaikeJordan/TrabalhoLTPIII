/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.DataAcess;

import br.edu.ifnmg.tads.DoMainModel.trabalho1.Pessoa;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maike Jordan
 */
public class DAOCliente {
    private BD bd;

    public DAOCliente() {
        bd = new BD();
    }

    public boolean Salvar(Pessoa obj) {
        try {
            if (obj.getIdPessoa() == 0) {
                PreparedStatement comando = bd.getConexao().prepareStatement("insert into pessoa(nome,cpf,rg,datanascimento) values(?,?,?,?)");
                //comando.setInt(1, obj.getIdPessoa());
                comando.setString(1, obj.getNome());
                comando.setString(2, obj.getCPF());
                comando.setString(3, obj.getRG());                
                java.sql.Date data = new java.sql.Date(obj.getNascimento().getTime());
                comando.setDate(4, data);
                comando.executeUpdate();
            } else {
                PreparedStatement comando = bd.getConexao().prepareStatement("update pessoa set nome = ?, cpf = ?, rg = ?, datanascimento = ? where idpessoa = ?");
                comando.setString(1, obj.getNome());
                comando.setString(2, obj.getCPF());
                comando.setString(3, obj.getRG());
                comando.setInt(4, obj.getIdPessoa());
                java.sql.Date data = new java.sql.Date(obj.getNascimento().getTime());
                comando.setDate(5, data);
                comando.executeUpdate();
            }
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DAOCliente.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public Pessoa Abrir(int id) {
        try {
            Pessoa cliente = new Pessoa();

            PreparedStatement comando = bd.getConexao().prepareStatement("select * from pessoa where idpessoa = ?");
            comando.setInt(1, id);
            ResultSet resultado = comando.executeQuery();
			
            resultado.first();

            cliente.setIdPessoa(resultado.getInt("idpessoa"));
	    cliente.setNome(resultado.getString("nome"));
	    cliente.setCPF(resultado.getString("cpf"));
	    cliente.setRG(resultado.getString("rg"));
	    cliente.setNascimento(resultado.getDate("datanascimento"));
			
            return cliente;

        } catch (SQLException ex) {
            Logger.getLogger(DAOCliente.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public boolean Apagar(Pessoa obj) {
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("delete from pessoa where id = ?");
            comando.setInt(0, obj.getIdPessoa());
            comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DAOCliente.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public List<Pessoa> listarTodos() {
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("select * from pessoa ");
            ResultSet resultado = comando.executeQuery();
            // Cria uma lista de Pessoas vazia
            List<Pessoa> cliente = new LinkedList<>();
            while (resultado.next()) {
                // Inicializa um objeto de pessoa vazio
                Pessoa tmp = new Pessoa();
                // Pega os valores do retorno da consulta e coloca no objeto
                tmp.setIdPessoa(resultado.getInt("idpessoa"));
		tmp.setNome(resultado.getString("nome"));
		tmp.setCPF(resultado.getString("cpf"));
		tmp.setRG(resultado.getString("rg"));
		tmp.setNascimento(resultado.getDate("datanascimento"));
                // Pega o objeto e coloca na lista
                cliente.add(tmp);
            }
            return cliente;
        } catch (SQLException ex) {
            Logger.getLogger(DAOCliente.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public List<Pessoa> buscar(Pessoa filtro) {
        try {
            
            String sql = "select * from pessoa ";
            String where = "";
            
            if(filtro.getNome().length() > 0){
                where = "nome like '%"+filtro.getNome()+"%'";
            }
            
            if(filtro.getCPF().length() > 0){
                where = "cpf like '%"+filtro.getCPF()+"%'";
            }
            
            if(filtro.getRG().length() > 0){
                where = "rg like '%"+filtro.getRG()+"%'";
            }
            
            if(filtro.getNascimento() == null){
                where = "datanascimento = "+filtro.getNascimento();
            }
            
            if (filtro.getIdPessoa() > 0) {
                if(where.length() > 0) 
                    where = where + " and ";
                where = where + " id = " + filtro.getIdPessoa();
            }
            
            if(where.length() > 0){
                sql = sql + " where " + where;
            }
            
            Statement comando = bd.getConexao().createStatement();
            
            ResultSet resultado = comando.executeQuery(sql);
            // Cria uma lista de produtos vazia
            List<Pessoa> cliente = new LinkedList<>();
            while (resultado.next()) {
                // Inicializa um objeto de produto vazio
                Pessoa tmp = new Pessoa();
                // Pega os valores do retorno da consulta e coloca no objeto
                tmp.setIdPessoa(resultado.getInt("idpessoa"));
		tmp.setNome(resultado.getString("nome"));
		tmp.setCPF(resultado.getString("cpf"));
		tmp.setRG(resultado.getString("rg"));
		tmp.setNascimento(resultado.getDate("datanascimento"));
                // Pega o objeto e coloca na lista
                cliente.add(tmp);
            }
            return cliente;
        } catch (SQLException ex) {
            Logger.getLogger(DAOCliente.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
