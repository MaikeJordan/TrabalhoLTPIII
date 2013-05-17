/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.DataAcess;

import br.edu.ifnmg.tads.DoMainModel.trabalho1.Produto;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author IFNMG
 */
public class DAOProduto {
    private BD bd;

    public DAOProduto() {
        bd = new BD();
    }
    
    public boolean Salvar(Produto obj){
    try{
        if(obj.getIdProduto() == 0){
            PreparedStatement comando = bd.getConexao().prepareStatement("insert int produto(descricao,valorunitvenda,valorunitcompra) values (?,?,?)");
            comando.setString(1, obj.getDescricao());
            comando.setFloat(2, obj.getValorVenda());
            comando.setFloat(3, obj.getValorCompra());
            comando.executeUpdate();   
        } else {
            PreparedStatement comando = bd.getConexao().prepareStatement("insert int produto(descricao,valorunitvenda,valorunitcompra) values (?,?,?)");
            comando.setString(1, obj.getDescricao());
            comando.setFloat(2, obj.getValorVenda());
            comando.setFloat(3, obj.getValorCompra());
            comando.executeUpdate();   
        }
        return true;
    }   catch (SQLException ex) {
            Logger.getLogger(DAOProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
