package JavaUNIT.ExBasico;

import java.util.Scanner;

public class Triangulo {

    public static double areaTriangulo(double base, double altura) {
        double area = (base * altura) / 2;
        return area;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Base: ");
        double base = input.nextInt();
        System.out.print("Altura: ");
        double altura = input.nextInt();

        double area = areaTriangulo(base, altura);
        System.out.println("Área Triângulo: " + area);

    }
}
