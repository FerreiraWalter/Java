public class Excecoes {

    public static void main(String args[]) {
        
        String frase = null;
        String novaFrase = null;

        try {

            novaFrase = frase.toUpperCase();

        } catch (Exception e) {

            System.out.println("Frase inicial está nula.");

            frase = "Frase vazia que nem minha vida";
            novaFrase = frase.toUpperCase();

        } finally {

            System.out.println("Frase antiga: " + frase);
            System.out.println("Frase nova: " + novaFrase);

        }
    }
}
