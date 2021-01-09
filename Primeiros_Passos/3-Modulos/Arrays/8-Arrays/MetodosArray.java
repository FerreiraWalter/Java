import java.util.Arrays;

public class MetodosArray {
    
    public static void main(String args[]) {

        int[] idadeAlunos = new int[3];

        idadeAlunos[0] = 11;
        idadeAlunos[1] = 10;
        idadeAlunos[2] = 12;

        System.out.println(Arrays.toString(idadeAlunos));
        
        Arrays.sort(idadeAlunos);

        int[] idadeAlunos2 = Arrays.copyOf(idadeAlunos, 10);
        System.out.println(Arrays.toString(idadeAlunos2));
        //IdadeAlunos2 vai ter os mesmos valores mas invés de 5 irá ter 10 de tamanho.
    }
}
