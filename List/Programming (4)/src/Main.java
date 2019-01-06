import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    List<Integer> list = new ArrayList<>();

    int counter = 0;

    while (scanner.hasNextInt()) {
      if (counter % 2 == 1) {
        list.add(scanner.nextInt());
      } else {
        scanner.nextInt();
      }
      counter++;
    }

    Collections.reverse(list);

    for (Integer i : list) {
      System.out.print(i + " ");
    }


  }

}