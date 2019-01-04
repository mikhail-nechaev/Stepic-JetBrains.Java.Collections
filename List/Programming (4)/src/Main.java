import java.util.*;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<Integer> list = new ArrayList<>();
            while (scanner.hasNextInt()) {
                list.add(scanner.nextInt());
            }
            List<Integer> res = new ArrayList<>();
            for (int i = 1; i < list.size(); i += 2) {
                res.add(list.get(i));
            }
            Collections.reverse(res);
            for (int i : res) {
                System.out.print(i + " ");
            }
        }
    }
}