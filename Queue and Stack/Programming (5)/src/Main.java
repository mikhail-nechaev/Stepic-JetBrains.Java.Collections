import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Deque<Integer> queue1 = new ArrayDeque<>();
            Deque<Integer> queue2 = new ArrayDeque<>();

            int sum1 = 0;
            int sum2 = 0;

            int i = scanner.nextInt();

            while (i-- > 0) {
                int n = scanner.nextInt();
                int m = scanner.nextInt();

                if (sum1 <= sum2) {
                    queue1.add(n);
                    sum1 += m;
                } else {
                    queue2.add(n);
                    sum2 += m;
                }
            }

            for (int j : queue1){
                System.out.print(j + " ");
            }

            System.out.println();

            for (int j : queue2){
                System.out.print(j + " ");
            }
        }
    }
}