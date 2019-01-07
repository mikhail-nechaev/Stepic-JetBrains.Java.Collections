import java.util.*;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    List<Integer[]> table = new ArrayList<>();

    int rows = scan.nextInt();
    int columns = scan.nextInt();

    for (int i = 0; i < rows; i++)
    {
      Integer[] row = new Integer[columns];

      for (int j = 0; j < columns; j++)
      {
        row[j] = scan.nextInt();
      }
      table.add(row);
    }

    int rotate = scan.nextInt();

    Collections.rotate(table, rotate);


    for (Integer row[]: table)
    {
      for (int current: row)
      {
        System.out.print(current + " ");
      }
      System.out.println();
    }
  }
}

