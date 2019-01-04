import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<Integer> list = Arrays.asList(scanner.nextLine().split(" "))
                    .stream()
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            int count = scanner.nextInt();
            while (count-- > 0) {
                int from = scanner.nextInt();
                int to = scanner.nextInt();
                int temp = list.get(from);
                list.set(from, list.get(to));
                list.set(to, temp);
            }
            for (int i : list) {
                System.out.print(i + " ");
            }
        }
    }
}