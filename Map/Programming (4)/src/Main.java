import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Map<Character, Character> alphabet = new HashMap<>();
            String letters = scanner.nextLine();
            String cypher = scanner.nextLine();

            for (int i = 0; i < letters.length(); i++) {
                alphabet.put(letters.charAt(i), cypher.charAt(i));
            }

            String forEncode = scanner.nextLine();
            String forDecrypted = scanner.nextLine();

            for (int i = 0; i < forEncode.length(); i++) {
                System.out.print(alphabet.get(forEncode.charAt(i)));
            }
            System.out.println();

            for (int i = 0; i < forDecrypted.length(); i++) {
                for (Map.Entry<Character, Character> pair : alphabet.entrySet()) {
                    if (pair.getValue() == forDecrypted.charAt(i)) {
                        System.out.print(pair.getKey());
                        break;
                    }
                }
            }
        }
    }
}