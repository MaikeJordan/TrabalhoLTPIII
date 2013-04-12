/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.DoMainModel.trabalho1;

import java.util.Objects;

/**
 *
 * @author Maike Jordan
 */
public class ItemVenda {
    
    private int IdVenda;
    private int Quantidade;
    private Produto Produto;

    public ItemVenda() {
        this.IdVenda = 0;
        this.Quantidade = 0;
        this.Produto = Produto;
    }

    public int getIdVenda() {
        return IdVenda;
    }

    public void setIdVenda(int IdVenda) {
        this.IdVenda = IdVenda;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public Produto getProduto() {
        return Produto;
    }

    public void setProduto(Produto Produto) {
        this.Produto = Produto;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + this.IdVenda;
        hash = 61 * hash + this.Quantidade;
        hash = 61 * hash + Objects.hashCode(this.Produto);
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
        final ItemVenda other = (ItemVenda) obj;
        if (this.IdVenda != other.IdVenda) {
            return false;
        }
        if (this.Quantidade != other.Quantidade) {
            return false;
        }
        if (!Objects.equals(this.Produto, other.Produto)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ItemVenda{" + "IdVenda=" + IdVenda + ", Quantidade=" + Quantidade + ", Produto=" + Produto + '}';
    }   
    
}
