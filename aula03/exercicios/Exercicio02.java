package exercicios;

import java.util.Scanner;

public class Exercicio02 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double nota01, nota02, media;

    System.out.println("Digite a primeira nota: ");
    nota01 = entrada.nextDouble();

    System.out.println("Digite a segunda nota: ");
    nota02 = entrada.nextDouble();

    media = (nota01 + nota02)/2;

    System.out.println("Sua média é: " + media);

    entrada.close();
  }
}
