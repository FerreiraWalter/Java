package JavaUNIT.POO.Exercicio;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Funcionario pessoa;
        String nome;
        String cpf;
        int opc;

        while (true) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("Cadastro\n"
            + "1- Gerente\n"
            + "2- Assistênte\n"
            + "3- Estagiário\n"
            + "4- Sair"));

            if(opc == 4) {
                break;
            }

            nome = String.valueOf(JOptionPane.showInputDialog("NOME: "));
            cpf = String.valueOf(JOptionPane.showInputDialog("CPF: "));

            if(opc == 1) {
                pessoa = new Gerente(nome, cpf);
                pessoa.exibirDados();
            }
            
            else if(opc == 2) {
                pessoa = new Assistente(nome, cpf);
                pessoa.exibirDados();
            }

            else if(opc == 3) {
                pessoa = new Funcionario(nome, cpf);
                pessoa.exibirDados();
            }
        }

    }
}
