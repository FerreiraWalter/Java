public class ArrayseFuncoes {
    
    public static void SomadosElementos(int[] idadeAlunos) {

        int cont = 0;

        for (int i = 0; i < 3; i++) {

            cont += idadeAlunos[i];
        }

        System.out.println(cont);
    }

    
    public static void main(String args[]) {

        int[] idadeAlunos = new int[3];

        idadeAlunos[0] = 11;
        idadeAlunos[1] = 10;
        idadeAlunos[2] = 12;

        SomadosElementos(idadeAlunos);
    }
}
