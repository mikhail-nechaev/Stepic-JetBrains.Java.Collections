import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

  public static void main(String[] args) {
    SortedSet<String> set = new TreeSet<>();
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    int n = Integer.parseInt(s);
    for (int i=0 ; i< n;i++)set.add(in.nextLine());
    for (String k : set) System.out.println(k);
  }
}