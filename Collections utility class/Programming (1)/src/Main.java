import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int rows = scanner.nextInt();
            int cols = scanner.nextInt();
            List<List<Integer>> lists = new ArrayList<>();
            for (int i = 0; i < rows; i++) {
                List<Integer> list = new ArrayList<>();
                for (int j = 0; j < cols; j++) {
                    list.add(scanner.nextInt());
                }
                lists.add(list);
            }
            int rotate = scanner.nextInt();
            Collections.rotate(lists, rotate);
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(lists.get(i).get(j) + " ");
                }
                System.out.println();
            }
        }
    }
}