import java.util.*;

public class Main {

  public static void main(String[] args) {


    Set<String> nameSet = new TreeSet<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));

    String[] names = nameSet.toArray(new String[0]);
    for (String str: names)
    {
      System.out.println(str);
    }

  }
}