package com.sistemacadastro.api.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long Id;

    public String nome;
    public String matricula;
    private String senha;
    public String username;

    public Usuario() {
    }
}

