import java.util.Scanner;
import java.util.TreeSet;

public class Main {

  public static void main(String[] args) {
    //put your code here
    TreeSet<String> treeSet = new TreeSet<>();
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    for (int i = 0; i < n; i++) {
      treeSet.add(scanner.next());
    }

    while (!treeSet.isEmpty()) {
      System.out.println(treeSet.pollFirst());
    }
  }
}