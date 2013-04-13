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
public class Usuario {
    
    private int IdCodUsuario;
    private String Senha;
    private String Usuario;
    private Pessoa DadosPessoais;

    public Usuario(int IdCodUsuario, String Senha, String Usuario, Pessoa DadosPessoais) {
        this.IdCodUsuario = IdCodUsuario;
        this.Senha = Senha;
        this.Usuario = Usuario;
        this.DadosPessoais = DadosPessoais;
    }

    public int getIdCodUsuario() {
        return IdCodUsuario;
    }

    public void setIdCodUsuario(int IdCodUsuario) {
        this.IdCodUsuario = IdCodUsuario;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public Pessoa getDadosPessoais() {
        return DadosPessoais;
    }

    public void setDadosPessoais(Pessoa DadosPessoais) {
        this.DadosPessoais = DadosPessoais;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + this.IdCodUsuario;
        hash = 23 * hash + Objects.hashCode(this.Senha);
        hash = 23 * hash + Objects.hashCode(this.Usuario);
        hash = 23 * hash + Objects.hashCode(this.DadosPessoais);
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
        final Usuario other = (Usuario) obj;
        if (this.IdCodUsuario != other.IdCodUsuario) {
            return false;
        }
        if (!Objects.equals(this.Senha, other.Senha)) {
            return false;
        }
        if (!Objects.equals(this.Usuario, other.Usuario)) {
            return false;
        }
        if (!Objects.equals(this.DadosPessoais, other.DadosPessoais)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuario{" + "IdCodUsuario=" + IdCodUsuario + ", Senha=" + Senha + ", Usuario=" + Usuario + ", DadosPessoais=" + DadosPessoais + '}';
    }

           
}
