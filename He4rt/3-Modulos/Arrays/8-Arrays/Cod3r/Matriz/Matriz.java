package Matriz;
import java.util.Scanner;

public class Matriz 
{

    public static void main(String[] args) 
    {
    
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o Nº de Alunos: ");
        int qtdAlunos = input.nextInt();

        System.out.print("Informe o Nº de Notas: ");
        int notasAlunos = input.nextInt();

        double[][] notasDaTurma = new double[qtdAlunos][notasAlunos];

        double total = 0;
        for (int a = 0; a < notasDaTurma.length; a++) 
        {

            for (int n = 0; n < notasDaTurma[a].length; n++) 
            {

                System.out.printf("Informe a %dª nota do %dº Aluno: ", n + 1, a + 1);
                notasDaTurma[a][n] = input.nextDouble();

                total += notasDaTurma[a][n];

            }

        }

        double mediaGeral = total/(qtdAlunos * notasAlunos);
        System.out.println("Média dos Alunos: " + mediaGeral);

        

    }

}
