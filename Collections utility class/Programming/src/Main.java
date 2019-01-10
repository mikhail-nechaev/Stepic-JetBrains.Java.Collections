import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //put your code here
    List<Integer> list = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);
    String[] numbers = scanner.nextLine().split(" ");
    for (String s: numbers) {
      list.add(Integer.parseInt(s));
    }
    int n = scanner.nextInt();
    for (int i = 0; i < n; i++) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      Collections.swap(list, a, b);
    }
    for (int i: list) {
      System.out.print(i + " ");
    }
  }
}