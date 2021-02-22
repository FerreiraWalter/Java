package JavaUNIT.POO.Imovel;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String endereco;
        Double preco;
        int opc;
        Imovel casa;

        while(true) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("Cadastro Imovel:"
            + "\n1- Novo"
            + "\n2- Velho"
            + "\n3- Sair"));

            if(opc == 3){
                break;
            }

            endereco = String.valueOf(JOptionPane.showInputDialog("Endereço: "));
            preco = Double.parseDouble(JOptionPane.showInputDialog("Preço: "));
            
            if(opc == 1) {
                casa = new Novo(endereco, preco);
                casa.imprimirDados();
            }
            else if(opc == 2) {
                casa = new Velho(endereco, preco);
                casa.imprimirDados();
            }
        }
    }
}
