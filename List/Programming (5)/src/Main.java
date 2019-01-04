import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<String> list = new ArrayList<>(
                    Arrays.asList(scanner.nextLine().split(" "))
            );
            System.out.println(list);
        }
    }
}