import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    List<String> list = new LinkedList<>();

    while (in.hasNext()) {
      list.add(in.next());
    }

    System.out.println(list);

  }
}