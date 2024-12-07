package io.github.picolot.jogos.view;

import io.github.picolot.jogos.model.enums.Plataforma;

import javax.swing.*;

public class TelaCadastro extends JFrame {

    private JLabel labelNome;
    private JLabel labelDescricao;
    private JLabel labelPlataforma;

    private JTextField campoNome;
    private JTextField campoDescricao;
    private JComboBox<Plataforma> campoPlataforma;

    private JButton botaoSalvar;


    public TelaCadastro() {
        construirTela();
    }

    private void construirTela() {
        setSize(600, 500);
        setTitle("Cadastro de Jogos");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        this.adicionarCampos();
        this.adicionarBotoes();
        this.adicionarComponentesFoto();
    }

    private void adicionarCampos() {
        labelNome = new JLabel("Nome:");
        labelNome.setBounds(20, 20, 200, 20);
        getContentPane().add(labelNome);

        campoNome = new JTextField();
        campoNome.setBounds(20, 40, 200, 20);
        getContentPane().add(campoNome);

        labelDescricao = new JLabel("Descrição:");
        labelDescricao.setBounds(20, 60, 200, 20);
        getContentPane().add(labelDescricao);

        campoDescricao = new JTextField();
        campoDescricao.setBounds(20, 80, 200, 20);
        getContentPane().add(campoDescricao);

        labelPlataforma = new JLabel("Plataforma:");
        labelPlataforma.setBounds(20, 100, 200, 20);
        getContentPane().add(labelPlataforma);

        campoPlataforma = new JComboBox<>(Plataforma.values());
        campoPlataforma.setBounds(20, 120, 200, 20);
        getContentPane().add(campoPlataforma);

        botaoSalvar = new JButton("Salvar");
        botaoSalvar.setBounds(20, 160, 100, 20);
        getContentPane().add(botaoSalvar);

    }

    private void adicionarBotoes() {

    }

    private void adicionarComponentesFoto() {

    }
}
