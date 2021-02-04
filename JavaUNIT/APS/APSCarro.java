package JavaUNIT.APS;

import java.util.Scanner;

class APSCarro {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Número de cidades: ");
    int qtdCidades = input.nextInt();

    double maioracidentes = 0;
    String cmaioracidentes = "";
    
    double menoracidentes = 1;
    String cmenoracidentes = "";

    int ntcarro = 0;

    int ntmoto = 0;

    int ac2000 = 0;
    int c2000 = 0;

    int ac1000 = 0;
    int c1000 = 0;

    double mac2000 = 0;
    double mac1000 = 0;

    for(int i = 0; i < qtdCidades; i++) {
      System.out.print("Nome da cidade: ");
      String nomeCidade = input.next();

      System.out.print("Número de carros de passeio: ");
      int ncarros = input.nextInt();

      ntcarro += ncarros;

      System.out.print("Número de motocicletas: ");
      int nmotos = input.nextInt();

      ntmoto += nmotos;

      System.out.print("Número de acidentes de trânsito em 2019: ");
      double nacidentes = input.nextInt();

      double indiceac = (nacidentes/(ncarros + nmotos));

      if(indiceac > maioracidentes) {
        maioracidentes = indiceac;
        cmaioracidentes = nomeCidade;
      }

      if(indiceac < menoracidentes) {
        menoracidentes = indiceac;
        cmenoracidentes = nomeCidade;
      }

      if(ncarros > 2000) {
        ac2000 += nacidentes;
        c2000 ++;
      }

      if(nmotos > 1000) {
        ac1000 += nacidentes;
        c1000 ++;
      }
    }

    double mediacarro = ntcarro/qtdCidades;
    double mediamoto = ntmoto/qtdCidades;
    if(c2000 > 0) {
      mac2000 = ac2000/c2000;
    }
    if(c1000 > 0) {
      mac1000 = ac1000/c1000;
    }

    System.out.printf("A cidade com maior número de acidentes é " + cmaioracidentes + " com %.2f acidentes por veículo %n", maioracidentes);

    System.out.printf("A cidade com menor número de acidentes é " + cmenoracidentes + " com %.2f acidentes por veículo %n", menoracidentes);
    
    System.out.printf("A média de carros de passeio nas cidades é de %.2f %n", mediacarro);

    System.out.printf("A média de motocicletas nas cidades é de %.2f %n", mediamoto);

    if(mac2000 > 0) {
      System.out.printf("A média de acidentes de trânsito nas cidades com mais de 2000 carros é de %.2f %n", mac2000);
    }
    else {
      System.out.println("Não há cidades com mais de 2000 carros");
    }
    
    if(mac1000 > 0) {
      System.out.printf("A média de acidentes de trânsito nas cidades com mais de 1000 motocicletas é de %.2f %n", mac1000);
    }
    else {
      System.out.println("Não há cidades com mais de 1000 motos");
    }
    
  }
}