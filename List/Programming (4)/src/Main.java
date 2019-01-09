import java.util.*;

public class Main {

  public static void main(String[] args) {
    List<Integer> numsList = new ArrayList<>();
    try (Scanner scanner = new Scanner(System.in)) {
      while (scanner.hasNextInt()) {
        numsList.add(scanner.nextInt());
      }
    }

    for (int i = numsList.size() - 1; i > 0; i--) {
      if (i % 2 != 0) {
        System.out.print(numsList.get(i) + " ");
      }
    }

  }
}