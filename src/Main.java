import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();
        Funcionario funcionario3 = new Funcionario();


        funcionario1.setNome("Joao");
        funcionario1.setDataAdmissao(LocalDate.of(2022, 2, 15));
        funcionario1.setSalario(20000);

        System.out.println("Funcionário 1:");
        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Data de Admissao " + funcionario1.getDataAdmissao());
        System.out.println("Salario " + funcionario1.getSalario());
        System.out.println("Identificador: " + funcionario1.getIdentificador());

        funcionario2.setNome("Maria");
        funcionario2.setDataAdmissao(LocalDate.of(2022, 2, 15));
        funcionario2.setSalario(4000);

        System.out.println("Funcionário 1:");
        System.out.println("Nome: " + funcionario2.getNome());
        System.out.println("Data de Admissao " + funcionario2.getDataAdmissao());
        System.out.println("Salario " + funcionario2.getSalario());
        System.out.println("Identificador: " + funcionario2.getIdentificador());

        funcionario3.setNome("Marcos");
        funcionario3.setDataAdmissao(LocalDate.of(2022, 2, 15));
        funcionario3.setSalario(500);

        System.out.println("Funcionário 1:");
        System.out.println("Nome: " + funcionario3.getNome());
        System.out.println("Data de Admissao " + funcionario3.getDataAdmissao());
        System.out.println("Salario " + funcionario3.getSalario());
        System.out.println("Identificador: " + funcionario3.getIdentificador());


    }
}
