package io.github.picolot.jogos.model;

import io.github.picolot.jogos.model.enums.Plataforma;

import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

public class Jogo implements Comparable<Jogo> {
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Jogo jogo = (Jogo) o;
        return Objects.equals(id, jogo.id) && Objects.equals(nome, jogo.nome) && Objects.equals(descricao, jogo.descricao) && plataforma == jogo.plataforma && Arrays.equals(capa, jogo.capa);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(id);
        result = 31 * result + Objects.hashCode(nome);
        result = 31 * result + Objects.hashCode(descricao);
        result = 31 * result + Objects.hashCode(plataforma);
        result = 31 * result + Arrays.hashCode(capa);
        return result;
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", plataforma=" + plataforma +
                ", capa=" + Arrays.toString(capa) +
                '}';
    }

    @Override
    public int compareTo(Jogo o) {
        return this.nome.compareTo(o.getNome());
    }
}
