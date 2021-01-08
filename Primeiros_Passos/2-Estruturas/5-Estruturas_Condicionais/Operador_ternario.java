public class Operador_ternario {
    
    public static void main(String args[]) {
        //Operador ternário resumidamente tem o mesmo princípio do IF/ELSE só que de maneira simplificada em somente uma linha. Utilizado quando há somente um IF e um ELSE.
        int idade1 = 60;
        int idade2 = 50;
        int idadeMaior;
        
        idadeMaior = (idade1 > idade2 ? idade1: idade2); {
            System.out.println(idadeMaior);
        }
        //Código que vem depois do "?", e caso seja falso, o que vai ser executado vai ser o código que vem depois do ":".
    }
}
