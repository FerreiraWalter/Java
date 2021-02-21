package JavaUNIT.POO.Imovel;

import javax.swing.JOptionPane;

public class Velho extends Imovel {

    public Velho(String endereco, Double preco) {
        super(endereco, preco);
    }

    public Double alterarPreco() {
        return this.getPreco() * 0.9;
    }

    public void imprimirDados() {
        JOptionPane.showMessageDialog(null, "Endereço: " + this.getEndereco()
        + "\nPreço: " + this.alterarPreco());
    }
}
