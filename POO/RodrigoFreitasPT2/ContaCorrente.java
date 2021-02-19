package POO.RodrigoFreitasPT2;

public class ContaCorrente extends Conta {

    @Override
    public void saldo() {
        System.out.println("Corrente: " + this.total + 100);
    }
}
