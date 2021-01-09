import java.util.Scanner;
import java.util.Locale;

public class DesafioArray 
{

     public static void mediaNotas(double[] notasAluno) 
     {

        double total = 0;
        for (double nota : notasAluno) 
        {

            total += nota;

        }

        System.out.println("Média: " + total / notasAluno.length);

     }

    public static void main(String[] args) 
    {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o Nº de notas: ");
        int num_notas = input.nextInt();

        double[] notasAluno = new double[num_notas];

        for (int i = 0; i < notasAluno.length; i++) 
        {

            System.out.print((i + 1) + "ª nota: ");
            notasAluno[i] = input.nextDouble();

        }

        mediaNotas(notasAluno);

    }

}
