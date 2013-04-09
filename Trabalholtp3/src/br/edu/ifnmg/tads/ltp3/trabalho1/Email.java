/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.ltp3.trabalho1;

/**
 *
 * @author Maike Jordan
 */
public class Email {

    private String NomeEmail;
    private int IdEmail;

    public Email() {

        NomeEmail = "";
        IdEmail = 0;
    }

    public String getNomeEmail() {
        return NomeEmail;
    }

    public void setNomeEmail(String NomeEmail) {
        for (int i = 0; i < NomeEmail.length(); i++) {
            if (NomeEmail.indexOf(i) == '@'){
                this.NomeEmail = NomeEmail;
            } 
        }
    }

    public int getIdEmail() {
        return IdEmail;
    }

    public void setIdEmail(int IdEmail) {
        this.IdEmail = IdEmail;
    }
}
