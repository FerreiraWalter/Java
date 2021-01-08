import java.util.Scanner;
import java.util.Locale;

public class APS1 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);


        //CRIAÇAO DE VARIAVEIS.
        int Primeiro_Lugar_Num = 0;
        String Primeiro_Lugar_Nome = "";
        Double Primeiro_Lugar_Temp = 999999999999999999999.9;

        Double Media_Geral = 0.0;

        System.out.print("Informe a quantidade de carros participantes: ");
        int Quantidade_Carros = input.nextInt();

        //CORPO DO PROGRAMA.
        for (int i = 0; i < Quantidade_Carros; i++) {

            System.out.print("Número do " + (i+1) + "º carro -> ");
            int Num_Carro = input.nextInt();

            System.out.print("Nome do " + (i+1) + "º piloto -> ");
            String Nome_Piloto = input.next();

            System.out.print("Tempo do " + (i+1) + "º piloto -> ");
            Double Temp_Piloto = input.nextDouble();

            Media_Geral += Temp_Piloto;

            //SABER QUEM É O PRIMEIRO COLOCADO.
            if (Temp_Piloto < Primeiro_Lugar_Temp) {

                Primeiro_Lugar_Num = Num_Carro;
                Primeiro_Lugar_Nome = Nome_Piloto;
                Primeiro_Lugar_Temp = Temp_Piloto;

            }

        }

        System.out.println("a- Números de carros participantes -> " + Quantidade_Carros);
        System.out.printf("b- Média da prova -> %.2f%n segundos", (Media_Geral/Quantidade_Carros));
        System.out.printf("c- Primeiro colocado: "+Primeiro_Lugar_Num+", "+Primeiro_Lugar_Nome+", "+ Primeiro_Lugar_Temp);

    }
}
