import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    List<Integer> nlist = new ArrayList<>();
    try (Scanner scanner = new Scanner(System.in)) {
      while (scanner.hasNextInt()) {
        list.add(scanner.nextInt());
      }
      for (int i = 0; i < list.size(); i++) {
        if (i % 2 != 0) {
          nlist.add(list.get(i));
        }
      }
      for (int i = nlist.size() - 1; i >= 0; i--) {
        System.out.print(nlist.get(i) + " ");
      }
    }
  }
}