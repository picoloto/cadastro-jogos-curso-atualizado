package io.github.picolot.jogos.controller;

import io.github.picolot.jogos.model.Jogo;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CadastroJogo implements Cadastro<Jogo> {

    private List<Jogo> jogos;

    public CadastroJogo() {
        this.jogos = new ArrayList<>();
    }

    @Override
    public void salvar(Jogo objeto) {
        this.jogos.add(objeto);
        imprimirRegistros();
    }

    @Override
    public Jogo buscar(UUID id) {
        return jogos.stream().filter(jogo -> jogo.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public void deletar(UUID id) {
        jogos.removeIf(r -> r.getId().equals(id));
    }

    @Override
    public void atualizar(Jogo objeto) {

    }

    @Override
    public void imprimirRegistros() {
        jogos.forEach(System.out::println);
    }
}
