import java.time.LocalDate;

public class Funcionario {

    private String nome;
    private LocalDate dataAdmissao;
    private int Salario;
    static int Identificador=2023;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public LocalDate getDataAdmissao (){
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao){
        if (dataAdmissao.isAfter(LocalDate.now())) {
            System.out.println("Data de admissão no futuro não é permitida.");
        } else {
            this.dataAdmissao = dataAdmissao;
        }
    }


    public int getSalario(){
        return Salario;
    }

    public void setSalario(int Salario){
        if ( Salario >= 700){
            this.Salario= Salario;

        }else {
            System.out.println(" Salario negativo ");
        }

    }
    public int getIdentificador(){
        return Identificador;
    }
    public void setIdentificador(int Indentificador){
        this.Identificador = Identificador;
    }

}