package com.projeto.projeto.objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "usuario")

public class usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //tirar ou deixar o autoincrement
    @Column(name = "id")
    private int id;

    @Column(name = "nome", length = 30, nullable = true)
    private String nome; 

    @Column(name = "nomedologin", length = 30, nullable = true)
    private String nomedologin;

    @Column(name = "senha", length = 50, nullable = true)
    private String senha;

    @Column(name = "email", length = 50, nullable = true)
    private String email;

    @Column(name = "telefone", length = 11, nullable = true)
    private String telefone;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNomedologin() {
        return nomedologin;
    }
    public void setNomedologin(String nomedologin) {
        this.nomedologin = nomedologin;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
 
}
