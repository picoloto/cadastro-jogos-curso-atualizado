package io.github.picolot.jogos.controller;

import io.github.picolot.jogos.model.Jogo;

import javax.swing.*;
import java.util.UUID;

public class CadastroJogo implements Cadastro<Jogo> {

    @Override
    public void salvar(Jogo objeto) {
        JOptionPane.showMessageDialog(null, objeto);
    }

    @Override
    public Jogo buscar(UUID id) {
        return null;
    }

    @Override
    public void deletar(UUID id) {

    }

    @Override
    public void atualizar(Jogo objeto) {

    }
}
