import java.util.Scanner;

public class Ex006 {
    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe a tabuada que você deseja: ");
        int tabuada = leitor.nextInt();

        for (int i = 10; i >= 1; i--) {

            //Ax x Bx = Cx
            System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
        }

    }
}
