package org.example;


import java.util.ArrayList;
import java.util.List;

public class Agencia {
    private String nome = "Agência Central";
    private List<Conta> contas = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public Conta criarConta(Cliente cliente, String tipoConta) {
        Conta conta = new Conta(cliente, tipoConta);
        contas.add(conta);
        return conta;
    }

    public void imprimeRelatorio() {
        System.out.println("\nRelatório da Agência:");
        for (Conta conta : contas) {
            conta.imprimirExtrato();
        }
    }
}
