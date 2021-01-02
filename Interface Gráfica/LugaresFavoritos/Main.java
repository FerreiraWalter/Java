import java.io.IOException;
import java.net.URISyntaxException;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) throws IOException, URISyntaxException {

        String nomeDoLugar = tela("Qual nome do Lugar?");
        Lugar objetoLugar = new Lugar(nomeDoLugar);

        String avaliacaoString = tela("Qual Avaliação?");
        Integer avaliacao = Integer.parseInt(avaliacaoString);

        objetoLugar.addAvaliacao(avaliacao);

        tela(objetoLugar.toString());
        
    }

    private static String tela(String stringDisplay) {
        return JOptionPane.showInputDialog(stringDisplay);
    }

}
 