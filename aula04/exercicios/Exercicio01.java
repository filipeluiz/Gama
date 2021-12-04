package exercicios;

import java.util.Scanner;

public class Exercicio01 {
  public static void main(String[] args) {    
    Scanner entrada = new Scanner(System.in);
    int numero;
    double metade;
  
    System.out.println("Informe um número inteiro: ");
    numero = entrada.nextInt();
  
    if(numero > 20) {
      metade = numero / 2;
      System.out.println("Metade = " + metade);
    }
  
    entrada.close();
  }

}
