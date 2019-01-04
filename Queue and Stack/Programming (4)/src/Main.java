import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(isBalanced(scanner.next()));
        }
    }

    private static boolean isBalanced(String expr) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : expr.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.offerLast(c);
            } else if (stack.isEmpty()
                    || c == ')' && stack.pollLast() != '('
                    || c == '}' && stack.pollLast() != '{'
                    || c == ']' && stack.pollLast() != '[') {
                return false;
            }
        }
        return stack.isEmpty();
    }
}