package JavaUNIT.POO.Exercicio;

public class Funcionario {

    String nome;
    String cpf;
    double salario;
    Integer matricula;

    public void exibeDados() {
        System.out.println("Nome: " + nome + ", Cpf: " + cpf + ", Salário: " + salario + "Matricula: " + matricula);
    }

    public Funcionario( String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public Funcionario( String nome, String cpf, double salario, Integer matricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.matricula = matricula;
    }
}
