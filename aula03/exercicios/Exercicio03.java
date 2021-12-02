package exercicios;

import java.util.Scanner;

public class Exercicio03 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double salary;

    System.out.println("Digite o seu salário: ");
    salary = entrada.nextDouble();

    salary = salary * 1.25;

    System.out.println("Seu salario teve um aumento 25%: " + salary + " reais");

    entrada.close();

  }
}
