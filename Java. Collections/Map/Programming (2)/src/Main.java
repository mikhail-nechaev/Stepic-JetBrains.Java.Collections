import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

  public static void main(String[] args) {
    Map<String, Integer> map = new TreeMap<>();
    Scanner in = new Scanner(System.in);
    String str = in.nextLine().toLowerCase();
    int tmp;
    for (String s : str.split(" ")){
      if (map.containsKey(s)) {
        tmp = map.get(s) ;
        map.put(s,tmp+1);
      }else map.put(s,1);
    }
    for ( Map.Entry<String,Integer> p :map.entrySet())System.out.println(p.getKey()+" "+p.getValue());
  }
}
