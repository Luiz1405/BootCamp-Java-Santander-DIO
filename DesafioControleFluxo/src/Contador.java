import java.util.Scanner;
//import java.util.ParametrosInvalidosException;

public class Contador {

    static void ContaNumeros(int parametro1, int parametro2) throws ParametrosInvalidosException{
        if(parametro1 > parametro2) {
        throw new ParametrosInvalidosException();
        }
        for(int i = parametro1 ; i <= parametro2; i++)
        System.out.println("Imprimindo o número " + i);
    }
    public static void main(String[] args) {
        int parametro1 = 0, parametro2 = 0;

        Scanner in = new Scanner(System.in);

        while(true) {
            
        try {
        System.out.println("Digite o primeiro parametro: ");
        parametro1 = in.nextInt();

        System.out.println("Digite o segundo parametro: ");
        parametro2 = in.nextInt();

        ContaNumeros(parametro1, parametro2);

         }
        catch(ParametrosInvalidosException e ) {
    System.out.println("O primeiro parametro não pode ser maior que o segundo.");
        }

        if(parametro1 > parametro2){
            continue;

        } else {
            break;
        }
    }
        
    }
}
