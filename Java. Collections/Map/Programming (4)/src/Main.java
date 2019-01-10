import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Map<String, String> map = new TreeMap<>();
    Map<String, String> hashMap = new LinkedHashMap<>();
    String[] first =in.nextLine().split("");
    String[] second = in.nextLine().split("");
    for (int i=0;i<first.length;i++) {
      map.put(first[i],second[i]);
      hashMap.put(second[i],first[i]);
    }
    String[] one =in.nextLine().split("");
    String[] two =in.nextLine().split("");
    for (String l :one ) System.out.print(map.get(l));
    System.out.println();
    for (String l :two ) System.out.print(hashMap.get(l));
    System.out.println();
  }
}