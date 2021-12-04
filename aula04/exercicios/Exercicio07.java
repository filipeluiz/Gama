package exercicios;

import java.util.Scanner;

public class Exercicio07 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double salary, inss;

    System.out.println("Informe o seu salário: ");
    salary = entrada.nextDouble();

    if(salary <= 600) {
      System.out.println("Isento");
    }
    else if(salary > 600 && salary <=1200) {
      inss = salary * 0.2;
      System.out.println(inss);
    }
    else if(salary > 1200 && salary <= 2000) {
      inss = salary * 0.25;
      System.out.println(inss);
    }
    else {
      inss = salary * 0.3;
      System.out.println(inss);
    }

    entrada.close();
  }
}
