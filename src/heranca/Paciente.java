package heranca;

public class Paciente extends Pessoa {

    private String cpf;
    private String endereco;
    private String telefone;
    private String sexo;

    public Paciente (String nome, int idade, String telefone, String endereco, String cpf, String sexo) {
        super(nome, idade);
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.sexo = sexo;
    }

    public String getTelefone(){
        return telefone;
    }
    public String getEndereco(){
        return endereco;
    }
    public String getCpf(){
        return cpf;
    }
    public String getSexo(){
        return sexo;
    }

    @Override
    public String getNome(String nome) {
        return null;
    }

    @Override
    public int getIdade(int idade) {
        return 0;
    }
}
