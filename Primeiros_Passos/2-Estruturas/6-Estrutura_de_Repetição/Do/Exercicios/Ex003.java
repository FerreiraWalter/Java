package Exercicios;
import java.util.Scanner;

public class Ex003 {
    
    public static void main(String args[]) {

        Scanner leitor = new Scanner(System.in);

        int cont = 0;

        for (int i = 1; i < 6; i++) {

            System.out.printf("Informe o %dº num: ", i);
            int num = leitor.nextInt();

            if (num >= 18) {

                cont ++;
            }
        }

        System.out.println("Existem " + cont + " pessoas com mais de 17 anos.");
    }
}
