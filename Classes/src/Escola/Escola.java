package Escola;

public class Escola {
    public static void main(String[]args){
    Aluno luiz = new Aluno();

    luiz.setNome("Luiz");
    luiz.setIdade(23);

    System.out.println("O aluno " + luiz.getNome() + " tem " + luiz.getIdade() + " anos.");
}
}
