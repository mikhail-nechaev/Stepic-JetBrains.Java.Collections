import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {

    List<Integer> list = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    String[] strArr = scanner.nextLine().split(" ");

    for (int i = 0; i < strArr.length; i++) {
      list.add(Integer.parseInt(strArr[i]));
    }

    scanner.nextInt();

    while (scanner.hasNext()){
      Collections.swap(list, scanner.nextInt(), scanner.nextInt());
    }

    for (Integer i: list) {
      System.out.print(i + " ");
    }

  }
}