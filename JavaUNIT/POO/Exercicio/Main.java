package JavaUNIT.POO.Exercicio;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Funcionario pessoa;
        String nome;
        String cpf;
        double salario;
        int opc;

        while (true) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("Cadastro\n"
            + "1- Gerente\n"
            + "2- Assistênte\n"
            + "3- Sair"));

            if(opc == 3) {
                break;
            }

            nome = String.valueOf(JOptionPane.showInputDialog("NOME: "));
            cpf = String.valueOf(JOptionPane.showInputDialog("CPF: "));
            salario = Double.parseDouble(JOptionPane.showInputDialog("SALÁRIO: "));

            if(opc == 1) {
                pessoa = new Gerente(nome, cpf, salario);
                pessoa.exibirDados();
            }
            
            else if(opc == 2) {
                pessoa = new Assistente(nome, cpf, salario);
                pessoa.exibirDados();
            }
        }

    }
}
