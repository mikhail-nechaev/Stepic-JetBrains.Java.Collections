import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int rows = scanner.nextInt();
      int columns = scanner.nextInt();
      List<List<Integer>> list = new ArrayList<>();
      for (int i = 0; i < rows; i++) {
        List<Integer> sublist = new ArrayList<>();
        for (int j = 0; j < columns; j++) {
          sublist.add(scanner.nextInt());
        }
        list.add(sublist);
      }
      int rotate = scanner.nextInt();
      Collections.rotate(list, rotate);
      for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
          System.out.print(list.get(i).get(j) + " ");
        }
        System.out.println();
      }

    }
  }
}