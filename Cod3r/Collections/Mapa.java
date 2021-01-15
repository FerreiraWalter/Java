import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
    
    public static void main(String[] args) {

        Map<Integer, String> usuarios = new  HashMap<>();
        usuarios.put(1, "Walter");
        usuarios.put(20, "Ricardo");
        usuarios.put(3, "Bia");
        usuarios.put(4, "Rebeca");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.remove(4, "Gui"));

        System.out.println(usuarios.keySet()); //Imprime só as chaves
        System.out.println(usuarios.values()); // Imprime só os valores
        System.out.println(usuarios.entrySet()); // Imprime Tudo

        System.out.println(usuarios.containsKey(20)); // True
        System.out.println(usuarios.containsValue("Walter")); // True

        System.out.println(usuarios.get(20));

        for (int chave : usuarios.keySet()) {
            System.out.println(chave);
        }

        for (String valor : usuarios.values()) {
            System.out.println(valor);
        }
        
        for (Entry<Integer, String> registro : usuarios.entrySet()) {
            System.out.print(registro.getKey() + " ==> ");
            System.out.println(registro.getValue());

        }

    }
}
