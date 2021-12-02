import java.util.Scanner;

public class Exercicio04 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    final double CUSTO_POR_KW = 500;
    double salary, kwConsumide;
    double valueKW, valueTotal, valueDescont;

    System.out.println("Informe o seu salario: ");
    salary = entrada.nextDouble();
    System.out.println("Digite o consumo em KW: ");
    kwConsumide = entrada.nextDouble();

    valueKW = salary / CUSTO_POR_KW;
    valueTotal = valueKW * kwConsumide;
    valueDescont = valueTotal * 0.85;


    System.out.println("Kw custa: R$ " + valueKW);
    System.out.println("Valor total: R$ " + valueTotal);
    System.out.println("Valor com 15% de desconto: R$ " + valueDescont);

    entrada.close();

   }
}
