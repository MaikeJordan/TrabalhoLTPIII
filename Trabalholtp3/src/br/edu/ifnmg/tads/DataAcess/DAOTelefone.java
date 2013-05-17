/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.DataAcess;

import br.edu.ifnmg.tads.DoMainModel.trabalho1.Telefone;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alisson
 */
public class DAOTelefone {

    private BD bd;
    
    public DAOTelefone(){    
        
        bd = new BD();
    
    }
    
    public boolean Salvar(Telefone obj) {
        try {
            if (obj.getIdTelefone() == 0) {
                PreparedStatement comando = bd.getConexao().
                        prepareStatement("insert into Telefone(numeroTelefone,idpessoa) values(?,?)");
                //comando.setInt(1, obj.getIdTelefone());
                comando.setString(1, obj.getNumero());
                comando.setInt(2, obj.getPssoa().getIdPessoa());
                comando.executeUpdate();
            } else {
                PreparedStatement comando = bd.getConexao().
                        prepareStatement("update Telefone set numeroTelefone = ? where idTelefone = ?");
                comando.setString(1, obj.getNumero());
                comando.setInt(2, obj.getPssoa().getIdPessoa());
                comando.executeUpdate();
            }
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DAOTelefone.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
