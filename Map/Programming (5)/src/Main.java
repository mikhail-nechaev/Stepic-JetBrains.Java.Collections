import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int n = scanner.nextInt();
    Map<Integer, String> values = new TreeMap<>();

    while (n > 0) {
      int num = scanner.nextInt();
      String str = scanner.next();

      if (num >= a && num <= b)
        values.put(num,str);

      n--;
    }

    for (Map.Entry<Integer,String> str: values.entrySet())
      System.out.println(str.getKey() + " " + str.getValue());
  }
}