package JavaUNIT.POO.Ingresso;

public class CamaroteSuperior extends VIP {

    public CamaroteSuperior(double valor) {
        super(valor);
    }

    public double precoIngressoCaro() {
        return this.precoIngresso()*2;
    }

    public void imprimeValor() {
        System.out.println("Camarote Superior: " + this.precoIngressoCaro());
    }
}
