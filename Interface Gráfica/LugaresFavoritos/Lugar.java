import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class Lugar {

    private String nome;
    private List<Integer> avaliacoes = new ArrayList<Integer>();

    public Lugar(String StringQualquer ) {

        this.nome = StringQualquer.toUpperCase();
	}

    //Encontrar no GOOGLE MAPS o Local digitado.
	public void mostraLugarNoMapa() throws IOException, URISyntaxException {

        String nomeUrl = this.nome.replace(" ", "+");

        Desktop.getDesktop().browse(new URI("https://www.google.com/maps/search/?api=1&entry=yt&query="+ nomeUrl));
    }
    
    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome.toUpperCase();
    }

	public void addAvaliacao(int avaliacao) {

        this.avaliacoes.add(avaliacao);
	}

	public Integer totalDeAvaliacoes() {

		return this.avaliacoes.size();
	}

	public Double avaliacaoMedia() {

		return somaDasAvaliacoes()/totalDeAvaliacoes();
	}

    private Double somaDasAvaliacoes() {

        Double soma = 0d;

        for (Integer avaliacao : avaliacoes) {
            
            soma += avaliacao;
        }
        return soma;
    }

	public String avaliacaoStatus() {

        Double media = avaliacaoMedia();

        if (media > 4) {

            return "Muito Boa";

        } else if (media >= 3) {

            return "Razoavel";

        } else {

            return "Ruim";

        }

	}
    
}
