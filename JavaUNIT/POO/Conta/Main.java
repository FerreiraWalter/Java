package JavaUNIT.POO.Conta;

public class Main { 
    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente();
        ContaPoupanca contaPoupanca = new ContaPoupanca(300);

        contaCorrente.ver();
        contaPoupanca.ver();

    }
}
