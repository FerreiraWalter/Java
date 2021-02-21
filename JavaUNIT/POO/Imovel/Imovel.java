package JavaUNIT.POO.Imovel;

import javax.swing.JOptionPane;

public class Imovel {
    private String endereco;
    private Double preco;

    public Imovel(String endereco, Double preco) {
        this.setEndereco(endereco);
        this.setPreco(preco);
    }

    public String getEndereco() {
        return endereco;
    }

    public Double getPreco() {
        return preco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void imprimirDados() {
        JOptionPane.showMessageDialog(null, "Endereço: " + endereco
        + "\nPreço: " + preco);
    }
}
