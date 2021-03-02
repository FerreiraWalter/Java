import java.io.*;
import java.util.Scanner;

public class Leitor 
{
    
    public static void leitor() throws IOException 
    {

        BufferedReader leitor = new BufferedReader(new FileReader("./arquivo.txt"));

        String linha = "";

        while (true) 
        {

            if (linha != null) 
            {

                System.out.println(linha);

            } else {

                break;

            }

            linha = leitor.readLine();

        }

        leitor.close();

    }

    public static void escritor() throws IOException {

        BufferedWriter escritor = new BufferedWriter(new FileWriter());

        String linha = "";

        Scanner leitor = new Scanner(System.in);

        System.out.println("Escreva algo: ");
        linha = leitor.nextLine();

        escritor.append(linha + "\n");

        escritor.close();

    }

}
