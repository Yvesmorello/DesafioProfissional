import java.util.Date;

public class Remedio {

    private String nome;
    private String dataValidade;
    private int quantidade;

    public Remedio(String nome, String dataValidade, int quantidade){
        this.nome = nome;
        this.dataValidade = dataValidade;
        this.quantidade = quantidade;
    }

    public String getNome(){
        return nome;
    }
    public String getDataValidade(){
        return dataValidade;
    }
    public int getQuantidade(){
        return quantidade;
    }
}
