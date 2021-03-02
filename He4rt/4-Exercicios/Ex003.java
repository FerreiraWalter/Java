import java.util.Scanner;

public class Ex003 {
    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe a sua idade: ");
        int sua_idade = leitor.nextInt();

        System.out.print("Informe a idade da sua mãe: ");
        int mae_idade = leitor.nextInt();

        int Dif = mae_idade - sua_idade;

        System.out.printf("Minha mãe é %d anos mais velha do que eu.", Dif);
    }
}
