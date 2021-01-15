import java.util.LinkedList;
import java.util.Queue;

//Fifo (FirstIn-FirstOut)
//Lifo (LastIn-FirstOut)

public class Fila {
    
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        //Ambos add elementos na fila
        //Diferença é o comportamento quando a Fila está cheia!

        fila.add("Walter");
        fila.offer("Bia");
        fila.add("Carlos");
        fila.offer("Rafael");

        System.out.println(fila.peek()); // retorna false
        System.out.println(fila.element()); // Lançã uma exceção

        // fila.size();
        // fila.clear();
        // fila.isEmpty();

        System.out.println(fila.poll()); // retorna false
        System.out.println(fila.remove()); // Lançã uma exceção
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());

    }
}
