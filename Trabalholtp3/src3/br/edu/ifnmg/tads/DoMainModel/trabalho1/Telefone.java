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
public class Telefone {
    
    private int Numero;
    private int IdTelefone;
    private Pessoa Pssoa;
    
    Telefone(){
       Numero = 0;
       IdTelefone = 0;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public int getIdTelefone() {
        return IdTelefone;
    }

    public void setIdTelefone(int IdTelefone) {
        this.IdTelefone = IdTelefone;
    }

    public Pessoa getPssoa() {
        return Pssoa;
    }

    public void setPssoa(Pessoa Pssoa) {
        this.Pssoa = Pssoa;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.Numero;
        hash = 59 * hash + this.IdTelefone;
        hash = 59 * hash + Objects.hashCode(this.Pssoa);
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
        final Telefone other = (Telefone) obj;
        if (this.Numero != other.Numero) {
            return false;
        }
        if (this.IdTelefone != other.IdTelefone) {
            return false;
        }
        if (!Objects.equals(this.Pssoa, other.Pssoa)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Telefone{" + "Numero=" + Numero + ", IdTelefone=" + IdTelefone + ", Pssoa=" + Pssoa + '}';
    }
    
}
