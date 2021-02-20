package JavaUNIT.POO.Ingresso;

public class Ingresso {
    private double valor;

    public Ingresso(double valor) {
        this.setValor(valor);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double precoIngresso() {
        return this.getValor();
    }

    public void imprimeValor() {
        System.out.println("Valor Ingresso: R$" + this.getValor());
    }
}
