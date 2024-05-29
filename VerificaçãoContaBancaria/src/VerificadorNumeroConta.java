import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main(String[] args) {
        String numeroConta;

        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Digite o número da conta: ");
            numeroConta = in.nextLine();

            verificarNumeroConta(numeroConta);
            
            System.out.println("Numero de conta valido.");
        } catch (IllegalArgumentException e) {
            
            System.out.println("Erro: Numero de conta invalido. Digite exatamente 8 digitos. " + e.getMessage());
        } finally {
            // Fechar o scanner para evitar vazamentos de recursos
            in.close();
        }
    }

    private static void verificarNumeroConta(String numeroConta) throws IllegalArgumentException {
        if (numeroConta.length() != 8) {
          throw new IllegalArgumentException();
       
        }
          
        }
    }
