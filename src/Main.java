import heranca.Medico;
import java.util.Scanner;
import heranca.Paciente;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Paciente paciente = new Paciente("João", 50, "98546-7452", "Avenida Brasil", "45874521548", "Masculino");
        Paciente paciente1 = new Paciente("Carlos", 20, "91458-7956", "Avenida Colombo", "45871548965", "Masculino");
        Paciente paciente2 = new Paciente("Maria", 34, "94875-1235", "Rua Cuba", "15487956324", "Feminino");
        Paciente paciente3 = new Paciente("Marcia", 87, "98448-4952", "Avenida Tuiuti", "78456965215", "Feminino");
        Paciente paciente4 = new Paciente("Roberto", 20, "98547-4565", "Avenida Colombo", "45871548965", "Masculino");
        Paciente paciente5 = new Paciente("Bruna", 34, "98513-2485", "Rua Cuba", "15487956324", "Feminino");
        Paciente paciente6 = new Paciente("Yasmin", 54, "95421-5689", "Avenida Tuiuti", "78456965215", "Feminino");
        Paciente paciente7 = new Paciente("Rodrigo", 60, "92458-9654", "Avenida Colombo", "45871548965", "Masculino");
        Paciente paciente8 = new Paciente("Maria Eduarda", 34, "93548-7965", "Rua Cuba", "15487956324", "Feminino");
        Paciente paciente9 = new Paciente("Valéria", 87, "95487-9562", "Avenida Tuiuti", "78456965215", "Feminino");
        Paciente paciente10 = new Paciente("Evanir", 20, "95849-6521", "Avenida São Paulo", "45871548965", "Masculino");
        Paciente paciente11 = new Paciente("Júlia", 34, "98745-2156", "Rua das Marguaridas", "15487956324", "Feminino");
        Paciente paciente12 = new Paciente("Eduardo", 40, "90215-4895", "Avenida Tuiuti", "78456965215", "Masculino");
        Paciente paciente13 = new Paciente("Vinicius", 57, "95487-5695", "Avenida Tuiuti", "78456965215", "Masculino");
        Paciente paciente14 = new Paciente("Emanuela", 46, "99856-4215", "Avenida Guaiapó", "78456965215", "Feminino");
        Paciente paciente15 = new Paciente("Gabriela", 25, "95684-5236", "Jardim Paulista", "58496532152", "Feminino");

        Remedio remedio = new Remedio(" ACIDO ACETIL SALICILICO 100MG COMPRIMIDO", "18/11/2023", 100);
        Remedio remedio1 = new Remedio("AZITROMICINA 500MG COMPRIMIDO", "20/06/2024", 150);
        Remedio remedio2 = new Remedio("BUPROPIONA 150MG COMPRIMIDO", "04/05/2024", 200);
        Remedio remedio3 = new Remedio("CEFALEXINA 500MG CAPSULAS OU COMPRIMIDO", "20/11/2024", 250);
        Remedio remedio4 = new Remedio("ACICLOVIR 200MG COMPRIMIDO", "20/06/2024", 150);
        Remedio remedio5 = new Remedio("CAPTOPRIL 25MG COMPRIMIDO", "04/05/2024", 200);
        Remedio remedio6 = new Remedio("CLARITROMICINA 500 MG COMPRIMIDO", "20/11/2024", 250);
        Remedio remedio7 = new Remedio("DIAZEPAM 5MG COMPRIMIDO", "20/06/2024", 150);
        Remedio remedio8 = new Remedio("FENITOINA SODICA 100MG COMPRIMIDO", "04/05/2024", 200);
        Remedio remedio9 = new Remedio("FENOBARBITAL SODICO 100 MG COMPRIMIDO", "20/11/2024", 250);
        Remedio remedio10 = new Remedio("GEL CREME OLEO DE GIRASSOL 10% ALOE VERA 10%", "20/06/2024", 150);
        Remedio remedio11 = new Remedio("GLICOSE 25% 250MG/ML INJETAVEL AMPOLA PLASTICA 10ML", "04/05/2024", 200);
        Remedio remedio12 = new Remedio("IBUPROFENO 600 MG COMPRIMIDO", "20/11/2024", 250);
        Remedio remedio13 = new Remedio("TRACONAZOL 100 MG CÁPSULA", "20/06/2024", 150);
        Remedio remedio14 = new Remedio("METRONIDAZOL 250MG COMPRIMIDO", "04/05/2024", 200);
        Remedio remedio15 = new Remedio("PARACETAMOL 500MG COMPRIMIDO", "20/11/2024", 250);


        Medico medico = new Medico("Marcos", 45, "4555", "Cardiologista", "Ubs Zona 7");
        Medico medico1 = new Medico("Marcelo", 34, "2458", "Pediatra", "Ubs Alvorada 1");
        Medico medico2 = new Medico("Fabiana", 43, "8879", "Alergista", "Ubs Morangueira");
        Medico medico3 = new Medico("Claudia", 50, "2356", "Ortopedista", "Ubs Zona 6");

            System.out.println("1- UBS Zona 7");
            System.out.println("2- UBS Alvorada");
            System.out.println("3- UBS Morangueira");
            System.out.println("4- UBS Zona 6");


            System.out.println("Escolha a UBS que deseja verificar: ");
            String resultado = scanner.next();


            if (resultado.equals("1")) {

                System.out.println("----------------------------------------------------");
                System.out.println("Médico: \n");

                System.out.println("Nome: " + medico.getNome());
                System.out.println("Idade: " + medico.getIdade());
                System.out.println("CRM: " + medico.getCrm());
                System.out.println("Especialidade: " + medico.getEspecialidade());
                System.out.println("UBS: " + medico.getUbsAtua());

                System.out.println("----------------------------------------------------");


                System.out.println();
                System.out.println("----------------------------------------------------");
                System.out.println("Remédio: \n");

                System.out.println("Nome: " + remedio.getNome());
                System.out.println("Data de Validade: " + remedio.getDataValidade());
                System.out.println("Quantidade: " + remedio.getQuantidade());

                System.out.println("----------------------------------------------------");

                System.out.println("Nome: " + remedio1.getNome());
                System.out.println("Data de Validade: " + remedio1.getDataValidade());
                System.out.println("Quantidade: " + remedio.getQuantidade());

                System.out.println("----------------------------------------------------");

                System.out.println("Nome: " + remedio2.getNome());
                System.out.println("Data de Validade: " + remedio2.getDataValidade());
                System.out.println("Quantidade: " + remedio2.getQuantidade());

                System.out.println("----------------------------------------------------");

                System.out.println("Nome: " + remedio3.getNome());
                System.out.println("Data de Validade: " + remedio3.getDataValidade());
                System.out.println("Quantidade: " + remedio3.getQuantidade());


                System.out.println("----------------------------------------------------");

                System.out.println();
                System.out.println("----------------------------------------------------");
                System.out.println("Fila de espera: \n");

                System.out.println("Nome : " + paciente.getNome());
                System.out.println("Nome : " + paciente1.getNome());
                System.out.println("Nome : " + paciente2.getNome());
                System.out.println("Nome : " + paciente3.getNome());

            }

            if (resultado.equals("2")) {

                System.out.println("----------------------------------------------------");
                System.out.println("Médico: \n");

                System.out.println("Nome: " + medico1.getNome());
                System.out.println("Idade: " + medico1.getIdade());
                System.out.println("CRM: " + medico1.getCrm());
                System.out.println("Especialidade: " + medico1.getEspecialidade());
                System.out.println("UBS: " + medico1.getUbsAtua());

                System.out.println("----------------------------------------------------");

                System.out.println();
                System.out.println("----------------------------------------------------");
                System.out.println("Remédio: \n");

                System.out.println("Nome: " + remedio4.getNome());
                System.out.println("Data de Validade: " + remedio4.getDataValidade());
                System.out.println("Quantidade: " + remedio4.getQuantidade());

                System.out.println("----------------------------------------------------");

                System.out.println("Nome: " + remedio5.getNome());
                System.out.println("Data de Validade: " + remedio5.getDataValidade());
                System.out.println("Quantidade: " + remedio5.getQuantidade());

                System.out.println("----------------------------------------------------");

                System.out.println("Nome: " + remedio6.getNome());
                System.out.println("Data de Validade: " + remedio6.getDataValidade());
                System.out.println("Quantidade: " + remedio6.getQuantidade());

                System.out.println("----------------------------------------------------");

                System.out.println("Nome: " + remedio7.getNome());
                System.out.println("Data de Validade: " + remedio7.getDataValidade());
                System.out.println("Quantidade: " + remedio7.getQuantidade());

                System.out.println("----------------------------------------------------");

                System.out.println();
                System.out.println("----------------------------------------------------");
                System.out.println("Fila de espera: \n");

                System.out.println("Nome : " + paciente4.getNome());
                System.out.println("Nome : " + paciente5.getNome());
                System.out.println("Nome : " + paciente6.getNome());
                System.out.println("Nome : " + paciente7.getNome());
            }

            if (resultado.equals("3")) {

                System.out.println("----------------------------------------------------");
                System.out.println("Médico: \n");

                System.out.println("Nome: " + medico2.getNome());
                System.out.println("Idade: " + medico2.getIdade());
                System.out.println("CRM: " + medico2.getCrm());
                System.out.println("Especialidade: " + medico2.getEspecialidade());
                System.out.println("UBS: " + medico2.getUbsAtua());

                System.out.println("----------------------------------------------------");

                System.out.println();
                System.out.println("----------------------------------------------------");
                System.out.println("Remédio: \n");

                System.out.println("Nome: " + remedio8.getNome());
                System.out.println("Data de Validade: " + remedio8.getDataValidade());
                System.out.println("Quantidade: " + remedio8.getQuantidade());

                System.out.println("----------------------------------------------------");

                System.out.println("Nome: " + remedio9.getNome());
                System.out.println("Data de Validade: " + remedio9.getDataValidade());
                System.out.println("Quantidade: " + remedio9.getQuantidade());

                System.out.println("----------------------------------------------------");

                System.out.println("Nome: " + remedio10.getNome());
                System.out.println("Data de Validade: " + remedio10.getDataValidade());
                System.out.println("Quantidade: " + remedio10.getQuantidade());

                System.out.println("----------------------------------------------------");

                System.out.println("Nome: " + remedio11.getNome());
                System.out.println("Data de Validade: " + remedio11.getDataValidade());
                System.out.println("Quantidade: " + remedio11.getQuantidade());

                System.out.println("----------------------------------------------------");

                System.out.println();
                System.out.println("----------------------------------------------------");
                System.out.println("Fila de espera: \n");

                System.out.println("Nome : " + paciente8.getNome());
                System.out.println("Nome : " + paciente9.getNome());
                System.out.println("Nome : " + paciente10.getNome());
                System.out.println("Nome : " + paciente11.getNome());
            }
            if (resultado.equals("4")) {

                System.out.println("----------------------------------------------------");
                System.out.println("Médico: \n");

                System.out.println("Nome : " + medico3.getNome());
                System.out.println("Idade: " + medico3.getIdade());
                System.out.println("CRM: " + medico3.getCrm());
                System.out.println("Especialidade: " + medico3.getEspecialidade());
                System.out.println("UBS: " + medico3.getUbsAtua());

                System.out.println("----------------------------------------------------");

                System.out.println();
                System.out.println("----------------------------------------------------");
                System.out.println("Remédio: \n");

                System.out.println("Nome: " + remedio12.getNome());
                System.out.println("Data de Validade: " + remedio12.getDataValidade());
                System.out.println("Quantidade: " + remedio12.getQuantidade());

                System.out.println("----------------------------------------------------");

                System.out.println("Nome: " + remedio13.getNome());
                System.out.println("Data de Validade: " + remedio13.getDataValidade());
                System.out.println("Quantidade: " + remedio13.getQuantidade());

                System.out.println("----------------------------------------------------");

                System.out.println("Nome: " + remedio14.getNome());
                System.out.println("Data de Validade: " + remedio14.getDataValidade());
                System.out.println("Quantidade: " + remedio14.getQuantidade());

                System.out.println("----------------------------------------------------");

                System.out.println("Nome: " + remedio15.getNome());
                System.out.println("Data de Validade: " + remedio15.getDataValidade());
                System.out.println("Quantidade: " + remedio15.getQuantidade());

                System.out.println("----------------------------------------------------");

                System.out.println();
                System.out.println("----------------------------------------------------");
                System.out.println("Fila de espera: \n");

                System.out.println("Nome : " + paciente12.getNome());
                System.out.println("Nome : " + paciente13.getNome());
                System.out.println("Nome : " + paciente14.getNome());
                System.out.println("Nome : " + paciente15.getNome());
                System.out.println("----------------------------------------------------");
            }

        }
}