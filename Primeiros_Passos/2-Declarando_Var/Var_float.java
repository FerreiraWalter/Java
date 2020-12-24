public class Var_float {
    
    public static void main(String args[]) {

        /*As diferenças do float para o double são:
        O double tem mais precisão: pode representar mais casas decimais ou números inteiros maiores;
        O double ocupa 32 bits a mais que o float (o dobro do espaço);
        Dependendo do hardware, o cálculo de um ou outro será mais rápido. Placas de vídeo geralmente operam com floats, as mais novas, com doubles.
        Por incrível que pareça, o último aspecto é bastante relevante. Aplicações gráficas, por exemplo, são formadas por milhares de pontos, e essa diferença pode representar alguns MB em memória. */
        
        double numero1 = 2.3; //variável de ponto flutuate (no caso double) com o nome de "numero1" recebe o valor de 2.3.
        float nome = (float)4.2; //variável de ponto flutuate (no caso float) com o nome de "nome" recebe o valor de 4.2.
        double mediaIdades = 13.5; //variável de ponto flutuate (no caso double) de nome "mediaIdades" recebe o valor de 13.5.

        System.out.println("O valor da variável de numero1 é " + numero1 + " e a numero2 é " + nome);
        System.out.println("A media de idades da turma é de " + mediaIdades + "!");
    }
}
