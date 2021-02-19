package POO.RodrigoFreitas;

public class Carro {

    private int rodas;
    private int portas;

    //Construtor
    public Carro(int rodas, int portas) {
        this.rodas = rodas;
        this.portas = portas;
    }

    public Carro(int rodas) {
        this.rodas = rodas;
        this.portas = 4;
    }

    public int getRodas() {
        return rodas;
    }

    public int getPortas() {
        return portas;
    }
    

}
