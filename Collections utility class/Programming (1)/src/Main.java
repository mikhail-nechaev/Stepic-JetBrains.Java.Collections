import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            scanner.nextLine();

            List<String> list = new LinkedList<>();

            while (n-- > 0) {
                list.add(scanner.nextLine());
            }

            int k = scanner.nextInt();

            Collections.rotate(list, k);

            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}