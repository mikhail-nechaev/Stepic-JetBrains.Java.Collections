import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<String> listStr = new ArrayList<>();

    while (scanner.hasNext())
      listStr.add(scanner.next());

    System.out.println(listStr);
  }
}