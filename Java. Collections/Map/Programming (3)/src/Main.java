import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

  public static void main(String[] args) {
    Map<String, Integer> map = new TreeMap<>();
    Map<String, Integer> hashMap = new LinkedHashMap<>();
    Scanner in = new Scanner(System.in);
    int n = Integer.parseInt(in.nextLine());
    for (int i=0;i<n;i++) map.put(in.nextLine().toLowerCase(),1);
    n = Integer.parseInt(in.nextLine());
    for (int i=0;i<n;i++){
      String[] str = in.nextLine().toLowerCase().split(" ");
      for (String s : str){
        if (map.containsKey(s)) continue;
        hashMap.put(s,1);
      }
    }
    for ( Map.Entry<String,Integer> p :hashMap.entrySet())System.out.println(p.getKey());
  }
}
