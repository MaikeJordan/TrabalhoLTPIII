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
public class ItemCompra {
    
    private int IdItemCompra;
    private int Quantidade;
    private float ValorUnitario;
    private MetodoCompra Metodo;
    private Produto Produt;

    public ItemCompra(int IdItemCompra, int Quantidade, float ValorUnitario, MetodoCompra Metodo, Produto Produt) {
        this.IdItemCompra = IdItemCompra;
        this.Quantidade = Quantidade;
        this.ValorUnitario = ValorUnitario;
        this.Metodo = Metodo;
        this.Produt = Produt;
    }

    public int getIdItemCompra() {
        return IdItemCompra;
    }

    public void setIdItemCompra(int IdItemCompra) {
        this.IdItemCompra = IdItemCompra;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public float getValorUnitario() {
        return ValorUnitario;
    }

    public void setValorUnitario(float ValorUnitario) {
        this.ValorUnitario = ValorUnitario;
    }

    public MetodoCompra getMetodo() {
        return Metodo;
    }

    public void setMetodo(MetodoCompra Metodo) {
        this.Metodo = Metodo;
    }

    public Produto getProdut() {
        return Produt;
    }

    public void setProdut(Produto Produt) {
        this.Produt = Produt;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.IdItemCompra;
        hash = 59 * hash + this.Quantidade;
        hash = 59 * hash + Float.floatToIntBits(this.ValorUnitario);
        hash = 59 * hash + Objects.hashCode(this.Metodo);
        hash = 59 * hash + Objects.hashCode(this.Produt);
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
        final ItemCompra other = (ItemCompra) obj;
        if (this.IdItemCompra != other.IdItemCompra) {
            return false;
        }
        if (this.Quantidade != other.Quantidade) {
            return false;
        }
        if (Float.floatToIntBits(this.ValorUnitario) != Float.floatToIntBits(other.ValorUnitario)) {
            return false;
        }
        if (!Objects.equals(this.Metodo, other.Metodo)) {
            return false;
        }
        if (!Objects.equals(this.Produt, other.Produt)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ItemCompra{" + "IdItemCompra=" + IdItemCompra + ", Quantidade=" + Quantidade + ", ValorUnitario=" + ValorUnitario + ", Metodo=" + Metodo + ", Produt=" + Produt + '}';
    }
    s
}
