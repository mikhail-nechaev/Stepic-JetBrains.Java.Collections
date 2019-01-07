import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    Set<String> set = new TreeSet<>();

    int size = scan.nextInt();

    for (int i = 0; i < size; i++)
    {
      set.add(scan.next());
    }

    String[] data = set.toArray(new String[0]);

    for (int i = 0; i < data.length; i++)
    {
      System.out.println(data[i]);
    }

  }
}