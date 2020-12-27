public class ForEach {

    public static void main(String args[]) {

        int[] array = {1, 2, 3};
        for (int contador : array) {

            System.out.println(contador);
        }
    }
}
//É um tipo de For mais simplificado, mas mantém o mesmo princípio. Normalmente utilizada com Arrays, onde a variável que está dentro do For Each irá receber o valor da variável que você quer percorrer(começando na posição 0), e a cada ciclo adiciona mais uma posição, até percorrer todo o Array
