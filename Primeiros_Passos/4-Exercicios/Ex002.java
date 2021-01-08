import java.util.Scanner;

public class Ex002 {
    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = leitor.nextLine();

        System.out.print("Digite a sua idade: ");
        int idade = leitor.nextInt();

        System.out.print("Digite a sua cidade: ");
        String cidade = leitor.next();

        System.out.println("Olá, meu nome é " + nome + ", sou natural de " + cidade + ", tenho " + idade + " anos e estou aprendendo a programar.");

    }
}
