import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      String[] line = scanner.nextLine().split(" ");
      List<Integer> list = new ArrayList<>();
      for (int i = 0; i < line.length; i++) {
        list.add(Integer.valueOf(line[i]));
      }
      int count = scanner.nextInt();
      for (int i = 0; i < count; i++) {
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int cur = list.get(first);
        list.set(first, list.get(second));
        list.set(second, cur);
      }
      for (Integer aList : list) {
        System.out.print(aList + " ");
      }
    }
  }
}