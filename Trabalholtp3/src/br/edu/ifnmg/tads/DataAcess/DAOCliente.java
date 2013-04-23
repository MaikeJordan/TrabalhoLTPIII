/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.DataAcess;

import br.edu.ifnmg.tads.DoMainModel.trabalho1.Pessoa;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author IFNMG
 */
public class DAOCliente {
    private BD bd;

    public DAOCliente() {
        bd = new BD();
    }

    public boolean Salvar(Pessoa obj) {
        try {
            if (obj.getIdPessoa() == 0) {
                PreparedStatement comando = bd.getConexao().prepareStatement("insert into pessoa(nome,cpf) values(?,?)");
                comando.setString(1, obj.getNome());
                comando.setString(2, obj.getCPF());
                comando.executeUpdate();
            } else {
                PreparedStatement comando = bd.getConexao().prepareStatement("update pessoa set nome = ?,valor = ? where idpessoa = ?");
                comando.setString(1, obj.getNome());
                comando.setString(2, obj.getCPF());
                comando.executeUpdate();
            }
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DAOCliente.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }    
}
