import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    Set<String> setWords = new TreeSet<>();

    while (n != 0) {
      setWords.add(scanner.next());
      n--;
    }

    for (String word : setWords)
      System.out.println(word);
  }
}