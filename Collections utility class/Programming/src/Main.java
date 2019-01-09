import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<String> nums = Arrays.asList(scanner.nextLine().split(" "));
    int n = scanner.nextInt();
    int a;
    int b;

    while (n > 0) {
      a = scanner.nextInt();
      b = scanner.nextInt();
      Collections.swap(nums, a, b);
      n--;
    }

    for (String num : nums)
      System.out.print(num + " ");
  }
}