import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0, deposito = 0.00, saque = 0.00;
        boolean continuar = true;

        while (continuar) {

        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Consultar saldo");
        System.out.println("4 - Encerrar");
        
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1: 
                    System.out.println("Quanto gostaria de depositar?");
                    deposito = scanner.nextDouble();

                    saldo = saldo + deposito;
                    System.out.println("Saldo atual: " + String.format( "%.2f" ,saldo));
                    break;
                case 2:
                    System.out.println("Quanto gostaria de sacar? ");
                    saque = scanner.nextDouble();
                    
                    if(saldo < saque){
                    System.out.println("Saldo insuficiente!");
                    } else{
                        saldo = saldo - saque;
                        System.out.println("Saldo atual: " + String.format("%.1f", saldo));
                    }
                    break;
                case 3:
                System.out.println("Saldo atual: " + String.format("%.1f", saldo));
                    break;
                case 4:
                    System.out.println("Programa encerrado.");
                    continuar = false; 
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}