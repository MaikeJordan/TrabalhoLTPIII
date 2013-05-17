/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.DataAcess;

import br.edu.ifnmg.tads.DoMainModel.trabalho1.Endereco;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alisson
 */
public class DAOEndereco {
    private BD bd;
    
    public DAOEndereco(){    
        
        bd = new BD();
    
    }
    
    public boolean Salvar(Endereco obj) {
        try {
            if (obj.getIdEndereco() == 0) {
                PreparedStatement comando = bd.getConexao().
                        prepareStatement("insert into Endereco(bairro,cidade,estado,numero,rua,idpessoa) values(?,?,?,?,?,?)");
                comando.setString(1, obj.getBairro());
                comando.setString(2, obj.getCidade());
                comando.setString(3, obj.getEstado());
                comando.setInt(4, obj.getNumero());
                comando.setString(5, obj.getRua());
                comando.setInt(6, obj.getPssoa().getIdPessoa());
                comando.executeUpdate();
            } else {                            
                PreparedStatement comando = bd.getConexao().
                        prepareStatement("update Endereco set bairro = ?, cidade = ?, rua = ?, estado  = ?, numero = ? where idendereco = ?");
                comando.setString(1, obj.getBairro());
                comando.setString(2, obj.getCidade());
                comando.setString(3, obj.getRua());
                comando.setString(4, obj.getEstado());
                comando.setInt(5, obj.getNumero());
                comando.setInt(6, obj.getIdEndereco());    
                comando.executeUpdate();
            }
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DAOEndereco.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }    
}
