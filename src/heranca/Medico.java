package heranca;

public class Medico extends Pessoa {

    private String crm;
    private String especialidade;
    private String ubsAtua;

    public Medico(String nome, int idade, String crm, String especialidade, String ubsAtua) {
        super(nome, idade);
        this.crm = crm;
        this.especialidade = especialidade;
        this.ubsAtua = ubsAtua;
    }

    public String getCrm(){
        return crm;
    }
    public String getEspecialidade(){
        return especialidade;
    }
    public String getUbsAtua(){
        return ubsAtua;
    }

    @Override
    public String getNome(String nome) {
        return null;
    }

    @Override
    public int getIdade(int idade){
        return 0;
    }
}
