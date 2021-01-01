import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, URISyntaxException {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe um Local: ");
        String NomeLugar = input.nextLine();

        Lugar objetoLugar = new Lugar(NomeLugar);
        //objetoLugar.mostraLugarNoMapa();

        objetoLugar.addAvaliacao(5);
        objetoLugar.addAvaliacao(4);
        objetoLugar.addAvaliacao(4);

        Integer Total = objetoLugar.totalDeAvaliacoes();
        System.out.println("Total: " + Total);

        Double media = objetoLugar.avaliacaoMedia();
        System.out.println("Media: " + media);

        String status = objetoLugar.avaliacaoStatus();
        System.out.println("Status: " + status);
        
    }
 
}
 