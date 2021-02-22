package JavaUNIT.POO.Televisao;

public class Televisao {
    private Integer canal = 50;
    private Integer volume = 50;

    //CONSTRUTOR
    public Televisao(Integer canal, Integer volume) {
        this.setCanal(canal);
        this.setVolume(volume);
    }

    //INICIO GETTERS E SETTERS
    public Integer getCanal() {
        return canal;
    }

    public void setCanal(Integer canal) {
        this.canal = canal;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }
    //FIM GETTERS E SETTERS

    public void consultar() {
        System.out.println("Canal: " + this.canal
        + "\nVolume: " + volume);
    }
}
