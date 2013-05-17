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
public class Compra {
    
    private int IdCompra;
    private Produto Produtos;
    private int Quantidade;

    public Compra(int IdCompra, Produto Produtos, int Quantidade) {
        this.IdCompra = IdCompra;
        this.Produtos = Produtos;
        this.Quantidade = Quantidade;
    }

    public int getIdCompra() {
        return IdCompra;
    }

    public void setIdCompra(int IdCompra) {
        this.IdCompra = IdCompra;
    }

    public Produto getProdutos() {
        return Produtos;
    }

    public void setProdutos(Produto Produtos) {
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
        hash = 89 * hash + this.IdCompra;
        hash = 89 * hash + Objects.hashCode(this.Produtos);
        hash = 89 * hash + this.Quantidade;
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
        final Compra other = (Compra) obj;
        if (this.IdCompra != other.IdCompra) {
            return false;
        }
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
        return "Compra{" + "IdCompra=" + IdCompra + ", Produtos=" + Produtos + ", Quantidade=" + Quantidade + '}';
    }

}
