import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    ArrayDeque<Integer> first = new ArrayDeque<>();
    ArrayDeque<Integer> second = new ArrayDeque<>();

    int size = in.nextInt();
    int number, time;
    int load1 = 0;
    int load2 = 0;

    for (int i = 0; i < size; i++) {
      number = in.nextInt();
      time = in.nextInt();
      if (load1 <= load2) {
        first.add(number);
        load1 += time;
      } else {
        second.add(number);
        load2 += time;
      }
    }

    for (int i = 0; i < first.size(); i++) {
      System.out.print(first.poll() + " ");
    }
    System.out.println();
    for (int i = 0; i < second.size(); i++) {
      System.out.print(second.poll() + " ");
    }

  }
}