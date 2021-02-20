package JavaUNIT.POO.Ingresso;

public class Normal extends Ingresso {

    public Normal(double valor) {
        super(valor);
    }

    public void imprimeValor() {
        System.out.println("Ingresso Normal: R$" + this.getValor());
    }
}
