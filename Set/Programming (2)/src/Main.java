import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    SortedSet<String> sortedSet = new TreeSet<>();
    int size = in.nextInt();

    for (int i = 0; i < size; i++) {
      sortedSet.add(in.next());
    }

    for (String word : sortedSet) {
      System.out.println(word);
    }

  }
}