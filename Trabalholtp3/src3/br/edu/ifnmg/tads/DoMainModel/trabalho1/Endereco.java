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
public class Endereco {
    
    public int IdEndereco;
    public String Estado;
    public String Cidade;
    public String Bairro;
    public String Rua;
    public int Numero;
    private Pessoa Pssoa;
    
    public Endereco(){
      
      IdEndereco = 0;
      Estado = "";
      Cidade = "";
      Bairro = "";
      Rua = "";
      Numero = 0;
    }

    public int getIdEndereco() {
        return IdEndereco;
    }

    public void setIdEndereco(int IdEndereco) {
        this.IdEndereco = IdEndereco;
    }

    
    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String Rua) {
        this.Rua = Rua;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public Pessoa getPssoa() {
        return Pssoa;
    }

    public void setPssoa(Pessoa Pssoa) {
        this.Pssoa = Pssoa;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + this.IdEndereco;
        hash = 71 * hash + Objects.hashCode(this.Estado);
        hash = 71 * hash + Objects.hashCode(this.Cidade);
        hash = 71 * hash + Objects.hashCode(this.Bairro);
        hash = 71 * hash + Objects.hashCode(this.Rua);
        hash = 71 * hash + this.Numero;
        hash = 71 * hash + Objects.hashCode(this.Pssoa);
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
        final Endereco other = (Endereco) obj;
        if (this.IdEndereco != other.IdEndereco) {
            return false;
        }
        if (!Objects.equals(this.Estado, other.Estado)) {
            return false;
        }
        if (!Objects.equals(this.Cidade, other.Cidade)) {
            return false;
        }
        if (!Objects.equals(this.Bairro, other.Bairro)) {
            return false;
        }
        if (!Objects.equals(this.Rua, other.Rua)) {
            return false;
        }
        if (this.Numero != other.Numero) {
            return false;
        }
        if (!Objects.equals(this.Pssoa, other.Pssoa)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Endereco{" + "IdEndereco=" + IdEndereco + ", Estado=" + Estado + ", Cidade=" + Cidade + ", Bairro=" + Bairro + ", Rua=" + Rua + ", Numero=" + Numero + ", Pssoa=" + Pssoa + '}';
    }
    
}
