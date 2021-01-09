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

        
        for (int a = 0; a < notasDaTurma.length; a++) 
        {

            for (int n = 0; n < notasDaTurma[a].length; n++) 
            {

                System.out.print("Informe a"+ (a + 1) +"ª nota do " + (n + 1) + "Aluno: " );
                notasDaTurma[a][n] = input.nextDouble();

            }

        }

    }

}
