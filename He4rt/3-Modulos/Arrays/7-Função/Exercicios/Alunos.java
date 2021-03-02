package Exercicios;
import java.util.Locale;

public class Alunos {

    public static int MediaAlunos(int[] NotasAlunos) {

        int cont = 0;

        for (int i = 0; i < NotasAlunos.length; i++ ) {

            cont += NotasAlunos[i];
        }

        return cont/NotasAlunos.length;
    }

    public static void AcimaMedia(int[] NotasAlunos) {

        int cont = 0;

        for (int i = 0; i < NotasAlunos.length; i++) {

            if (NotasAlunos[i] >= 6) {

                cont++;
            }
        }

        System.out.println(cont + " Alunos ficaram acima da média.");
    }

    public static void main(String args[]) {
        
        Locale.setDefault(Locale.US);
        int[] NotasAlunos = new int[5];

        NotasAlunos[0] = 8;
        NotasAlunos[1] = 7;
        NotasAlunos[2] = 5;
        NotasAlunos[3] = 3;
        NotasAlunos[4] = 6;

        System.out.println(MediaAlunos(NotasAlunos));
        AcimaMedia(NotasAlunos);
    }
}
