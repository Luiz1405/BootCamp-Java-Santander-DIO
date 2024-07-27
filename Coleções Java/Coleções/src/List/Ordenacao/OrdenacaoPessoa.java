package List.Ordenacao;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;



public class OrdenacaoPessoa{

    private List<Pessoa> pessoasList;

    public OrdenacaoPessoa(){
        this.pessoasList = new ArrayList<>();
    }

    public void adicionarPessoas(String nome, int idade, double altura){
        pessoasList.add(new Pessoa(nome, idade, altura));
        
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoasList);
        if(!pessoasList.isEmpty()){
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;

        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoasList);
        if (!pessoasList.isEmpty()) {
          Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
          return pessoasPorAltura;
        } else {
          throw new RuntimeException("A lista está vazia!");
        }
      }

      public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoPessoas
          OrdenacaoPessoa ordenacaoPessoas = new OrdenacaoPessoa();
      
          // Adicionando pessoas à lista
          ordenacaoPessoas.adicionarPessoas("Alice", 20, 1.56);
          ordenacaoPessoas.adicionarPessoas("Bob", 30, 1.80);
          ordenacaoPessoas.adicionarPessoas("Charlie", 25, 1.70);
          ordenacaoPessoas.adicionarPessoas("David", 17, 1.56);
      
          // Exibindo a lista de pessoas adicionadas
          System.out.println(ordenacaoPessoas.pessoasList);
      
          // Ordenando e exibindo por idade
          System.out.println(ordenacaoPessoas.ordenarPorIdade());
      
          // Ordenando e exibindo por altura
          System.out.println(ordenacaoPessoas.ordenarPorAltura());
        }
      }