package Set.Pesquisa;
import java.util.HashSet;
import java.util.Set;

public class ListaTarefas{
    private Set<Tarefa> listaTarefas;


public ListaTarefas(){
    this.listaTarefas = new HashSet<>();
}

public void adicionarTarefa(String descricao){
    listaTarefas.add(new Tarefa(descricao));
}

public void removerTarefa(String descricao){
    Tarefa tarefasParaRemover = null;
    if(listaTarefas.isEmpty()){
        throw new RuntimeException("O conjunto está vazio!");

    } else {
        for (Tarefa t : listaTarefas){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover = t;
                break;
            }
        }
            listaTarefas.remove(tarefasParaRemover);   
    }

    if(tarefasParaRemover == null) {
        System.out.println("Tarefa não encontrada!");
      }
    
}

public void exibirTarefas(){
    if(listaTarefas.isEmpty()){
        throw new RuntimeException("A lista está vazia!");

    } else {
        System.out.println(listaTarefas);
    }
}

public int contarTarefas(){
    return listaTarefas.size();
}

public Set<Tarefa> obterTarefasConcluidas(){
    Set<Tarefa> tarefasConluidas = new HashSet<>();
    if(listaTarefas.isEmpty()){
        throw new RuntimeException("A lista está vazia!");

    } else {
        for(Tarefa t : listaTarefas) {
            if(t.isVerificaConclusao() == true){
                tarefasConluidas.add(t);
            }
        }
        return tarefasConluidas;
    }
}

public Set<Tarefa> obterTarefasPendentes(){
    Set<Tarefa> tarefasPendentes = new HashSet<>();
    if(listaTarefas.isEmpty()){
        throw new RuntimeException("A lista está vazia!");

    } else {
        for(Tarefa t : listaTarefas) {
            if(t.isVerificaConclusao() == false){
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }
}

public void marcarTarefaConcluida(String descricao){
    if(listaTarefas.isEmpty()){
        throw new RuntimeException("A lista está vazia!");

    } else {
        for(Tarefa t : listaTarefas){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setVerificaConclusao(true);
                break;
            }
        }
    }
}

public void marcarTarefaPendente(String descricao){
    if(listaTarefas.isEmpty()){
        throw new RuntimeException("A lista está vazia!");

    } else {
        for(Tarefa t : listaTarefas){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setVerificaConclusao(false);
                break;
            }
        }
    }
}

public void limparListaTarefas(){
    listaTarefas.clear();
    System.out.println("Lista limpa com sucesso!");
}

public static void main(String[] args) {
    // Criando uma instância da classe ListaTarefas
    ListaTarefas listaTarefas = new ListaTarefas();

    // Adicionando tarefas à lista
    listaTarefas.adicionarTarefa("Estudar Java");
    listaTarefas.adicionarTarefa("Fazer exercícios físicos");
    listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
    listaTarefas.adicionarTarefa("Ler livro");
    listaTarefas.adicionarTarefa("Preparar apresentação");

    // Exibindo as tarefas na lista
    listaTarefas.exibirTarefas();

    // Removendo uma tarefa
    listaTarefas.removerTarefa("Fazer exercícios físicos");
    listaTarefas.exibirTarefas();

    // Contando o número de tarefas na lista
    System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

    // Obtendo tarefas pendentes
    System.out.println(listaTarefas.obterTarefasPendentes());

    // Marcando tarefas como concluídas
    listaTarefas.marcarTarefaConcluida("Ler livro");
    listaTarefas.marcarTarefaConcluida("Estudar Java");

    // Obtendo tarefas concluídas
    System.out.println(listaTarefas.obterTarefasConcluidas());

    // Marcando tarefas como pendentes
    listaTarefas.marcarTarefaPendente("Estudar Java");
    listaTarefas.exibirTarefas();

    // Limpando a lista de tarefas
    listaTarefas.limparListaTarefas();
    listaTarefas.exibirTarefas();
  }
}
