package JavaUNIT.Associacao;

public class Pessoa {
    private String nome;
    private Integer idade;
    private String cpf;
    private Endereco end;

    //CONSTRUTORES
    public Pessoa() {
        this.end = new Endereco();
    }

    public Pessoa(String nome, int idade, String cpf) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setCpf(cpf);
        this.end = new Endereco();
    }

    public Pessoa(String nome, int idade, String cpf, Endereco end) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setCpf(cpf);
        this.setEnd(end);
    }

    //INICIO GETTERS E SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEnd() {
        return end;
    }

    public void setEnd(Endereco end) {
        this.end = end;
    }

    //IMPRESSÃO DE DADOS
    public String imprimir() {
        return "\nNome: " + this.nome
        + "\nIdade: " + this.idade 
        + "\nCpf: " + this.cpf 
        + "\nEndereço da Pessoa: " + end.imprimirEnd();
    }
}
