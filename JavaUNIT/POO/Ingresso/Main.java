package JavaUNIT.POO.Ingresso;

public class Main {
    public static void main(String[] args) {
        Ingresso jorgeemateus;

        jorgeemateus = new Normal(50);
        jorgeemateus.imprimeValor();
        jorgeemateus = new VIP(50);
        jorgeemateus.imprimeValor();
        jorgeemateus = new CamaroteInferior(50);
        jorgeemateus.imprimeValor();
        jorgeemateus = new CamaroteSuperior(50);
        jorgeemateus.imprimeValor();
    }
}
