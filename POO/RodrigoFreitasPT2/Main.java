package POO.RodrigoFreitasPT2;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(100);
        ContaPoupanca contaPoupanca = new ContaPoupanca();

        contaCorrente.view();
        contaPoupanca.view();
    }
}
