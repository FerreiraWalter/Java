package POO.RodrigoFreitasPT2;

public class Main {
    public static void main(String[] args) {
        Conta c;

        c = new ContaCorrente();
        c.saldo();

        c = new ContaPoupanca();
        c.saldo();
    }
}
