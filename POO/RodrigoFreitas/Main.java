package POO.RodrigoFreitas;

public class Main {
	public static void main(String[] args) {
        
        Carro carro = new Carro(4);
        System.out.println(carro.getRodas());
        System.out.println(carro.getPortas());

       // Calculo c = new Calculo();
       //Quando uma metodo é STATIC n precisa instanciar
        System.out.println(Calculo.soma(3, 3));

    }
}
