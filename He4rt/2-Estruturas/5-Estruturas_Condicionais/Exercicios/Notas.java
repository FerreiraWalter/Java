package Exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Notas {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double nota1 = input.nextDouble();
        double nota2 = input.nextDouble();

        double notaF = (nota1 + nota2)/2;
        System.out.printf("NOTA FINAL = %.1f%n", notaF);
    }
}
