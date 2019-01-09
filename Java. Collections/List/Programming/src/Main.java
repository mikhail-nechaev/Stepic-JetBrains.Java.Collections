import java.util.*;

public class Main {

  public static void main(String[] args) {
      List<String> nameList = new ArrayList<>();
      nameList.add("2");
      nameList.add("0");
      nameList.add("1");
      nameList.add("7");
      System.out.print("[");
      int i=0;
      for (i = 0; i < nameList.size()-1; i++) System.out.print(nameList.get(i)+", ");
      System.out.println(nameList.get(i)+"]");
  }
}