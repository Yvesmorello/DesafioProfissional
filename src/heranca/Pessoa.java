package heranca;

public abstract class  Pessoa {

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public abstract String getNome(String nome);

    public int getIdade(){
        return idade;
    }

    public abstract int getIdade(int idade);
}


