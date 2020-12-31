import java.util.Scanner;
import java.util.Locale;

public class APS1 {

    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a quantidade de carros participantes: ");
        int Quantidade_Carros = input.nextInt();

        for (int i = 0; i < Quantidade_Carros; i++) {

            System.out.println("Informe o número do carro -> ");
            int Num_Carro = input.nextInt();

            System.out.println("Informe o Nome do piloto -> ");
            String Nome_Piloto = input.nextLine();

            System.out.println("Informe o Tempo do piloto -> ");
            Double Temp_Piloto = input.nextDouble();

            System,
        }

    }
}
