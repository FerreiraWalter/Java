package Exercicios;
import java.util.Scanner;
import java.util.Locale;

public class Alunos2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a quantidade de Alunos: ");
        int numAlunos = input.nextInt();

        double[] notaAlunos = new double[numAlunos];

        for (int i = 0; i < numAlunos; i++) {

            System.out.println("Informe a nota do " + (i+1) + "º Aluno: ");
            notaAlunos[i] = input.nextDouble();
        }

        for (int i = 0; i < numAlunos; i++) {

            System.out.println("-> " + notaAlunos[i]);
        }

    }
}
