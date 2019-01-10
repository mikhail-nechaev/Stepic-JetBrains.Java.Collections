import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //put your code here
    Scanner scanner = new Scanner(System.in);
    int d = Integer.parseInt(scanner.nextLine());
    HashSet<String> dictionary = new HashSet<>();
    String input = "";
    for (int i = 0; i < d; i++) {
      input = scanner.nextLine();
      dictionary.add(input);
    }
    List<String> text = new ArrayList<>();
    int l = Integer.parseInt(scanner.nextLine());
    for (int i = 0; i < l; i++) {
      text.addAll(Arrays.asList(scanner.nextLine().toLowerCase().split(" ")));
    }
    text.removeAll(dictionary);
    text.forEach(System.out::println);
  }
}