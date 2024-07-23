package Set.Ordenacao;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtos;

public CadastroProdutos(){
    this.produtos = new HashSet<>();
}

public void adicionarProduto(long codigo, String nome, double preco, int quantidade){
    produtos.add(new Produto(nome, codigo, preco, quantidade));
}

public Set<Produto> exibirProdutosPorNome(){
    Set<Produto> produtoPorNome = new TreeSet<>(produtos);
    return produtoPorNome;
}

public Set<Produto> ExibirProdutosPorPreco(){
    Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
    produtoPorPreco.addAll(produtos);
    return produtoPorPreco;
}

public static void main(String[] args) {
    // Criando uma instância do CadastroProdutos
    CadastroProdutos cadastroProdutos = new CadastroProdutos();

    // Adicionando produtos ao cadastro
    cadastroProdutos.adicionarProduto(1L, "Smartphone", 1000d, 10);
    cadastroProdutos.adicionarProduto(2L, "Notebook", 1500d, 5);
    cadastroProdutos.adicionarProduto(1L, "Mouse", 30d, 20);
    cadastroProdutos.adicionarProduto(4L, "Teclado", 50d, 15);

    // Exibindo todos os produtos no cadastro
    System.out.println(cadastroProdutos.produtos);

    // Exibindo produtos ordenados por nome
    System.out.println(cadastroProdutos.exibirProdutosPorNome());

    // Exibindo produtos ordenados por preço
    System.out.println(cadastroProdutos.ExibirProdutosPorPreco());
  }
}