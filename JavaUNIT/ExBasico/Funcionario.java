package JavaUNIT.ExBasico;

import java.util.Scanner;

public class Funcionario {

    public static void selecao(int escolha) {
        switch (escolha) {
            case 10:
                System.out.println("Você escolheu Técnico!");
                break;

            case 15:
                System.out.println("Você escolheu Analista!");
                break;
            
            case 20:
                System.out.println("Você escolheu Supervisor!");
                break;

            case 25:
                System.out.println("Você escolheu Gerente!");
                break;

            default:
                System.out.println("Código não corresponde a uma função válida!");
                break;
        }
    }

    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("10- Técnico, 15- Analista, 20- Supervisor, 25- Gerente Escolha uma opção: ");
        int escolha = input.nextInt();

        selecao(escolha);
    }
}
