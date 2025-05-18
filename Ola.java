import java.util.Scanner;

public class Ola {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite seu nome: ");
    String nome = scanner.nextLine();

    ola(nome);

    scanner.close();
  }

  static void ola(String nome) {
    System.out.printf("Olá %s%n", nome);
  }
}
