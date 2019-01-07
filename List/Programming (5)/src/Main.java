import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    List<String> list = new ArrayList<>();
    while (scan.hasNext())
    {
      list.add(scan.next());
    }

    System.out.print(list);
  }

}