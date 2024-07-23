package Set.Pesquisa;
import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contatos> contatoSet;


public AgendaContatos(){
    this.contatoSet = new HashSet<>();
}

public void adicionarContato(String nome, int numero){
    contatoSet.add(new Contatos(nome, numero));
}

public void exibirContatos(){
    if(contatoSet.isEmpty()){
        throw new RuntimeException("O conjunto está vazio!");

    } else {
        System.out.println(contatoSet);
    }
}

public Set<Contatos> pesquisarPorNome(String nome) {
    Set<Contatos> contatosPorNome = new HashSet<>();
    if (!contatoSet.isEmpty()) {
      for (Contatos c : contatoSet) {
        if (c.getNome().startsWith(nome)) {
          contatosPorNome.add(c);
        }
      }
      return contatosPorNome;
    } else {
      throw new RuntimeException("O conjunto está vazio!");
    }
  }

  public Contatos atualizarNumeroContato(String nome, int novoNumero) {
    Contatos contatoAtualizado = null;
    if(!contatoSet.isEmpty()){
    for(Contatos c : contatoSet) {
        if(c.getNome().equalsIgnoreCase(nome)) {
            c.setNumero(novoNumero);
            contatoAtualizado = c;
            break;
        }
    }
        return contatoAtualizado;
  } else {
    throw new RuntimeException("O conjunto está vazio!");
  }

 }

 public static void main(String[] args) {
    // Criando uma instância da classe AgendaContatos
    AgendaContatos agendaContatos = new AgendaContatos();

    // Exibindo os contatos no conjunto (deve estar vazio)
    agendaContatos.exibirContatos();

    // Adicionando contatos à agenda
    agendaContatos.adicionarContato("João", 123456789);
    agendaContatos.adicionarContato("Maria", 987654321);
    agendaContatos.adicionarContato("Maria Fernandes", 55555555);
    agendaContatos.adicionarContato("Ana", 88889999);
    agendaContatos.adicionarContato("Fernando", 77778888);
    agendaContatos.adicionarContato("Carolina", 55555555);

    // Exibindo os contatos na agenda
    agendaContatos.exibirContatos();

    // Pesquisando contatos pelo nome
    System.out.println(agendaContatos.pesquisarPorNome("Maria"));

    // Atualizando o número de um contato
    Contatos contatoAtualizado = agendaContatos.atualizarNumeroContato("Carolina", 44443333);
    System.out.println("Contato atualizado: " + contatoAtualizado);

    // Exibindo os contatos atualizados na agenda
    System.out.println("Contatos na agenda após atualização:");
    agendaContatos.exibirContatos();

}
}
