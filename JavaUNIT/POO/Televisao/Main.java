package JavaUNIT.POO.Televisao;

import java.util.Scanner;

import Cod3r.EqualsHashcode.Equals;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Televisao tv;
        int opc;
        String continuar;

        while(true) {
            System.out.println("\nCONTROLE REMOTO" 
            + "\n1-Situação"
            + "\n2-Aumentar Volume"
            + "\n3-Diminuir Volume"
            + "\n4-Aumentar Canal"
            + "\n5-Diminuir Canal");
            opc = input.nextInt();

            if(opc == 1) {
                System.out.println("\nSITUAÇÃO TELEVISÃO");
                tv = new Televisao();
                tv.consultar();

                System.out.print("\nDeseja continuar [s/n]: ");
                continuar = input.next();

                if(continuar.equals('n')) {
                    break;
                }
            }
            if(opc == 2) {
                tv = new ControleRemoto();
                tv.aumentarVolume();

                System.out.print("\nDeseja continuar [s/n]: ");
                continuar = input.next();

                if(continuar.equals('n')) {
                    break;
                }
            }

        }
    }
}
