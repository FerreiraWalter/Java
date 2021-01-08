package Maratona;
import java.util.Scanner;

public class URI1114 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int senha = leitor.nextInt();

        while (senha != 2002) {
            
            System.out.println("Senha Invalida");
            senha = leitor.nextInt();
        }
        System.out.println("Acesso Permitido");
    }
}
