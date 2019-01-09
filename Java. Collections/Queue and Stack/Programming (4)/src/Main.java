import java.util.*;

public class Main {
    public static void main(String[] args) {
        Deque<String> s = new ArrayDeque<>();
        s.offerLast("t") ;
        Scanner scan = new Scanner(System.in);
        String[] str = scan.nextLine().split("");
        for (String c : str) {
            String t = s.peekLast();
            if (c.equals("(")) s.offerLast("(") ;
            if (c.equals("[")) s.offerLast("[") ;
            if (c.equals("{")) s.offerLast("{") ;
            if (c.equals(")")) {
                if (t.equals("(")) s.pollLast();
                else s.offerLast(")");
            }
            if (c.equals("]")) {
                if (t.equals("[")) s.pollLast();
                else s.offerLast("]");
            }
            if (c.equals("}")) {
                if (t.equals("{")) s.pollLast();
                else s.offerLast("}");
            }
        }
        if (s.peekLast().equals("t") ) System.out.println("true");
        else System.out.println("false");
    }
}
