import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int c = scanner.nextInt();
    scanner.nextLine();

    List<String> strings = new ArrayList<>();

    for (int i = 0; i < c; i++) {
      strings.add(scanner.nextLine());
    }

    Collections.rotate(strings, scanner.nextInt());

    for (String string: strings){
      System.out.println(string);
    }

  }
}