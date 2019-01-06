import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<String> knowWords = new ArrayList<>();
            Map<String, Integer> wordsInText = new HashMap<>();
            int n = scanner.nextInt();
            while (n-- > 0){
                knowWords.add(scanner.next().toLowerCase());
            }

            int m = scanner.nextInt();
            scanner.nextLine();
            while (m-- > 0){
                String[] words = scanner.nextLine().toLowerCase().split(" ");
                for (String s : words){
                    wordsInText.put(s, m);
                }
            }

            for (String s : knowWords){
                wordsInText.remove(s);
            }

            for (String words : wordsInText.keySet()) {
                System.out.println(words);
            }
        }
    }
}