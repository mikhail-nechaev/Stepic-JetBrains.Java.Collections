import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    //put your code here
    Scanner scanner = new Scanner(System.in);
    int d = Integer.parseInt(scanner.nextLine());
    HashSet<String> dictionary = new HashSet<>();
    String input = "";
    for (int i = 0; i < d; i++) {
      input = scanner.nextLine();
      dictionary.add(input.toLowerCase());
    }
    int l = scanner.nextInt();
    scanner.nextLine();
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < l; i++) {
      stringBuilder.append(scanner.nextLine().toLowerCase());
      stringBuilder.append(" ");
    }
    String text = stringBuilder.toString().trim();

    List<String> words = new LinkedList<String>(Arrays.asList(text.split(" ")));

    HashSet<String> output = new HashSet<>();
    for (String word: words) {
      if (!dictionary.contains(word)) {
        output.add(word);
      }
    }

    for (String word: output) {
      System.out.println(word);
    }
//        System.out.println(text);
//        System.out.println(words);
  }
}