import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNext()) {
      list.add(scanner.next());
    }
    System.out.println(list);
  }
}