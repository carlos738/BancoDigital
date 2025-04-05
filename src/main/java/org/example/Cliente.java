package org.example;

public class Cliente {

    private String nome;
    private long cpf;
    private String endereco;

    public Cliente(String nome, long cpf, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public long getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }


}
