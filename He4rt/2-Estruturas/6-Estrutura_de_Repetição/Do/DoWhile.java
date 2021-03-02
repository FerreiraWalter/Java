public class DoWhile {
    
    public static void main(String args[]) {
        
        int contador = 0;

        do {

            System.out.println(contador);
            contador++;

        } while (contador < 10);
    }
}
//O Do/While é uma estrutura que inicia sem olhar nenhuma condição de parada, roda o que tem dentro das chaves e depois verifica a condição. A variável que vai gerar a condição de parada precisa ser criada fora da estrutura.
