import java.util.Scanner;

public class ImparPar {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um numero inteiro: ");
    int numero = scanner.nextInt();

    verificacao(numero);

    scanner.close();

  }

  static void verificacao(int x) {
    if (x % 2 == 0) {
      System.out.println("O número" + x + "é par.");
    } else {
      System.out.println("O número " + x + " é ímpar.");
    }
  }
}
