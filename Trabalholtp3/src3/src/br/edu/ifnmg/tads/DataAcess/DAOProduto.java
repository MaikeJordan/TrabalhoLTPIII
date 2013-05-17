/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.DataAcess;

import br.edu.ifnmg.tads.DoMainModel.trabalho1.Produto;
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
 * @author Desktop
 */
public class DAOProduto {
    private BD bd;

    public DAOProduto() {
        bd = new BD();
    }

    public boolean Salvar(Produto obj) {
        try {
            if (obj.getIdProduto()== 0) {
                PreparedStatement comando = bd.getConexao().
                        prepareStatement("insert into produto(descricao,vlrunitvenda,vlrunitcompra) values(?,?,?)");
                comando.setString(1, obj.getDescricao());
                comando.setDouble(2, obj.getValorVenda());
                comando.setDouble(3, obj.getValorCompra());
                comando.executeUpdate();
            } else {
                PreparedStatement comando = bd.getConexao().
                        prepareStatement("update produto set descricao = ?, vlrunitvenda = ?, vlrunitcompra where idproduto = ?");
                comando.setString(1, obj.getDescricao());
                comando.setDouble(2, obj.getValorVenda());
                comando.setDouble(3, obj.getValorCompra());
                comando.setInt(4, obj.getIdProduto());
                comando.executeUpdate();
            }
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DAOProduto.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public Produto Abrir(int id) {
        try {
            Produto produto = new Produto(0, 0, 0, "");
            PreparedStatement comando = bd.getConexao().prepareStatement("select * from produto where idproduto = ?");
            comando.setInt(1, id);
            ResultSet resultado = comando.executeQuery();
            resultado.first();
            produto.setIdProduto(resultado.getInt("idproduto"));
            produto.setDescricao(resultado.getString("descricao"));
            produto.setValorVenda(resultado.getFloat("VlrUnitVenda"));
            produto.setValorCompra(resultado.getFloat("VlrUnitCompra"));
            return produto;

        } catch (SQLException ex) {
            Logger.getLogger(DAOProduto.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean Apagar(Produto obj) {
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("delete from produto where idproduto = ?");
            comando.setInt(0, obj.getIdProduto());
            comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DAOProduto.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public List<Produto> listarTodos() {
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("select * from produto ");
            ResultSet resultado = comando.executeQuery();
            // Cria uma lista de produtos vazia
            List<Produto> produtos = new LinkedList<>();
            while (resultado.next()) {
                // Inicializa um objeto de produto vazio
                Produto tmp = new Produto();
                // Pega os valores do retorno da consulta e coloca no objeto
                tmp.setIdProduto(resultado.getInt("idproduto"));
                tmp.setDescricao(resultado.getString("descricao"));
                tmp.setValorVenda(resultado.getFloat("VlrUnitVenda"));
                tmp.setValorCompra(resultado.getFloat("VlrUnitCompra"));
                // Pega o objeto e coloca na lista
                produtos.add(tmp);
            }
            return produtos;
        } catch (SQLException ex) {
            Logger.getLogger(DAOProduto.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public List<Produto> buscar(Produto filtro) {
        try {
            
            String sql = "select * from produto ";
            String where = "";
            
            if(filtro.getDescricao().length() > 0){
                where = "nome like '%"+filtro.getDescricao()+"%'";
            }
            
            if (filtro.getValorVenda()> 0) {
                if(where.length() > 0) 
                    where = where + " and ";
                where = where + " valor = " + filtro.getValorVenda();
            }
            if (filtro.getIdProduto()> 0) {
                if(where.length() > 0) 
                    where = where + " and ";
                where = where + " id = " + filtro.getIdProduto();
            }
            
            if(where.length() > 0){
                sql = sql + " where " + where;
            }
            
            Statement comando = bd.getConexao().createStatement();
            
            ResultSet resultado = comando.executeQuery(sql);
            // Cria uma lista de produtos vazia
            List<Produto> produtos = new LinkedList<>();
            while (resultado.next()) {
                // Inicializa um objeto de produto vazio
                Produto tmp = new Produto();
                // Pega os valores do retorno da consulta e coloca no objeto
                tmp.setIdProduto(resultado.getInt("idproduto"));
                tmp.setDescricao(resultado.getString("descricao"));
                tmp.setValorVenda(resultado.getFloat("VlrUnitVenda"));
                tmp.setValorCompra(resultado.getFloat("VlrUnitCompra"));
                // Pega o objeto e coloca na lista
                produtos.add(tmp);
            }
            return produtos;
        } catch (SQLException ex) {
            Logger.getLogger(DAOProduto.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public int IdProduto(){
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("select max(idProduto) from produto ");
            ResultSet resultado = comando.executeQuery();
            resultado.first();
            int Id = resultado.getInt("max(idProduto)");
            return Id;
        } catch (SQLException ex) {
            Logger.getLogger(DAOCliente.class.getName()).log(Level.SEVERE, null, ex);
            return 0;           
        }   
    } 
    
}
