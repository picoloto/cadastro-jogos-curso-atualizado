package io.github.picolot.jogos.model;

import io.github.picolot.jogos.model.enums.Plataforma;

import java.util.UUID;

public class Jogo {
    private UUID id;
    private String nome;
    private String descricao;
    private Plataforma plataforma;
    private byte[] capa;

    public Jogo() {
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Plataforma getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(Plataforma plataforma) {
        this.plataforma = plataforma;
    }

    public byte[] getCapa() {
        return capa;
    }

    public void setCapa(byte[] capa) {
        this.capa = capa;
    }
}
