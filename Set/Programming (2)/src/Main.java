import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            SortedSet<String> sortedSet = new TreeSet<>();
            int n = scanner.nextInt();
            while (n-- > 0) {
                sortedSet.add(scanner.next());
            }

            for (String s : sortedSet) {
                System.out.println(s);
            }
        }
    }
}