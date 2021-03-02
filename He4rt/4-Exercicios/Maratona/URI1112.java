package Maratona;
import java.util.Locale;
import java.util.Scanner;

public class URI1112 {
    
    public static void main(String args[]) {
        
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        double PI = 3.14159;
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();

        double AreaTrianguloRetangulo = (A * C)/2.0;
        double AreaCirculo = PI * C * C;
        double AreaTrapezio = ((A + B) * C) /2.0;
        double AreaQuadrado = B * B;
        double AreaRetangulo = A * B;

        System.out.printf("TRIANGULO: %.3f%n", AreaTrianguloRetangulo);
        System.out.printf("CIRCULO: %.3f%n", AreaCirculo);
        System.out.printf("TRAPEZIO: %.3f%n", AreaTrapezio);
        System.out.printf("QUADRADO: %.3f%n", AreaQuadrado);
        System.out.printf("RETANGULO: %.3f%n", AreaRetangulo);

        leitor.close();
        
    }
}
