import java.util.Scanner;

public class Ex004 {
    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Login> ");
        String login = leitor.nextLine();

        System.out.print("Senha> ");
        String senha = leitor.nextLine();

        //Estamos comparando uma instância com uma String por isso o .equals
        if (login.equals("Walter") && senha.equals("07299891514")) {

            System.out.println("Logado com Sucesso.");
        } else {

            System.out.println("Usuário ou senha inválido.");
        }

    }
}
