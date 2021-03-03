package Sla;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Pessoa {
    private String nome;
    private String cpf;
    private String cargo;
    private Double salario;

    //Getters e Setters
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    //CADASTRO DE FUNCIONARIOS
    public void cadastrarFuncionario() {
        this.nome = JOptionPane.showInputDialog("Digite o NOME do Funcionário:");
        this.cpf = JOptionPane.showInputDialog("Digite o CPF do Funcionário:");
        this.salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o SALÁRIO do Funcionário:"));
	}

    //EXIBIR (MUDANÇAS NO FUTURO)
    public void exibirClientes(ArrayList<String> lista_clientes) {
        JOptionPane.showMessageDialog(null, "Nome: Walter");
    }

    public void exibirFuncionarios() {
        JOptionPane.showMessageDialog(null, "Nome: " + this.nome
        + "\nCpf: " + this.cpf
        + "\nSalário: " + this.salario);
    }

}
