package Pesquisa;
import java.util.List;
import java.util.ArrayList;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicação;

    public Livro(String titulo, String autor, int anoPublicação){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicação = anoPublicação;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String novoAutor){
        this.autor = novoAutor;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String novoTitulo){
        this.titulo = novoTitulo;
    }

    public int getAnoPublicacao(){
        return anoPublicação;
    }

    public void setAnoPublicacao(int novoAnoPublicacao){
        this.anoPublicação = novoAnoPublicacao;
    }

    public String toString(){
        return "\nTitulo: " + titulo + "\nAutor: " + autor + "\nAno de publicação: " + anoPublicação;
    }


}
