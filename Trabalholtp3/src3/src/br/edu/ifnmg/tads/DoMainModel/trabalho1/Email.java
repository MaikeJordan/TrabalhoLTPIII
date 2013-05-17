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
public class Email {

    private String NomeEmail;
    private int IdEmail;
    private Pessoa pessoa;
    
    public Email(int CodEmail, Pessoa pesso, String Nomeemail){
    
        pessoa = pesso;
        IdEmail = CodEmail;  
        NomeEmail = Nomeemail;
    }
    
    public Email() {

        this.NomeEmail = "";
        this.IdEmail = 0;
    }

    public String getNomeEmail() {
        return NomeEmail;
    }

    public void setNomeEmail(String NomeEmail) {
        this.NomeEmail = NomeEmail;
    }

    public int getIdEmail() {
        return IdEmail;
    }

    public void setIdEmail(int IdEmail) {
        this.IdEmail = IdEmail;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.NomeEmail);
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
        final Email other = (Email) obj;
        if (!Objects.equals(this.NomeEmail, other.NomeEmail)) {
            return false;
        }
        return true;
    }
    

    @Override
    public String toString() {
        return "Email{" + "NomeEmail=" + NomeEmail + ", IdEmail=" + IdEmail + ", pessoa=" + pessoa + '}';
    }

    
}
