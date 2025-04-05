package org.example;

public class Banco {
    public Agencia criarUmaAgencia() {
        return new Agencia();
    }

    public void imprimeRelatorio(Agencia agencia) {
        System.out.println("Relatório do Banco:");
        System.out.println("Relatório da Agência " + agencia.getNome());
        agencia.imprimeRelatorio();
    }
}
