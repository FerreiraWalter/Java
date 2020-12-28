package Maratona;
import java.util.Scanner;

public class URI1113 {
    
    public static void main(String args[]) {

        Scanner leitor = new Scanner(System.in);

        int x = leitor.nextInt();
        int y = leitor.nextInt();

        while (x != y) {

            if (x > y) {

                System.out.println("Decrescente");
            } else {

                System.out.println("Crescente");
            }

            x = leitor.nextInt();
            y = leitor.nextInt();
        }
    }
}
