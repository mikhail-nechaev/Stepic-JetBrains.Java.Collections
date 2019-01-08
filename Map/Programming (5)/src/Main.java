import java.util.Scanner;
import java.util.TreeMap;

public class Main {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    TreeMap<Integer, String> data = new TreeMap<>();
    int left = in.nextInt(), right = in.nextInt(), size = in.nextInt();

    for (int i = 0; i < size; i++) {
      data.put(in.nextInt(), in.next());
    }

    for (int i = left; i <= right; i++) {
      if (data.containsKey(i))
        System.out.println(i + " " + data.get(i));
    }

  }
}