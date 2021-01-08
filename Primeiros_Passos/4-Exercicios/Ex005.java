import java.util.Scanner;

public class Ex005 {
    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int x = leitor.nextInt();

        //Uso do Operador ternario
        String s = (x > 10) ? "maior":"menor";
    
        System.out.printf("O número digitado é %s do que 10.", s);
    }
}
