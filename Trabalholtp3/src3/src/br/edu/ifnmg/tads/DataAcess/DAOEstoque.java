/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.DataAcess;

import br.edu.ifnmg.tads.DataAcess.DAOProduto;
import br.edu.ifnmg.tads.DoMainModel.trabalho1.Estoque;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Desktop
 */
public class DAOEstoque {
     private BD bd;
    
    public DAOEstoque(){    
        
        bd = new BD();
    
    }
    
    public boolean Salvar(Estoque obj) {
        try {
            if (obj.getIdEstoque() == 0) {
                PreparedStatement comando = bd.getConexao().
                        prepareStatement("insert into Estoque(quantidade,idproduto) values(?,?)");
                comando.setInt(1, obj.getQuantidade());
                DAOProduto dao = new DAOProduto();
                comando.setInt(2, dao.IdProduto());
                comando.executeUpdate();
            } else {
                PreparedStatement comando = bd.getConexao().
                        prepareStatement("update estoque set quantidade = ? where idProduto = ?");
                comando.setInt(1, obj.getQuantidade());
                comando.setInt(2, obj.getProdutos());
                comando.executeUpdate();
            }
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DAOEstoque.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
