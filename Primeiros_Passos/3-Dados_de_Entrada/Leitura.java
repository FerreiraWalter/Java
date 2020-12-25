import java.util.Scanner;

public class Leitura {

    public static void main(String args[]) {

        Scanner leitor = new Scanner(System.in); //Faz a mágica

        System.out.println("Digite o nome: ");
        String nome = leitor.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = leitor.nextInt();

        System.out.println("Digite seu peso: ");
        double peso = leitor.nextDouble();

        System.out.println("Seu nome é: " + nome + ", tem " + idade + " anos e pesa " + peso + "kg" );
    }
}
