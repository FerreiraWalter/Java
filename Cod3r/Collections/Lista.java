import java.util.ArrayList;

public class Lista {
    
    public static void main(String[] args) {

        ArrayList<Usuarios> lista = new ArrayList<>();

        Usuarios u1 = new Usuarios("Walter");

        lista.add(u1);
        lista.add(new Usuarios("Josias"));
        lista.add(new Usuarios("Igor"));
        lista.add(new Usuarios("Bianca"));

        System.out.println(lista.get(1));

        lista.remove(1);
        lista.remove(new Usuarios("Igor"));

        System.out.println("Tem? " + lista.contains(new Usuarios("Walter")));

        for (Usuarios u : lista) {
            System.out.println(u.nome);
        }

    }
}
