import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);
    int i = -1;
    while (scanner.hasNextInt()) {
        i++;
        int tmp = scanner.nextInt();
        if (i % 2 == 1) {
          list.addFirst(tmp);
        }
    }

    ListIterator<Integer> listIterator = list.listIterator();
    while (listIterator.hasNext()) {
      System.out.print(listIterator.next() + " ");
    }

  }
}