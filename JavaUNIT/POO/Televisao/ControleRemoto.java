package JavaUNIT.POO.Televisao;

public class ControleRemoto extends Televisao {

    public ControleRemoto(Integer canal, Integer volume) {
        super(canal, volume);
        // TODO Auto-generated constructor stub
    }

    public Integer aumentarVolume() {
        if(getVolume() >= 100) {
            return 100;
        }
        return getVolume() + 1;
    }

    public Integer diminuirVolume() {
        if(getVolume() <= 0) {
            return 0;
        }
        return getVolume() - 1;
    }
    
    public Integer aumentarCanal() {
        if(getCanal() >= 51) {
            return 51;
        }
        return getCanal() + 1;
    }

    public Integer diminuirCanal() {
        if(getCanal() <= 1) {
            return 1;
        }
        return getCanal() - 1;
    }
    
}
