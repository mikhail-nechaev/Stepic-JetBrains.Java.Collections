import java.util.*;

public class Main {

  public static void main(String[] args) {

    List<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));


    String[] strArray = new String[nameList.size()];
    int j = 0;

    for(String name : nameList) {
      strArray[j] = name;
      j++;
    }


    for (int i = 0; i < strArray.length; i++) {
      System.out.println(strArray[i]);
    }

  }
}