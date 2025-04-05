package org.example;

public class Conta {

    public static final String TIPO_CONTA_POUPANCA = "Poupança";
    public static final String TIPO_CONTA_CORRENTE = "Corrente";

    private Cliente cliente;
    private String tipo;
    private double saldo;

    public Conta(Cliente cliente, String tipo) {
        this.cliente = cliente;
        this.tipo = tipo;
        this.saldo = 0;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void imprimirExtrato() {
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Tipo de Conta: " + tipo);
        System.out.println("Saldo: R$ " + saldo);
    }
}
