import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int rows = in.nextInt(), columns = in.nextInt();
    int[][] data = new int[rows][columns];

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        data[i][j] = in.nextInt();
      }
    }

    int dist = in.nextInt() % rows;

    for (int i = rows - dist; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        System.out.print(data[i][j] + " ");
      }
      System.out.println();
    }

    for (int i = 0; i < rows - dist; i++) {
      for (int j = 0; j < columns; j++) {
        System.out.print(data[i][j] + " ");
      }
      System.out.println();
    }

  }
}