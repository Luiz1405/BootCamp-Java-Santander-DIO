import java.util.Scanner;
public class MainContaBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cria uma nova conta bancária com o saldo inicial
        double saldoInicial = scanner.nextDouble();
        scanner.nextLine();
        ContaBancaria conta = new ContaBancaria(saldoInicial);

        // Lê a Entrada com o valor do depósito e aciona o método "depositar"
        double valorDeposito = scanner.nextDouble();
        scanner.nextLine();
        conta.depositar(valorDeposito);

        // Lê a Entrada com o valor do saque e aciona o método "sacar"
        double valorSaque = scanner.nextDouble();
        scanner.nextLine();
        conta.sacar(valorSaque);

        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}

class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito feito.");
        imprimirSaldo();
    }
}

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente. Saque não realizado.");
        } else {
            saldo -= valor;
            System.out.println("Saque feito.");
        imprimirSaldo();
    }
}
    
    private void imprimirSaldo() {
        System.out.printf("Saldo atual: %.1f\n", this.saldo);
    }
}