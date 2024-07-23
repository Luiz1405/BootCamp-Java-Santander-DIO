package Set.Pesquisa;

public class Tarefa {

    private String descricao;
    private boolean verificaConclusao;

    public Tarefa(String descricao){
        this.descricao = descricao;
       
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isVerificaConclusao() {
        return verificaConclusao;
    }

    public void setVerificaConclusao(boolean verificaConclusao) {
        this.verificaConclusao = verificaConclusao;
    }

    public String toString(){
        return "\nDescrição: " + descricao + "\nFoi concluída? " + verificaConclusao;
    }
    
}
