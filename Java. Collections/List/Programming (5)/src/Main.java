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

    for (int i=0;i< r.length;i++) list.add(r[i]);
    int i=0;
    System.out.println(list);
  }
}