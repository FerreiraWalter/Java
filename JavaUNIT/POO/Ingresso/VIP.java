package JavaUNIT.POO.Ingresso;

public class VIP extends Ingresso {

    public VIP(double valor) {
        super(valor);
    }

    public double precoIngresso() {
        return this.getValor()*2;
    }

    public void imprimeValor() {
        System.out.println("Ingresso VIP: R$" + this.precoIngresso());
    }  
}
