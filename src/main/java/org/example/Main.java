package org.example;

public class Main {

    public static void main(String[] args) {
        Banco BancoK = new Banco();

        Agencia agencia = BancoK.criarUmaAgencia();
        BancoK.imprimeRelatorio(agencia);

        Cliente clienteMarta = new Cliente("Marta", 223333444, "Avenida Floresta");
        Cliente clienteMaria = new Cliente("Maria", 1211219009, "Rua D");
        Cliente clienteJhones = new Cliente("Jhones", 0434343342, "Rua Marte");

        Conta contaPoupancaMarta = agencia.criarConta(clienteMarta, Conta.TIPO_CONTA_POUPANCA);
        Conta contaCorrenteMaria = agencia.criarConta(clienteMaria, Conta.TIPO_CONTA_CORRENTE);
        Conta contaCorrenteJhones = agencia.criarConta(clienteJhones, Conta.TIPO_CONTA_POUPANCA);

        // Imprimindo relatórios das contas da agência
        agencia.imprimeRelatorio();

        contaCorrenteMaria.depositar(1453);
        contaCorrenteMaria.imprimirExtrato();

        contaCorrenteJhones.depositar(343);
        contaCorrenteJhones.imprimirExtrato();

        contaPoupancaMarta.depositar(4323);
        contaPoupancaMarta.imprimirExtrato();
    }
}
