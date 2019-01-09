import java.util.*;

public class Main {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();

    try (Scanner scanner = new Scanner(System.in)) {
      String inputNums = scanner.nextLine();
      int begin = 0, end = 0;
      String[] stringOfDigits = inputNums.split(" ");

      for (String element : stringOfDigits) {
        list.add(Integer.valueOf(element));
      }

      int numOfSwaps = scanner.nextInt();

      for (int i = 0; i < numOfSwaps; i++) {
        int firstIndex = scanner.nextInt();
        int secondIndex = scanner.nextInt();

        Collections.swap(list, firstIndex, secondIndex);
      }
    }

    for (Integer element : list) {
      System.out.print(element + " ");
    }
  }
}