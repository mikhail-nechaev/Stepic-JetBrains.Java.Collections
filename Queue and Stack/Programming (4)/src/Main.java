import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Deque<Character> queue = new ArrayDeque<>();
            String string = scanner.nextLine();

            boolean isBalanced = true;

            for (int i = 0; i < string.length(); i++) {
                char c = string.charAt(i);
                if (c == '(' || c == '{' || c == '['){
                    queue.addFirst(c);
                }
                if (c == ')'){
                    if (queue.isEmpty() || queue.pop() != '(') {
                        isBalanced = false;
                    }
                }
                if (c == '}'){
                    if (queue.isEmpty() || queue.pop() != '{') {
                        isBalanced = false;
                    }
                }
                if (c == ']'){
                    if (queue.isEmpty() || queue.pop() != '[') {
                        isBalanced = false;
                    }
                }
            }

            System.out.println(queue.isEmpty() && isBalanced ? "true" : "false");
        }

    }
}