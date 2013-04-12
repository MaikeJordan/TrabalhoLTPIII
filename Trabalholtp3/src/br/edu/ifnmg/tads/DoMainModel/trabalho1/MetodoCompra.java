/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.DoMainModel.trabalho1;

import java.util.Objects;

/**
 *
 * @author aluno
 */
public class MetodoCompra {
    
    private int CodMetodoCompra;
    private String Descricao;

    public MetodoCompra(){
        this.CodMetodoCompra = 0;
        this.Descricao = "";
    }

    public int getCodMetodoCompra() {
        return CodMetodoCompra;
    }

    public void setCodMetodoCompra(int CodMetodoCompra) {
        this.CodMetodoCompra = CodMetodoCompra;
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
        hash = 97 * hash + this.CodMetodoCompra;
        hash = 97 * hash + Objects.hashCode(this.Descricao);
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
        final MetodoCompra other = (MetodoCompra) obj;
        if (this.CodMetodoCompra != other.CodMetodoCompra) {
            return false;
        }
        if (!Objects.equals(this.Descricao, other.Descricao)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MetodoCompra{" + "CodMetodoCompra=" + CodMetodoCompra + ", Descricao=" + Descricao + '}';
    }
    
    
    
}
