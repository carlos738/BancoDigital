1. Classe Banco
   Responsabilidade: A classe Banco é responsável por gerenciar o banco como um todo, incluindo a criação de agências e a impressão de relatórios gerais.

Método criarUmaAgencia(): Cria e retorna uma nova instância de uma agência bancária com um nome e número específicos. Este método é usado para criar uma agência dentro do banco.

Método imprimeRelatorio(Agencia agencia): Imprime um relatório simples da agência. No caso, apenas imprime o nome da agência, mas poderia ser expandido para imprimir mais detalhes, como o número de contas ou os saldos.

2. Classe Agencia
   Responsabilidade: A classe Agencia representa uma agência bancária, que pode ter várias contas associadas a ela. A principal responsabilidade da agência é gerenciar as contas bancárias e gerar relatórios dessas contas.

Atributos:

nome: Nome da agência (exemplo: "Agência Central").

numero: Número de identificação da agência (exemplo: 101).

contas: Lista que armazena as contas associadas a essa agência.

Método criarConta(Cliente cliente, String tipoConta): Cria uma nova conta bancária para um cliente específico, de acordo com o tipo de conta (por exemplo, Conta Corrente ou Conta Poupança). A conta é então adicionada à lista de contas da agência.

Método imprimeRelatorio(): Imprime o relatório de todas as contas da agência, exibindo o extrato de cada uma das contas criadas nela. O método percorre todas as contas associadas à agência e chama o método imprimirExtrato() de cada uma para exibir o saldo.

3. Classe Cliente
   Responsabilidade: A classe Cliente representa um cliente bancário, ou seja, uma pessoa que possui uma conta no banco. A principal função dessa classe é armazenar as informações do cliente, como nome, telefone e endereço.

Atributos:

nome: Nome do cliente (exemplo: "Marta").

numeroTelefone: Número de telefone do cliente (exemplo: 223333444).

endereco: Endereço do cliente (exemplo: "Avenida Floresta").

Não há métodos complexos nesta classe. Ela simplesmente armazena e fornece as informações do cliente.

4. Classe Conta
   Responsabilidade: A classe Conta representa uma conta bancária de um cliente. A responsabilidade principal dessa classe é gerenciar o saldo da conta, realizar depósitos e imprimir extratos.

Atributos:

cliente: O cliente associado a essa conta bancária. Cada conta pertence a um cliente específico.

tipoConta: O tipo de conta bancária (por exemplo, "Poupança" ou "Corrente").

saldo: O saldo da conta, que é inicializado com 0.0 e é modificado ao realizar depósitos.

Método depositar(double valor): Este método permite que o cliente deposite um valor na sua conta. Se o valor do depósito for positivo, ele é somado ao saldo da conta; caso contrário, a operação é rejeitada.

Método imprimirExtrato(): Imprime o extrato da conta, mostrando o tipo de conta, o nome do cliente e o saldo atual da conta.

Constantes TIPO_CONTA_POUPANCA e TIPO_CONTA_CORRENTE: Essas constantes definem os dois tipos possíveis de contas: Poupança e Corrente. Elas ajudam a garantir que apenas valores válidos sejam usados para o tipo de conta.

5. Classe Main
   Responsabilidade: A classe Main é a classe principal que executa o código do sistema bancário. É nela que as instâncias de banco, agência, cliente e conta são criadas e manipuladas. Além disso, os métodos são chamados para simular o comportamento de depósitos nas contas e a impressão dos extratos.

Objetivo: A classe Main simula a criação de uma agência bancária e a criação de contas para diferentes clientes. Em seguida, realiza depósitos nessas contas e imprime os extratos.

Resumo das Responsabilidades de Cada Classe:
Classe Banco: Gerencia o banco, criando agências e imprimindo relatórios gerais.

Classe Agencia: Gerencia uma agência bancária, criando contas e imprimindo relatórios de contas.

Classe Cliente: Armazena informações sobre um cliente bancário.

Classe Conta: Representa uma conta bancária de um cliente, com funcionalidades de depósito e impressão de extrato.

Classe Main: Executa a simulação de criação de clientes, contas e depósitos, e imprime extratos.

Cada classe tem uma responsabilidade clara, o que torna o código mais organizado e fácil de entender, seguindo o princípio de separação de responsabilidades.