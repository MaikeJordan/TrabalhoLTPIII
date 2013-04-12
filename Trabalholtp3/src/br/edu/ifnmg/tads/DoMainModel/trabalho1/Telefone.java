/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.DoMainModel.trabalho1;
/**
 *
 * @author Maike Jordan
 */
public class Telefone {
    private int Numero;
    
    Telefone(){
       Numero = 0;    
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.Numero;
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
        return true;
    }

    @Override
    public String toString() {
        return "Telefone{" + "Numero=" + Numero + '}';
    }
    
}
