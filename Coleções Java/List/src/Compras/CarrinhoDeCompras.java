package Compras;
import java.util.List;
import java.util.ArrayList;

public class CarrinhoDeCompras {

    private List<Item> itensList;

public CarrinhoDeCompras(){
    this.itensList = new ArrayList<>();
}

public void adicionarItem(String nome, double preco, int quantidade){
    itensList.add(new Item(nome, preco, quantidade));
}

public void removerItem(String nome){
    List<Item> itensParaRemover = new ArrayList<>();
    for(Item i : itensList) {
        if(i.getNome().equalsIgnoreCase(nome)){
            itensParaRemover.add(i);
        }

        
    }
    itensList.removeAll(itensParaRemover);
}

public void calcularValorTotal(){
    double valorTotal;
    for(Item i : itensList) {
        valorTotal = i.getPreco() * i.getQuantidade();
        System.out.println("Valor total do item: " + i.getNome() + " é " + valorTotal);
    }
}

public void exibirItens(){
    System.out.println(itensList);
}
    
}


    
