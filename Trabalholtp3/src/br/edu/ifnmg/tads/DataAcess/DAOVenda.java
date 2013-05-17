/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.DataAcess;

import br.edu.ifnmg.tads.DoMainModel.trabalho1.ItemVenda;
import br.edu.ifnmg.tads.DoMainModel.trabalho1.Venda;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maike Jordan
 */
public class DAOVenda {
    
    private BD bd;

    public DAOVenda() {
        bd = new BD();
    }

    public boolean Salvar(Venda obj) {
        try {
            if (obj.getIdVenda() == 0) {
                PreparedStatement comando = bd.getConexao().
                        prepareStatement("insert into venda(valorTotal, data, idpessoa, idusuario) values(?,?,?,?)");
                comando.setFloat(1, obj.getValorTotal());
                java.sql.Date dt = new java.sql.Date(obj.getData().getTime());
                comando.setDate(2, dt);
                comando.setInt(3, obj.getPessoas().getIdPessoa());
                comando.setInt(4, obj.getUser().getIdCodUsuario());
                comando.executeUpdate();
            } 

            for (ItemVenda iv : obj.getItens()) {
                if (iv.isAtivo()) {
                    if (iv.getIdVenda() == 0) {
                        PreparedStatement comando = bd.getConexao().
                                prepareStatement("insert into itemvenda(idvenda, idproduto, quantidade) values(?,?,?)");
                        comando.setInt(1, obj.getIdVenda());
                        comando.setInt(2, iv.getProdut().getIdProduto());
                        comando.setInt(3, iv.getQuantidade());
                        comando.executeUpdate();
                    } else {
                        PreparedStatement comando = bd.getConexao().prepareStatement("update itemvenda set idproduto = ?, quantidade = ? where iditemvenda = ?");
                        comando.setInt(1, iv.getProdut().getIdProduto());
                        comando.setInt(2, iv.getQuantidade());
                        comando.setInt(3, obj.getIdVenda());
                        comando.executeUpdate();
                    }
                } else {
                    PreparedStatement comando = bd.getConexao().
                            prepareStatement("delete from itemvenda where iditemvenda = ?");
                    comando.setInt(1, obj.getIdVenda());
                    comando.executeUpdate();
                }
            }

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DAOVenda.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
