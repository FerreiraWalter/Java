package Exercicios;
import java.util.Scanner;

public class Primos {

    public static void VerificarPrimos(int N) {

        int cont = 0;
        for (int i = 1; i < N; i++) {

            if (N % i == 0) {

                cont ++;
            }
        }

        if (cont > 2) {

            System.out.printf("O número %d não é Primo", N);
        } else {
            
            System.out.printf("O número %d é Primo", N);
        }

    }
    
    public static void main(String args[]) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int num = leitor.nextInt();
        
        VerificarPrimos(num);
        
    }
}
