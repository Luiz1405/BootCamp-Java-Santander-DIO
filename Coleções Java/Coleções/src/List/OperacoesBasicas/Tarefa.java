package List.OperacoesBasicas;
public class Tarefa {
    private String descricao;

    public Tarefa(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String novaDescricao){
        this.descricao = novaDescricao;
    }

    @Override
    public String toString(){
        return "\nDescrição: " + descricao;
    }

}
