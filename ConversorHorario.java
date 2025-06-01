import java.util.Scanner;

public class ConversorHorario {

  public static int[] converterHora(int hora24, int minuto, char[] periodo) {
    int hora12;

    if (hora24 == 0) {
      hora12 = 12;
      periodo[0] = 'A';
    } else if (hora24 == 12) {
      hora12 = 12;
      periodo[0] = 'P';
    } else if (hora24 > 12) {
      hora12 = hora24 - 12;
      periodo[0] = 'P';
    } else {
      hora12 = hora24;
      periodo[0] = 'A';
    }

    return new int[] { hora12, minuto };
  }

  public static void exibirHora(int hora, int minuto, char periodo) {
    String sufixo = (periodo == 'A') ? "A.M." : "P.M.";
    System.out.printf("Hora convertida: %d:%02d %s%n", hora, minuto, sufixo);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char continuar;

    do {
      System.out.print("Digite primero a hora e depois os minutos: ");
      int hora24 = scanner.nextInt();
      int minuto = scanner.nextInt();

      if (hora24 < 0 || hora24 > 23 || minuto < 0 || minuto > 59) {
        System.out.println("Hora ou minuto inválido.");
      } else {
        char[] periodo = new char[1];
        int[] horaConvertida = converterHora(hora24, minuto, periodo);
        exibirHora(horaConvertida[0], horaConvertida[1], periodo[0]);
      }

      System.out.print("Deseja converter outra hora? (S/N): ");
      continuar = scanner.next().toUpperCase().charAt(0);

    } while (continuar == 'S');

    System.out.println("Programa encerrado.");
    scanner.close();
  }
}
