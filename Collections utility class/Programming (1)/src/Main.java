import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int row = scanner.nextInt();
    int col = scanner.nextInt();
    List<String> listOfNumbers = new ArrayList<>();
    scanner.nextLine();
    while (row > 0) {
      listOfNumbers.add(scanner.nextLine());
      row--;
    }
    int dist = scanner.nextInt();

    Collections.rotate(listOfNumbers,dist);

    for (String str: listOfNumbers)
      System.out.println(str);

  }
}