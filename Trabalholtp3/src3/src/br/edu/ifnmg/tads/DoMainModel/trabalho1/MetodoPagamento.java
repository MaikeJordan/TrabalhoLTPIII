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
public class MetodoPagamento {
    
    private int CodMetodo;
    private String Descricao;

    public MetodoPagamento(int CodMetodo, String Descricao) {
        this.CodMetodo = CodMetodo;
        this.Descricao = Descricao;
    }

    public MetodoPagamento() {
        this.CodMetodo = 0;
        this.Descricao = "";
    }

    public int getCodMetodo() {
        return CodMetodo;
    }

    public void setCodMetodo(int CodMetodo) {
        this.CodMetodo = CodMetodo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + this.CodMetodo;
        hash = 61 * hash + Objects.hashCode(this.Descricao);
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
        final MetodoPagamento other = (MetodoPagamento) obj;
        if (this.CodMetodo != other.CodMetodo) {
            return false;
        }
        if (!Objects.equals(this.Descricao, other.Descricao)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MetodoPagamento{" + "CodMetodo=" + CodMetodo + ", Descricao=" + Descricao + '}';
    }
}
