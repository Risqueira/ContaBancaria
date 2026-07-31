/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
        ContaBancaria santander = new ContaBancaria();

        double saldo = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        santander.nome = scanner.nextLine();
        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Transferir");
            System.out.println("4 - Consultar saldo");
            System.out.println("5 - Alterar título");
            System.out.println("6 - Consultar nome do títular");
            System.out.println("7 - Consultar extrato");
            System.out.println("8 - SAIR");
            System.out.print("Escolha uma opção: ");
            System.out.println("===================");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite um valor para depósito: ");
                    double valor = scanner.nextDouble();
                    santander.depositar(valor);
                    break;

                case 2:
                    System.out.println("Digite o valor para saque: ");
                    valor = scanner.nextDouble();
                    santander.sacar(valor);
                    break;

                case 3:
                    System.out.println("Digite o valor para transferir");
                    valor = scanner.nextDouble();
                    santander.transferir(valor);
                    break;

                case 4:
                    System.out.println("Consultar saldo");
                    santander.consultarSaldo();
                    break;

                case 5:
                    System.out.print("Digite o novo nome do titular: ");
                    scanner.nextLine();
                    String novoNome = scanner.nextLine();
                    santander.alterarTitular(novoNome);
                    break;

                case 6:
                    santander.consultarNome();
                    break;

                case 7:
                    santander.consultarExtrato();
                    break;

                case 8:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 8);

    }

}
