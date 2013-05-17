/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.DataAcess;

import br.edu.ifnmg.tads.DoMainModel.trabalho1.MetodoPagamento;
import br.edu.ifnmg.tads.DoMainModel.trabalho1.Pessoa;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maike
 */
public class DAOMetodoPagamento {
    private BD bd;

    public DAOMetodoPagamento() {
        bd = new BD();
    }

    public boolean Salvar(MetodoPagamento obj) {
        try {
            if (obj.getCodMetodo()== 0) {
                PreparedStatement comando = bd.getConexao().prepareStatement("insert into metodopagamento(descricao) values(?)");
                comando.setString(1, obj.getDescricao());
                comando.executeUpdate();
            } else {
                PreparedStatement comando = bd.getConexao().prepareStatement("update metodopagamento set descricao = ? where idmetodopagamento = ?");
                comando.setString(1, obj.getDescricao());
                comando.setInt(1, obj.getCodMetodo());
                comando.executeUpdate();
            }
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DAOMetodoPagamento.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public List<MetodoPagamento> listarTodos() {
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("select * from metodopagamento ");
            ResultSet resultado = comando.executeQuery();
            // Cria uma lista de Metodos vazia
            List<MetodoPagamento> metodo = new LinkedList<>();
            while (resultado.next()) {
                // Inicializa um objeto de pessoa vazio
                MetodoPagamento tmp = new MetodoPagamento();
                // Pega os valores do retorno da consulta e coloca no objeto
                tmp.setCodMetodo(resultado.getInt("idmetodopagamento"));
		tmp.setDescricao(resultado.getString("descricao"));
		// Pega o objeto e coloca na lista
                metodo.add(tmp);
            }
            return metodo;
        } catch (SQLException ex) {
            Logger.getLogger(DAOMetodoPagamento.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
