/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.DoMainModel.trabalho1;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Maike Jordan
 */
public class Estoque {
    
    private int Produtos;
    private int Quantidade;
    private int IdEstoque;

    public Estoque(int Produtos, int Quantidade, int Estoque) {
        this.Produtos = Produtos;
        this.Quantidade = Quantidade;
        this.IdEstoque = Estoque;
    }
    
    public Estoque() {
        this.Produtos = 0;
        this.Quantidade = 0;
        this.IdEstoque = 0;
    }

    public int getProdutos() {
        return Produtos;
    }

    public void setProdutos(int Produtos) {
        this.Produtos = Produtos;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public int getIdEstoque() {
        return IdEstoque;
    }

    public void setIdEstoque(int IdEstoque) {
        this.IdEstoque = IdEstoque;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.Quantidade;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Estoque other = (Estoque) obj;
        if (this.Quantidade != other.Quantidade) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Estoque{" + "Produtos=" + Produtos + ", Quantidade=" + Quantidade + ", IdEstoque=" + IdEstoque + '}';
    }

      
    
}
