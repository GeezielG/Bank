# Sistema Bancário Simples em Java

Este projeto implementa um sistema bancário simples com funcionalidades de **depósito** e **saque**, além de um tratamento robusto de **exceções personalizadas**.

## 🚀 Funcionalidades

- Criar uma conta bancária com número, titular, saldo inicial e limite de saque.
- Realizar depósitos.
- Realizar saques com verificação de:
  - Saldo suficiente.
  - Limite máximo permitido para saque.
- Tratamento de exceções personalizadas para regras de negócio.
- Tratamento de exceções para erros de entrada do usuário.

## 📁 Estrutura do Projeto

```
src/
├── application/
│   └── Program.java          # Classe principal com entrada de dados e execução do programa
├── entities/
│   └── Account.java          # Classe que representa a conta bancária
└── exceptions/
    └── BusinessExceptions.java # Exceção personalizada para regras de negócio
```

## 🧠 Lógica de Negócio

### Classe `Account`

- Métodos principais:
  - `deposit(Double amountDeposit)`: Adiciona saldo à conta e informa sucesso no depósito.
  - `withdraw(Double amount)`: Permite saque apenas se o valor for menor que o saldo e o limite de saque.

### Classe `BusinessExceptions`

- Exceção personalizada que estende `RuntimeException`, usada para validar regras específicas como:
  - Saque maior que o saldo.
  - Saque maior que o limite permitido.

### Classe `Program`

- Realiza entrada de dados via `Scanner`.
- Cria uma instância de `Account`.
- Executa depósito e saque, tratando exceções de forma apropriada:
  - `InputMismatchException` para entradas inválidas.
  - `BusinessExceptions` para regras do negócio.

## 💻 Como Executar

1. Compile os arquivos:

```bash
javac application/Program.java entities/Account.java exceptions/BusinessExceptions.java
```

2. Execute o programa:

```bash
java application.Program
```

3. Siga as instruções no terminal para inserir os dados da conta, valor de depósito e de saque.

## 🧪 Exemplo de Uso

```
Enter account data
Number: 123
Holder: João da Silva
Initial balance: 1000.0
Withdraw limit: 500.0
Enter amount for withdraw: 200.0
Deposit a value: 300.0
```

---

## 📌 Requisitos

- Java 8 ou superior
- Terminal ou IDE compatível com Java (como IntelliJ, Eclipse, VS Code)

---

Feito com 💙 para fins educativos e demonstração de tratamento de exceções em Java.
