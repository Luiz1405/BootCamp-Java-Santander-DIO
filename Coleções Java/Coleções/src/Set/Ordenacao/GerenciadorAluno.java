package Set.Ordenacao;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAluno {

    private Set<Aluno> alunos;

public GerenciadorAluno(){
    this.alunos = new HashSet<>();
}

public void adicionarAluno(String nome, int matricula, double nota){
    alunos.add(new Aluno(nome, matricula, nota));
}

public void removerAluno(int matricula){
    Aluno alunosParaRemover = null;
    if(alunos.isEmpty()){
        throw new RuntimeException("Lista vazia!");

    } else {
        for(Aluno a : alunos) {
            if(a.getMatricula() == matricula){
                alunosParaRemover = a;
                break;
            }
        }
        alunos.remove(alunosParaRemover);

    }

}

public Set<Aluno> exibirAlunosPorNome(){
    Set<Aluno> alunoPorNome = new TreeSet<>(alunos);
    return alunoPorNome;
}

public Set<Aluno> exibirAlunosPorNota(){
    Set<Aluno> alunoPorNota = new TreeSet<>(new ComparatorPorNota());
       alunoPorNota.addAll(alunos);
       return alunoPorNota; 
}

public void exibirAlunos(){
    if(alunos.isEmpty()){
        throw new RuntimeException("Conjunto vazio!");
    }

    System.out.println(alunos);
}

public static void main(String[] args) {
    GerenciadorAluno gerenciadorAluno = new GerenciadorAluno();

    gerenciadorAluno.adicionarAluno("João", 123456, 7.5);
    gerenciadorAluno.adicionarAluno("Maria", 123457, 9.0);
    gerenciadorAluno.adicionarAluno("Carlos", 123458, 5.0);
    gerenciadorAluno.adicionarAluno("Ana", 123459, 6.8);

    System.out.println("Alunos no gerenciador:");
    gerenciadorAluno.exibirAlunos();

    gerenciadorAluno.removerAluno(000);
    gerenciadorAluno.removerAluno(123457);

    System.out.println("Alunos após remoção:");
    gerenciadorAluno.exibirAlunos();

    System.out.println("Alunos ordenados por nome:");
    Set<Aluno> alunosPorNome = gerenciadorAluno.exibirAlunosPorNome();
    System.out.println(alunosPorNome);

    System.out.println("Alunos ordenados por nota:");
    Set<Aluno> alunosPorNota = gerenciadorAluno.exibirAlunosPorNota();
    System.out.println(alunosPorNota);
}
}