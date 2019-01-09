import java.util.*;

public class Main {

  public static void main(String[] args) {
    List<String> inputStrings = new ArrayList<>();
    try (Scanner scanner = new Scanner(System.in)) {
      while (scanner.hasNext()) {
        inputStrings.add(scanner.next());
      }
    }

    System.out.println(inputStrings);
  }
}