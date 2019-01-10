import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

  public static void main(String[] args) {
    Map<Integer, String> map = new TreeMap<>();
    Scanner in = new Scanner(System.in);
    String[] strings = in.nextLine().split(" ");
    int n1 = Integer.parseInt(strings[0]);
    int n2 = Integer.parseInt(strings[1]);
    int n = Integer.parseInt(in.nextLine());
    for (int i = 0; i < n; i++) {
      String[] v = in.nextLine().split(" ");
      int l = Integer.parseInt(v[0]);
      map.put(l, v[1]);
    }
    for (Map.Entry<Integer,String> p : map.entrySet()) {
      int l = p.getKey();
      if (l>=n1 && l<=n2) System.out.println(l+" "+p.getValue());
    }
  }
}