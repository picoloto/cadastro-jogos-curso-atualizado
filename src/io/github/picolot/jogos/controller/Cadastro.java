package io.github.picolot.jogos.controller;

import java.util.UUID;

public interface Cadastro<T> {
    void salvar(T objeto);

    T buscar(UUID id);

    void deletar(UUID id);

    void atualizar(T objeto);
}
