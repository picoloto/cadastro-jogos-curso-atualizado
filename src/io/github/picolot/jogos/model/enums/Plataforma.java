package io.github.picolot.jogos.model.enums;

public enum Plataforma {
    PLAYSTATION("Playstation"), XBOX("Xbox"), SWITCH("Switch"), PC("PC");

    private final String descricao;

    Plataforma(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
