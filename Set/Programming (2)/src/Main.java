import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Set<String> set = new TreeSet<>();
            int count = scanner.nextInt();
            while (count-- > 0) {
                set.add(scanner.next());
            }
            for (String s : set) {
                System.out.println(s);
            }
        }
    }
}