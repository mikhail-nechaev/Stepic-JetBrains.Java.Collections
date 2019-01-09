import java.util.*;

public class Main {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int n = Integer.parseInt(s);
        for (int i=0 ; i< n;i++)stack.offerLast(scan.nextLine());
        for (int i=0 ; i< n;i++)System.out.println(stack.pollLast());
    }
}