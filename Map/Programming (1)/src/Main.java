import java.util.*;

public class Main {

  public static void main(String[] args) {

    Map<String, Integer> map = new TreeMap<>();
    map.put("Gamma",  3);
    map.put("Omega", 24);
    map.put("Alpha",  1);

    for (int i = 0; i < map.size(); i++) {
      String key = (String) map.keySet().toArray()[i];
      System.out.println(key + "=" + map.get(key));
    }

  }
}