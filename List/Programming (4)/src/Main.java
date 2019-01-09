import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Integer> nums = new ArrayList<>();

    while (scanner.hasNextInt())
      nums.add(scanner.nextInt());

    for (int i = nums.size() - 1; i > 0; i--)
      if (i % 2 != 0)
        System.out.print(nums.get(i) + " ");
  }
}