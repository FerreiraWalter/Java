import java.util.Scanner;

public class Switch_Case {

    public static void main(String args[]) {
        
        Scanner leitor = new Scanner(System.in);
        int caso = 0;

        System.out.println("Digite 1 para mostrar o nome Walter, 2 para mostrar o nome Lary");
        caso = leitor.nextInt();

        switch (caso) {

            case 1:
            System.out.println("Walter");
            break;

            case 2:
            System.out.println("Lary");
            break;

            default:
                System.out.println("Valor não encontrado no menu.");
        }

    }
}