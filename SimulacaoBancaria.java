import java.util.Scanner;

public class SimulacaoBancaria {
    private static double saldo = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    depositar(scanner);
                    break;
                case 2:
                    sacar(scanner);
                    break;
                case 3:
                    exibirSaldo();
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close(); // Fechar o scanner após o uso
    }

    // Método para exibir o menu
    private static void exibirMenu() {
        System.out.println("\n===== MENU =====");
        System.out.println("1. Depositar");
        System.out.println("2. Sacar");
        System.out.println("3. Ver saldo");
        System.out.println("0. Sair");
    }

    // Método para depositar
    private static void depositar(Scanner scanner) {
        System.out.print("Valor a depositar: ");
        double valor = scanner.nextDouble();
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso. Saldo atual: " + saldo);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    // Método para sacar
    private static void sacar(Scanner scanner) {
        System.out.print("Valor a sacar: ");
        double valor = scanner.nextDouble();
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso. Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }

    // Método para exibir o saldo
    private static void exibirSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }
}
