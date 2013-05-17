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
    private Pessoa Pssoa;
    

    public Email() {

        this.NomeEmail = "";
        this.IdEmail = 0;
    }

    public String getNomeEmail() {
        return NomeEmail;
    }

    public void setNomeEmail(String NomeEmail) {
        for (int i = 0; i < NomeEmail.length(); i++) {
            if (NomeEmail.indexOf(i) == '@') {
                for (int x = i; x < NomeEmail.length(); x++) {
                    if (NomeEmail.indexOf(i) == '.') {
                        this.NomeEmail = NomeEmail;
                    }
                }
            }
        }
    }
    

    public int getIdEmail() {
        return IdEmail;
    }

    public void setIdEmail(int IdEmail) {
        this.IdEmail = IdEmail;
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
        hash = 53 * hash + Objects.hashCode(this.NomeEmail);
        hash = 53 * hash + this.IdEmail;
        hash = 53 * hash + Objects.hashCode(this.Pssoa);
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
        if (this.IdEmail != other.IdEmail) {
            return false;
        }
        if (!Objects.equals(this.Pssoa, other.Pssoa)) {
            return false;
        }
        return true;
    }
  
}
