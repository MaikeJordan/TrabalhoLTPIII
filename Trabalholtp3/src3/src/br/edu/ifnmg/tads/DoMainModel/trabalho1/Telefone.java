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
    
    private String Numero;
    private int IdTelefone;
    private Pessoa Pssoa;
    
    public Telefone(){
       Numero = "";
       IdTelefone = 0;
       Pssoa = null;
    }

    public Telefone(String Numero, int IdTelefone, Pessoa Pssoa) {
        this.Numero = Numero;
        this.IdTelefone = IdTelefone;
        this.Pssoa = Pssoa;
    }

    
    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
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
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.Numero);
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
        if (!Objects.equals(this.Numero, other.Numero)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Telefone{" + "Numero=" + Numero + ", IdTelefone=" + IdTelefone + ", Pssoa=" + Pssoa + '}';
    }
}
