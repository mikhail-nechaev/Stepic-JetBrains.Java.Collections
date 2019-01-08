import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();
    String string = in.nextLine();
    String[] data = string.split(" ");

    for (String datum : data) {
      list.add(Integer.valueOf(datum));
    }

    int size = in.nextInt();
    for (int i = 0; i < size; i++) {
      int a = in.nextInt(), b = in.nextInt();
      Collections.swap(list, a, b);
    }

    for (Integer num : list) {
      System.out.print(num + " ");
    }

  }
}