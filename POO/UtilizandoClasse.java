package POO;

public class UtilizandoClasse {

    public static void main(String args[]) {

        String nome = "Walter";
        int idade = 18;
        String cpf = "123.321.123-12";

        Pessoa nova = new Pessoa();
        //instanciando o objeto pessoa para poder utilizar dos metodos da classe. Utilizando o construtor sem parametros.
        
        //abaixo exemplos de como utilizar os getters.
        nova.setNome(nome);
        nova.setIdade(idade);
        nova.setCpf(cpf);

        String nome2 = "Joyce";
        int idade2 = 23;
        String cpf2 = "000.111.222-33";

        Pessoa outra = new Pessoa(nome2, idade2, cpf2);
        //Criando nova Pessoa utilizando o construtor como parâmetros

        //Utilizando getters e setters.

        System.out.println("A pessoa nova de nome: " + nova.getNome() + " e idade: " + nova.getIdade() + " tem o cpf de: " + nova.getCpf());

        System.out.println("A pessoa outra de nome: " + outra.getNome() + " e idade: " + outra.getIdade() + " tem o cpf de: " + outra.getCpf());

    }
}
