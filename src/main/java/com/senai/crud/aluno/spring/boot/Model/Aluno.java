package com.senai.crud.aluno.spring.boot.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Aluno {
    @id
    @GeneratedValue(strategy = GenerationType.UUID)
    protected String id;
    protected String nome;
    protected int cpf;
    protected int idAcesso;
    protected String email;
    protected String curso;

    public Aluno(String id, String nome, int cpf, int idAcesso, String email, String curso) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.idAcesso = idAcesso;
        this.email = email;
        this.curso = curso;
    }

    public  String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getIdAcesso() {
        return idAcesso;
    }

    public void setIdAcesso(int idAcesso) {
        this.idAcesso = idAcesso;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}

