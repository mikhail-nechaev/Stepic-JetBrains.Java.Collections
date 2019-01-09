import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int rows = scanner.nextInt();
      int columns = scanner.nextInt();

      int[][] table = new int[rows][columns];

      for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
          table[i][j] = scanner.nextInt();
        }
      }

      int rotate = scanner.nextInt();
      rotate %= rows;

      for (int i = rows - rotate; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
          System.out.print(table[i][j] + " ");
        }
        System.out.println();
      }

      for (int i = 0; i < rows - rotate; i++) {
        for (int j = 0; j < columns; j++) {
          System.out.print(table[i][j] + " ");
        }
        System.out.println();
      }
    }
  }
}