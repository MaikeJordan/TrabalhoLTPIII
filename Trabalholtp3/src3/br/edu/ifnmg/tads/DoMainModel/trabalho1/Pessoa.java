/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.DoMainModel.trabalho1;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import javax.swing.JTextField;

/**
 *
 * @author Maike Jordan
 */
public class Pessoa {
    
    private int IdPessoa;
    private String Nome;
    private String CPF;
    private String RG;
    private Date Nascimento;
    private List <Email> Emails;
    private List <Telefone> Telefones;
    private List <Endereco> Enderecos;

     public Pessoa(){
        
        this.IdPessoa = 0;
        this.Nome = "";
        this.CPF = "";
        this.RG = "";
        this.Nascimento = new Date();
        this.Emails = new LinkedList<Email>();
        this.Telefones = new LinkedList<Telefone>();
        this.Enderecos = new LinkedList<Endereco>();
    }
    
    public int getIdPessoa() {
        return IdPessoa;
    }

    public void setIdPessoa(int IdPessoa) {
        this.IdPessoa = IdPessoa;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        if((Nome.length()> 3)||(Nome.length() < 250)) {
            this.Nome = Nome;
        }
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public Date getNascimento() {
        return Nascimento;
    }

    public void setNascimento(Date Nascimento) {
        this.Nascimento = Nascimento;
    }

    public List<Email> getEmails() {
        return Emails;
    }

    public void setEmails(List<Email> Emails) {
        this.Emails = Emails;
    }

    public List<Telefone> getTelefones() {
        return Telefones;
    }

    public void setTelefones(List<Telefone> Telefones) {
        this.Telefones = Telefones;
    }

    public List<Endereco> getEnderecos() {
        return Enderecos;
    }

    public void setEnderecos(List<Endereco> Enderecos) {
        this.Enderecos = Enderecos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.IdPessoa;
        hash = 29 * hash + Objects.hashCode(this.Nome);
        hash = 29 * hash + Objects.hashCode(this.CPF);
        hash = 29 * hash + Objects.hashCode(this.RG);
        hash = 29 * hash + Objects.hashCode(this.Nascimento);
        hash = 29 * hash + Objects.hashCode(this.Emails);
        hash = 29 * hash + Objects.hashCode(this.Telefones);
        hash = 29 * hash + Objects.hashCode(this.Enderecos);
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
        final Pessoa other = (Pessoa) obj;
        if (this.IdPessoa != other.IdPessoa) {
            return false;
        }
        if (!Objects.equals(this.Nome, other.Nome)) {
            return false;
        }
        if (!Objects.equals(this.CPF, other.CPF)) {
            return false;
        }
        if (!Objects.equals(this.RG, other.RG)) {
            return false;
        }
        if (!Objects.equals(this.Nascimento, other.Nascimento)) {
            return false;
        }
        if (!Objects.equals(this.Emails, other.Emails)) {
            return false;
        }
        if (!Objects.equals(this.Telefones, other.Telefones)) {
            return false;
        }
        if (!Objects.equals(this.Enderecos, other.Enderecos)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "IdPessoa=" + IdPessoa + ", Nome=" + Nome + ", CPF=" + CPF + ", RG=" + RG + ", Nascimento=" + Nascimento + ", Emails=" + Emails + ", Telefones=" + Telefones + ", Enderecos=" + Enderecos + '}';
    }

    public void setNome(JTextField txtNome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCPF(JTextField txtCPF) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setRG(JTextField txtRG) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
