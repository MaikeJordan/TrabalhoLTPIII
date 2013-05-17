/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.DataAcess;

import br.edu.ifnmg.tads.DoMainModel.trabalho1.Usuario;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Desktop
 */
public class DAOUsuario {
    private BD bd;

    public DAOUsuario() {
        bd = new BD();
    }

    public boolean Salvar(Usuario obj) {
        try {
            if (obj.getIdCodUsuario() == 0) {
                PreparedStatement comando = bd.getConexao()
                        .prepareStatement("insert into usuario(usuario,senha,idpessoa) values(?,?,?)");
                comando.setString(1, obj.getUsuario());
                comando.setString(2, obj.getSenha());
                DAOCliente dao = new DAOCliente();
                comando.setInt(3, dao.IdPessoa());
                comando.executeUpdate();
            } else {
                PreparedStatement comando = bd.getConexao().
                        prepareStatement("update usuario set usuario = ?, senha = ? where idusuario = ?");
                comando.setString(1, obj.getUsuario());
                comando.setString(2, obj.getSenha());
                comando.executeUpdate();
                
            }
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DAOCliente.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
