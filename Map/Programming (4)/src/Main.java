import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            char[] original = scanner.nextLine().toCharArray();
            char[] replacement = scanner.nextLine().toCharArray();
            Map<Character, Character> o2r = new HashMap<>();
            Map<Character, Character> r2o = new HashMap<>();
            for (int i = 0; i < original.length; i++) {
                o2r.put(original[i], replacement[i]);
                r2o.put(replacement[i], original[i]);
            }

            String message = scanner.nextLine();
            StringBuilder builder = new StringBuilder();
            for (char c : message.toCharArray()) {
                builder.append(o2r.get(c));
            }
            String encodedMessage = builder.toString();
            System.out.println(encodedMessage);

            encodedMessage = scanner.next();
            builder = new StringBuilder();
            for (char c : encodedMessage.toCharArray()) {
                builder.append(r2o.get(c));
            }
            message = builder.toString();
            System.out.println(message);
        }
    }
}