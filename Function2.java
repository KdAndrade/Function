import java.util.Scanner;

public class Function2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o número de linhas: ");
    int num1 = sc.nextInt();

    sc.close();

    linha(num1);
  }

  public static void linha(int n) {
    int[][] array = new int[n][];

    for (int i = 0; i < n; i++) {
      array[i] = new int[i + 1];
      for (int j = 0; j <= i; j++) {
        array[i][j] = j + 1;
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < array[i].length; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
  }
}
