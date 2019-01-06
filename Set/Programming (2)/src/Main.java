import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

  public static void main(String[] args) {

    SortedSet<String> set = new TreeSet<>();

    Scanner scanner = new Scanner(System.in);
    scanner.nextInt();


    while (scanner.hasNext()){
      set.add(scanner.next());
    }

    for (String str: set){
      System.out.println(str);
    }

  }
}