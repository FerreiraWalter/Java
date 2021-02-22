package JavaUNIT.POO.Conta;

public class Conta {
    
    private Integer saldo;

    public Conta() {
        this.saldo = 0;
    }

    public Conta(Integer saldo) {
        this.saldo = saldo;
    }

    public void ver() {
        System.out.println(this.saldo);
    }

}
