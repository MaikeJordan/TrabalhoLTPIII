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
public class Venda {
    
    private Pessoa Pessoas;
    private Usuario User;
    private float ValorTotal;
    private int IdVenda;

    public Venda(Pessoa Pessoas, Usuario User, float ValorTotal, int IdVenda) {
        this.Pessoas = Pessoas;
        this.User = User;
        this.ValorTotal = ValorTotal;
        this.IdVenda = IdVenda;
    }

    public Pessoa getPessoas() {
        return Pessoas;
    }

    public void setPessoas(Pessoa Pessoas) {
        this.Pessoas = Pessoas;
    }

    public Usuario getUser() {
        return User;
    }

    public void setUser(Usuario User) {
        this.User = User;
    }

    public float getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(float ValorTotal) {
        this.ValorTotal = ValorTotal;
    }

    public int getIdVenda() {
        return IdVenda;
    }

    public void setIdVenda(int IdVenda) {
        this.IdVenda = IdVenda;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.Pessoas);
        hash = 29 * hash + Objects.hashCode(this.User);
        hash = 29 * hash + Float.floatToIntBits(this.ValorTotal);
        hash = 29 * hash + this.IdVenda;
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
        final Venda other = (Venda) obj;
        if (!Objects.equals(this.Pessoas, other.Pessoas)) {
            return false;
        }
        if (!Objects.equals(this.User, other.User)) {
            return false;
        }
        if (Float.floatToIntBits(this.ValorTotal) != Float.floatToIntBits(other.ValorTotal)) {
            return false;
        }
        if (this.IdVenda != other.IdVenda) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Venda{" + "Pessoas=" + Pessoas + ", User=" + User + ", ValorTotal=" + ValorTotal + ", IdVenda=" + IdVenda + '}';
    }  
    
}
