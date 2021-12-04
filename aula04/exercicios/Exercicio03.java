package exercicios;

import java.util.Scanner;

public class Exercicio03 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double n1, n2;

    System.out.println("Informe o seu número 1");
    n1 = entrada.nextDouble();
    
    System.out.println("Informe o seu número 2");
    n2 = entrada.nextDouble();

    if(n1 > n2) {
      System.out.println(n1 + " " + n2);
    }
    else {
      System.out.println("Não é ordem crescente");
    }

    entrada.close();
  }  
}
