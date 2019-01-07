import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      String str = scanner.nextLine();
      String[] arrStr = str.split(" ");
      List<String> myList = new ArrayList<>(Arrays.asList(arrStr));
      System.out.println(myList);
    }
  }
}