import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) throws IOException, URISyntaxException {

        String Lugar = "Mercatto+Sorvetes/";

        mostraLugarNoMapa(Lugar);

    }

    private static void mostraLugarNoMapa(String Lugar) throws IOException, URISyntaxException { 
        Desktop.getDesktop().browse(new URI("https://www.google.com/maps/place/Mercatto+Sorvetes/@-10.9384933,-37.0742432,15z/data=!4m8!1m2!2m1!1sMercatto+Sorvetes%2F!3m4!1s0x71ab3a7608c6c05:0xd890663a27a90a29!8m2!3d-10.9337289!4d-37.0625286"));
    }
}
