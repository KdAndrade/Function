import java.util.Scanner;

public class VerificacaoNum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Escreva um número: ");
    int num = sc.nextInt();

    verificacao(num);

    sc.close();
  }

  public static void verificacao(int x) {
    if (x > 0) {
      System.out.println("P");
    } else {
      System.out.println("N");

    }
  }
}
