package JavaUNIT.POO.Imovel;

import javax.swing.JOptionPane;

public class Novo extends Imovel {

    public Novo(String endereco, Double preco) {
        super(endereco, preco);
    }

    public Double alterarPreco() {
        return this.getPreco() * 1.2;
    }

    public void imprimirDados() {
        JOptionPane.showMessageDialog(null, "Endereço: " + this.getEndereco()
        + "\nPreço: " + this.alterarPreco());
    }
}
