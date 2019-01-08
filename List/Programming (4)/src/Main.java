import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    ArrayList<Integer> arrayList = new ArrayList<>();

    while (in.hasNextInt()) {
      arrayList.add(in.nextInt());
    }

    for (int i = arrayList.size() - 1; i >= 0; i--) {
      if (i % 2 != 0) System.out.print(arrayList.get(i) + " ");
    }

  }
}