import java.util.Scanner;

public class Soma {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] numeros = new int[3];

    for (int i = 0; i < 3; i++) {
      System.out.println("Escreve um número inteiro: ");
      numeros[i] = sc.nextInt();

    }

    int resultado = adicao(numeros[0], numeros[1], numeros[2]);

    System.out.println("Esse é o resultado: " + resultado);

    sc.close();
  }

  public static int adicao(int x, int y, int z) {
    int soma = x + y + z;
    return soma;
  }
}
