package JavaUNIT.ExBasico;

import javax.swing.JOptionPane;

public class Vogais {


    public static void seperarVogais(String frase) {

        int numA = 0, numE = 0, numI = 0, numO = 0, numU = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'A') {
                numA++;
            }

            if (frase.charAt(i) == 'e' || frase.charAt(i) == 'E') {
                numE++;
            }

            if (frase.charAt(i) == 'i' || frase.charAt(i) == 'I') {
                numI++;
            }

            if (frase.charAt(i) == 'o' || frase.charAt(i) == 'O') {
                numO++;
            }

            if (frase.charAt(i) == 'u' || frase.charAt(i) == 'U') {
                numU++;
            }
        }

        JOptionPane.showMessageDialog(null, "Frase: "
        + frase
        + "\nVogal A: " + numA
        + "\nVogal E: " + numE
        + "\nVogal I: " + numI
        + "\nVogal O: " + numO
        + "\nVogal U: " + numU
        + "\nTamanho da Frase: " + frase.length());

    }


    public static void main(String[] args) {

        String frase = JOptionPane.showInputDialog("Digite uma frase: ");
        seperarVogais(frase);
    }
}
