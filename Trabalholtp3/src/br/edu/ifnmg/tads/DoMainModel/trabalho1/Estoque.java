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
 * @author Maike Jordans
 */
public class Estoque {
    
    private List<Produto> Produtos;
    private int Quantidade;

    public Estoque() {
        this.Produtos = new LinkedList<Produto>();
        this.Quantidade = 0;
    }

    public List<Produto> getProdutos() {
        return Produtos;
    }

    public void setProdutos(List<Produto> Produtos) {
        this.Produtos = Produtos;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.Produtos);
        hash = 67 * hash + this.Quantidade;
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
        if (!Objects.equals(this.Produtos, other.Produtos)) {
            return false;
        }
        if (this.Quantidade != other.Quantidade) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Estoque{" + "Produtos=" + Produtos + ", Quantidade=" + Quantidade + '}';
    }
    
}
