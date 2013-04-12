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
    
    private List<Pessoa> Pessoas;
    private List<Usuario> User;
    private float ValorTotal;
    private int IdVenda;
    
    Venda(){
    
        this.Pessoas = new LinkedList<Pessoa>();
        this.User = new LinkedList<Usuario>();
        ValorTotal = 0;
        IdVenda = 0; 
        
    }

    public List<Pessoa> getPessoas() {
        return Pessoas;
    }

    public void setPessoas(List<Pessoa> Pessoas) {
        this.Pessoas = Pessoas;
    }

    public List<Usuario> getUser() {
        return User;
    }

    public void setUser(List<Usuario> User) {
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
        hash = 79 * hash + Objects.hashCode(this.Pessoas);
        hash = 79 * hash + Objects.hashCode(this.User);
        hash = 79 * hash + Float.floatToIntBits(this.ValorTotal);
        hash = 79 * hash + this.IdVenda;
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
