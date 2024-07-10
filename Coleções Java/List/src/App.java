public class App {
    public static void main(String[] args)  {
        ListaTarefas listaTarefa = new ListaTarefas();

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 3");
        
 
        System.out.println("O número total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 1");

        System.out.println("O número total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();

        
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.exibirItens();
        carrinho.adicionarItem("Feijao", 5.00, 2);
        carrinho.adicionarItem("Feijao", 5.00, 2);
        carrinho.adicionarItem("Arroz", 10, 2);
        carrinho.exibirItens();
        
        carrinho.removerItem("Feijao");
        carrinho.exibirItens();
        carrinho.calcularValorTotal();
        


    }
}
