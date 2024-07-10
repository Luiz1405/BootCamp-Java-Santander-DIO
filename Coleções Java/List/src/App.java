public class App {
    public static void main(String[] args)  {
        ListaTarefas listaTarefa = new ListaTarefas();

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 3");
        

        System.out.println("O número total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());

        //listaTarefa.removerTarefa("Tarefa 1");

        System.out.println("O número total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();

    }
}
