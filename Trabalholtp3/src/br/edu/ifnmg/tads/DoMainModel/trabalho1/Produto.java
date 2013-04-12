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
public class Produto {
    
    private int IdProduto;
    private float ValorCompra;
    private float ValorVenda;
    private String Descricao;
    
    Produto(){
    
        IdProduto = 0;
        Descricao = "";
        ValorCompra = 0;
        ValorVenda = 0;  
    
    }

    public int getIdProduto() {
        return IdProduto;
    }

    public void setIdProduto(int IdProduto) {
        this.IdProduto = IdProduto;
    }

    public float getValorCompra() {
        return ValorCompra;
    }

    public void setValorCompra(float ValorCompra) {
        this.ValorCompra = ValorCompra;
    }

    public float getValorVenda() {
        return ValorVenda;
    }

    public void setValorVenda(float ValorVenda) {
        this.ValorVenda = ValorVenda;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.IdProduto;
        hash = 89 * hash + Float.floatToIntBits(this.ValorCompra);
        hash = 89 * hash + Float.floatToIntBits(this.ValorVenda);
        hash = 89 * hash + Objects.hashCode(this.Descricao);
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
        final Produto other = (Produto) obj;
        if (this.IdProduto != other.IdProduto) {
            return false;
        }
        if (Float.floatToIntBits(this.ValorCompra) != Float.floatToIntBits(other.ValorCompra)) {
            return false;
        }
        if (Float.floatToIntBits(this.ValorVenda) != Float.floatToIntBits(other.ValorVenda)) {
            return false;
        }
        if (!Objects.equals(this.Descricao, other.Descricao)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Produto{" + "IdProduto=" + IdProduto + ", ValorCompra=" + ValorCompra + ", ValorVenda=" + ValorVenda + ", Descricao=" + Descricao + '}';
    }
    
}
