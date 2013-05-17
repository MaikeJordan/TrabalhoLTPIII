/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.DataAcess;

import br.edu.ifnmg.tads.DoMainModel.trabalho1.Email;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Desktop
 */
public class DAOEmail {
    private BD bd;
    
    public DAOEmail(){    
        
        bd = new BD();
    
    }
    
    public boolean Salvar(Email obj) {
        try {
            if (obj.getIdEmail() == 0) {
                PreparedStatement comando = bd.getConexao().prepareStatement("insert into Email(nomeemail,idpessoa) values(?,?)");
                //comando.setInt(1, obj.getIdEmail());
                comando.setString(1, obj.getNomeEmail());
                comando.setInt(2, obj.getPessoa().getIdPessoa());
                comando.executeUpdate();
            } else {
                PreparedStatement comando = bd.getConexao().prepareStatement("update Email set nomeemail = ? where idEmail = ?");
                comando.setString(1, obj.getNomeEmail());
                comando.setInt(2, obj.getIdEmail());
                comando.executeUpdate();
            }
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DAOEmail.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    
    
}
