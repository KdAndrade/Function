import java.util.Scanner;

public class Imposto {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double imposto = 5.0;

    System.out.println("Valor do produto: ");
    double valor = sc.nextDouble();

    Somaimposto(imposto, valor);

    sc.close();

  }

  public static double Somaimposto(double taxaimposto, double custo) {
    custo = custo + (custo * taxaimposto / 100);

    System.out.println("O valor com imposto é: " + custo);

    return custo;
  }
}
