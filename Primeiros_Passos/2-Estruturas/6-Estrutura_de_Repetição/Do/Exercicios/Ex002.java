package Exercicios;
import java.util.Random;
import java.util.Scanner;

public class Ex002 {
    
    public static void main(String args[]) {

        Scanner leitor = new Scanner(System.in);

        Random rnd = new Random();
        int x =  rnd.nextInt(11);
        int cont = 0;

        while (cont != x ) {

            System.out.print("Informe um número: ");
            int num = leitor.nextInt();
            cont = num;

            if (cont == x) {

                System.out.println("Parabéns você acertou.");
            } else if (cont > x) {

                System.out.println("Um pouco menos...");
            }else {

                System.out.println("Um pouco mais...");
            }

        }

    }
}
