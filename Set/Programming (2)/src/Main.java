import java.util.*;

public class Main {

  public static void main(String[] args) {
    int numOfInputStrings;
    Set<String> inputStrings = new TreeSet<>();
    try (Scanner scanner = new Scanner(System.in)) {
      numOfInputStrings = scanner.nextInt();

      for (int i = 0; i < numOfInputStrings; i++) {
        inputStrings.add(scanner.next());
      }
    }

    for (String element : inputStrings) {
      System.out.println(element);
    }
  }
}