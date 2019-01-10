import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //put your code here
    Scanner scanner = new Scanner(System.in);
    String[] sArr = scanner.nextLine().split(" ");
    int a = Integer.parseInt(sArr[0]);
    int b = Integer.parseInt(sArr[1]);
    String string = scanner.nextLine();
    int n = Integer.parseInt(string);
    Map<Integer, String> map = new HashMap<>();
    for (int i = 0; i < n; i++) {
      String[] input = scanner.nextLine().split(" ");
      int val = Integer.parseInt(input[0]);
      if (val >= a && val <= b) {
        map.put(val, input[1]);
      }
    }
    map.forEach((i, s) -> System.out.println(i + " " + s));
  }
}