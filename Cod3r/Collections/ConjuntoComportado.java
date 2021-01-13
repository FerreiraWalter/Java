import java.util.*;

public class ConjuntoComportado {
  
    public static void main(String[] args) {

        //Set<String> listaAprovados = new HashSet<>();
        SortedSet<String> listaAprovados = new TreeSet<>();

        listaAprovados.add("Walter");
        listaAprovados.add("Ferreira");
        listaAprovados.add("Ramos");
        listaAprovados.add("Júnior");

        for (String candidato : listaAprovados) {
            //Não fica em ordem
            System.out.println(candidato);
        }

        Set<Integer> nums = new HashSet<>();

        nums.add(1);
        nums.add(2);
        nums.add(120);
        nums.add(6);

        for (int n : nums) {
            
            System.out.println(n);
        }

    }
}
