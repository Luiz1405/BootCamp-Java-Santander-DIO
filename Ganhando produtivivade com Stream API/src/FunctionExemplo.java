import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
 * É utilizada para transformar, ou mapear os elementos do Stream em outros valores, ou tipos.
 */

public class FunctionExemplo {
    public static void main(String[]args){
        // Criar lista de números inteiros.
        List<Integer> numeros = Arrays.asList(1, 2 , 3 , 4 , 5);

        // Usando a Function com expressão lambda para dobrar todos os números.
        Function<Integer, Integer> dobrar = numero -> numero * 2;


        // Usando a função para dobrar todos os números na Stream e armazená-los em outra lista.
        List<Integer> numerosDobrados = numeros.stream()
        .map(n -> n * 2)
        .toList();

        // Imprimir a lista de números dobrados
        numerosDobrados.forEach(System.out :: println);
    }
    
}
