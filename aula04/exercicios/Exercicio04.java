package exercicios;

import java.util.Scanner;

public class Exercicio04 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double salary, credit, limit, total;

    System.out.println("Informe o seu salario bruto: ");
    salary = entrada.nextDouble();

    System.out.println("Informe o valor da prestação: ");
    credit = entrada.nextDouble();

    total = salary + credit;
    limit = salary + total * 0.30;

    if(total > limit) {
      System.out.println("Não pode ultrapassar os 30%");
    }
    else {
      System.out.println("Emprestimo com sucesso!!!");
    }

    entrada.close();  

  }
}
