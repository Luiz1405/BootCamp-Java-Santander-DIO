import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        String nome;
        int conta = 0, agencia = 0;
        double saldo = 0.00;

        Scanner in = new Scanner(System.in);

        System.out.println("Para criarmos uma conta, vamos precisar de alguns dados.");

        System.out.println("Por favor, insira seu nome: ");
        nome = in.nextLine();

        System.out.println("Insira o número da conta: ");
        conta = in.nextInt();

        System.out.println("Insira o número da agência: ");
        agencia = in.nextInt();

        System.out.println("Insira o seu saldo: ");
        saldo = in.nextDouble();

        ContaBancaria novaconta = new ContaBancaria();

        novaconta.criarConta(nome, conta, agencia, saldo);
    }
}
