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
    private Produto Produt;
    private boolean ativo;
    
    public ItemVenda(int IdVenda, int Quantidade, Produto Produt, boolean Ativo) {
        this.IdVenda = IdVenda;
        this.Quantidade = Quantidade;
        this.Produt = Produt;
        this.ativo = Ativo;
    }

    public ItemVenda() {
        this.IdVenda = 0;
        this.Quantidade = 0;
        this.Produt = null;
        this.ativo = true;
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

    public Produto getProdut() {
        return Produt;
    }

    public void setProdut(Produto Produt) {
        this.Produt = Produt;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + this.Quantidade;
        hash = 61 * hash + Objects.hashCode(this.Produt);
        hash = 61 * hash + (this.ativo ? 1 : 0);
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
        if (this.Quantidade != other.Quantidade) {
            return false;
        }
        if (!Objects.equals(this.Produt, other.Produt)) {
            return false;
        }
        if (this.ativo != other.ativo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ItemVenda{" + "IdVenda=" + IdVenda + ", Quantidade=" + Quantidade + ", Produt=" + Produt + ", ativo=" + ativo + '}';
    }
    
}
