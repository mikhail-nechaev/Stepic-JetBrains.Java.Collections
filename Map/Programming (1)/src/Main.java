
import java.util.*;

public class Main {

  public static void main(String[] args) {


    Map<String, Integer> map = new TreeMap<>();
    map.put("Gamma", 3);
    map.put("Omega", 24);
    map.put("Alpha", 1);


    //write your code here
    for (Map.Entry<String, Integer> val : map.entrySet())
      System.out.println(val.getKey() + "=" + val.getValue());


  }
}