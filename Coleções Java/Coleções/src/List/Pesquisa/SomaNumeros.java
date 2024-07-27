package List.Pesquisa;
import java.util.List;
import java.util.ArrayList;

public class SomaNumeros {
    
    private List<Integer> numeros;

public SomaNumeros(){
    this.numeros = new ArrayList<>();
}
public void adicionarNumero(int numero){
    this.numeros.add(numero);
}

public int calcularSoma(){
    int soma = 0;
    if(numeros.isEmpty()){
        throw new RuntimeException("A lista está vazia!");
    } else {
        for(Integer n : numeros) {
            soma += n;
        }
        return soma;
        }
    }

public int encontrarMaiorNumero(){
    int maior = 0;
    if(numeros.isEmpty()){
        throw new RuntimeException("A lista está vazia!");

    } else {
        for(Integer n : numeros){
            if(n > maior){
                maior = n;
            }
        }
        return maior;
        }
    }

public int encontrarMenorNumero(){
    int menor = 1;
    if(numeros.isEmpty()){
        throw new RuntimeException("A lista está vazia!");

    } else {
        for(Integer n : numeros) {
            if(n < menor) {
                menor = n;
            }
        }
        return menor;
    }
}

public void exibirNumeros(){
    if(numeros.isEmpty()){
        throw new RuntimeException("A lista está vazia!");
        } else {
            System.out.println(this.numeros);
        }
}
public static void main(String[] args) {
    // Criando uma instância da classe SomaNumeros
    SomaNumeros somaNumeros = new SomaNumeros();

    // Adicionando números à lista
    somaNumeros.adicionarNumero(5);
    somaNumeros.adicionarNumero(0);
    somaNumeros.adicionarNumero(0);
    somaNumeros.adicionarNumero(-2);
    somaNumeros.adicionarNumero(10);

    // Exibindo a lista de números adicionados
    System.out.println("Números adicionados:");
    somaNumeros.exibirNumeros();

    // Calculando e exibindo a soma dos números na lista
    System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

    // Encontrando e exibindo o maior número na lista
    System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

    // Encontrando e exibindo o menor número na lista
    System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
  }
}

