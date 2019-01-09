import java.util.*;

public class Main {
    public static void main(String[] args) {
        SortedSet<String> set = new TreeSet<>();
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int n = Integer.parseInt(s);
        for (int i=0 ; i< n;i++)set.add(scan.nextLine());
        for (String k : set) System.out.println(k);
    }
}