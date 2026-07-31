package banco;

public class ContaBancaria {

    double valor;
    double saldo = 0;
    String nome;
    String extrato = "";

    void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            extrato = extrato + "Deposito: R$" + valor + "\n";
            System.out.println("O valor depositado é R$:" + valor);
        } else {
            System.out.println("O Valor de deposito invalido!");
        }
    }

    void sacar(double valor) {
        if (valor <= saldo) {
            saldo = saldo - valor;
            extrato = extrato + "Saque: R$" + valor + "\n";
            System.out.println("Valor sacado foi R$: " + valor);
        } else {
            System.out.println("O valor para saque  e maior do que tem de saldo");
        }
    }

    void transferir(double valor) {
        if (valor <= saldo) {
            saldo = saldo - valor;
            extrato = extrato + "Deposito: R$" + valor;
            System.out.println("Valor transferido foi R$: " + valor);
        } else {
            System.out.println("O valor de transferencia é maior do que tem de saldo");
        }
    }

    void consultarSaldo() {
        System.out.println("O valor do saldo atual é: " + saldo );
    }

    void alterarTitular(String novoNome) {
        nome = novoNome;
        System.out.println("O nome do titular da conta foi alterado com sucesso para: " + novoNome);
    }

    void consultarExtrato() {
        if (extrato.equals("")) {
            System.out.println("Não foi realizado nenhuma operação!!!");
        } else {
            System.out.println("---------------EXTRATO---------------");
            System.out.println(extrato);
            System.out.println("-------------------------------------");
        }
    }

    void consultarNome() {
        System.out.println("Nome do titular é: " + nome);
    }
}
