import java.util.Scanner;
import java.util.TreeSet;

public class Main {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    TreeSet<String> dictionary = new TreeSet<>();
    int size = in.nextInt();

    for (int i = 0; i < size; i++) {
      dictionary.add(in.next().toLowerCase());
    }

    in.nextInt();
    TreeSet<String> errors = new TreeSet<>();

    while (in.hasNext()) {
      String line = in.next();
      if (!dictionary.contains(line.toLowerCase()))
        errors.add(line);
    }

    for (String error : errors) {
      System.out.println(error);
    }

  }
}