package JavaUNIT.Associacao;

public class Main {
    public static void main(String[] args) {
        Endereco end = new Endereco();
        Pessoa p = new Pessoa("Walter", 19, "07299891514", end);

        System.out.println("Dados da Pessoa: " + p.imprimir());
    }
}
