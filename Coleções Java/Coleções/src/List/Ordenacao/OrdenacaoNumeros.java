package List.Ordenacao;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenacaoNumeros  {

    List<Integer> numerosOrdenados;

public OrdenacaoNumeros(){
        this.numerosOrdenados = new ArrayList<>();
}

public void adicionarNumero(int numero) {
    numerosOrdenados.add(numero);
}

public List<Integer> ordenarAscendente(){
    List<Integer> numeroAscendente = new ArrayList<>(numerosOrdenados);
    if(numerosOrdenados.isEmpty()){
        throw new RuntimeException("A lista está vazia!");

    } else {
        Collections.sort(numeroAscendente);
        return numeroAscendente;
    }

}

public List<Integer> ordenarDescendente(){
    List<Integer> numeroDescendente = new ArrayList<>(numerosOrdenados);
    if(numerosOrdenados.isEmpty()){
        throw new RuntimeException("A lista está vazia!");
        
    } else {
       numeroDescendente.sort(Collections.reverseOrder());
       return numeroDescendente;
    }
}

public void exibirNumeros(){
    if(numerosOrdenados.isEmpty()){
        throw new RuntimeException("A lista está vazia!");
        
    } else {
        System.out.println(this.numerosOrdenados);
    }
}
public static void main(String[] args) {
    // Criando uma instância da classe OrdenacaoNumeros
    OrdenacaoNumeros numeros = new OrdenacaoNumeros();

    // Adicionando números à lista
    numeros.adicionarNumero(2);
    numeros.adicionarNumero(5);
    numeros.adicionarNumero(4);
    numeros.adicionarNumero(1);
    numeros.adicionarNumero(99);

    // Exibindo a lista de números adicionados
    numeros.exibirNumeros();

    // Ordenando e exibindo em ordem ascendente
    System.out.println(numeros.ordenarAscendente());

    // Ordenando e exibindo em ordem descendente
    System.out.println(numeros.ordenarDescendente());

    // Exibindo a lista
    numeros.exibirNumeros();
  }
}