public class Pessoa {
    
    private String nome;
    private int idade;
    private String cpf;

    public Pessoa() {
        //esse é o construtor, a primeira função  que é executada quando instancia a classe sem passar nenhum parâmetro.
        this.nome = "";
        this.idade = 0;
        this.cpf = "";

    }

    public Pessoa(String nome, int idade, String cpf) {
        //Esse construtor permite você instanciar a classe e passar parâmetros.
        //se voce chamar o construtor e colocar entre parenteses todos os atributos eles já são inseridos automaticamente.
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;

    }

    //Criação de Getters e Setters
    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getNome() {

        return this.nome;
    }

    public void setIdade(int idade) {
        //chamando esse método com o objeto Pessoa, passando a idade como parâmetro, atribui a idade no objeto.

        this.idade = idade; //o this significa que está utilizando o objeto que chamou o método.
    }

    public int getIdade() {
        return this.idade; //retorna o atributo idade do objeto que chamou o método.
    }

    public void setCpf(String cpf) {
        //chamando esse método com o objeto Pessoa, passando o cpf como parametro, atribui o cpf no objeto.

        this.cpf = cpf; //o this significa que está utilizando o objeto que chamou o método.
    }

    public String getCpf() {
        return this.cpf; //retorna o atributo cpf do objeto que chamou o método.
    }

    //funções que a classe faria.

    public void aumentarIdade() {
        //função que ao ser chamada aumenta a idade em 1 da Pessoa.
        this.idade++; 
    }

}
