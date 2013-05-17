/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.DoMainModel.trabalho1;

import java.util.Date;
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
    private List<ItemVenda> itens;
    private Date data;

    public Venda(Pessoa Pessoas, Usuario User, float ValorTotal, int IdVenda, List<ItemVenda> itens, Date data) {
        this.Pessoas = Pessoas;
        this.User = User;
        this.ValorTotal = ValorTotal;
        this.IdVenda = IdVenda;
        this.itens = itens;
        this.data = data;
    }
    
    public Venda() {
        this.Pessoas = null;
        this.User = null;
        this.ValorTotal = 0;
        this.IdVenda = 0;
        this.itens = null;
        this.data = null;
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

    public List<ItemVenda> getItens() {
        return itens;
    }

    public void setItens(List<ItemVenda> itens) {
        this.itens = itens;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    public void add(ItemVenda i){
        if(!itens.contains(i)){
            itens.add(i);
            ValorTotal += i.getProdut().getValorVenda() * i.getQuantidade();
        }
    }
    
    public void remove(ItemVenda i){
        if(itens.contains(i)){
            itens.remove(i);
            ValorTotal -= i.getProdut().getValorVenda() * i.getQuantidade();
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.User);
        hash = 37 * hash + Float.floatToIntBits(this.ValorTotal);
        hash = 37 * hash + Objects.hashCode(this.data);
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
        if (!Objects.equals(this.User, other.User)) {
            return false;
        }
        if (Float.floatToIntBits(this.ValorTotal) != Float.floatToIntBits(other.ValorTotal)) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Venda{" + "Pessoas=" + Pessoas + ", User=" + User + ", ValorTotal=" + ValorTotal + ", IdVenda=" + IdVenda + ", itens=" + itens + ", data=" + data + '}';
    }

}
