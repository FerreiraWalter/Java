package JavaUNIT.POO.Exercicio;

import javax.swing.JOptionPane;

public class Assistente extends Funcionario {

    public Assistente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    public double calculaSalario() {
        return this.getSalario() * 1.2;
    }

    public void exibirDados() {
        JOptionPane.showMessageDialog(null, "NOME:" + this.getNome() 
        + "\nCPF: " + this.getCpf()
        + "\nSALÁRIO: " + this.calculaSalario());
    }
}
