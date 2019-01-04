import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Set<String> knownWords = new HashSet<>();
            int count = scanner.nextInt();
            while (count-- > 0) {
                knownWords.add(scanner.next().toLowerCase());
            }
            scanner.nextInt();
            Set<String> errors = new HashSet<>();
            while (scanner.hasNext()) {
                String word = scanner.next().toLowerCase();
                if (!knownWords.contains(word)) {
                    errors.add(word);
                }
            }
            for (String s : errors) {
                System.out.println(s);
            }
        }
    }
}