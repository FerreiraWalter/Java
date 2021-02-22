package JavaUNIT.POO.Funcionario;

import javax.swing.JOptionPane;

public class Gerente extends Funcionario {

    public Gerente(String nome, String cpf) {
        super(nome, cpf);
    }
    
    public double calculaSalario() {
        return this.getSalario() * 2;
    }

    public void exibirDados() {
        JOptionPane.showMessageDialog(null, "Nome: " + this.getNome() 
        + "\nCpf: " + this.getCpf()
        + "\nSalário: " + this.calculaSalario());
    }
}
