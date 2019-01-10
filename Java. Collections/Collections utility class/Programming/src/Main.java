import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    List<Integer> nameList = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    String[] strings = in.nextLine().split(" ");
    for (int i=0;i<strings.length;i++)  {
      int tmp = Integer.parseInt(strings[i]);
      nameList.add(tmp);
    }
    int n = Integer.parseInt(in.nextLine());
    for (int i=0;i<n;i++){
      String[] t = in.nextLine().split(" ");
      int tmp1 = Integer.parseInt(t[0]);
      int tmp2 = Integer.parseInt(t[1]);
      Collections.swap(nameList,tmp1,tmp2);
    }
    for (int j : nameList) System.out.print(j+" ");
    System.out.println();
  }
}