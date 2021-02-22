package JavaUNIT.POO.Funcionario;

import javax.swing.JOptionPane;

public class Funcionario {

    private String nome;
    private String cpf;
    private double salario = 600;

    public Funcionario(String nome, String cpf) {
        this.setNome(nome);
        this.setCpf(cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = 600;
    }

    public double calculaSalario() {
        return this.getSalario();
    }

    public void exibirDados() {
        JOptionPane.showMessageDialog(null, "Nome: " + this.getNome() 
        + "\nCpf: " + this.getCpf()
        + "\nSalário: " + this.calculaSalario());
    }
}
