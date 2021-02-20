package JavaUNIT.POO.Ingresso;

public class CamaroteInferior extends VIP {

    public CamaroteInferior(double valor) {
        super(valor);
    }

    public double precoIngresso() {
        return this.getValor()*2;
    }

    public void imprimeValor() {
        System.out.println("Camorete Inferior: " + this.precoIngresso());
    }
}
