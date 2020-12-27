package Exercicios;
import java.util.Scanner;

public class Ex001 {
    
    public static void main(String args[]) {

        for (int cont = 1000; cont <= 1999; cont++) {

            if (cont % 11 == 5) {
                
                System.out.println(cont);
            }
        }
    }
}
