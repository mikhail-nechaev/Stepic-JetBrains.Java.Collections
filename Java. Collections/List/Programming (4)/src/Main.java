import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();

    Scanner in = new Scanner(System.in);
    if (!in.hasNextLine()) return;
    String str = in.nextLine();
    String[] r = str.split(" ");

    for (int i=0;i< r.length;i++) if (i%2 !=0)list.add(r[i]);
    for (int i = list.size()-1; i >= 0; i--) System.out.print(list.get(i)+" ");
  }
}