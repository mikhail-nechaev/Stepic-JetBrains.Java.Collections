import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String[] s = scanner.nextLine().split(" ");
            List<Integer> list = new ArrayList<>();
            for (String tmp : s) {
                list.add(Integer.parseInt(tmp));
            }

            int n = scanner.nextInt();

            while (n-- > 0) {
                int i = scanner.nextInt();
                int j = scanner.nextInt();

                int tmp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, tmp);
            }

            for (int i : list) {
                System.out.print(i + " ");
            }
        }
    }
}