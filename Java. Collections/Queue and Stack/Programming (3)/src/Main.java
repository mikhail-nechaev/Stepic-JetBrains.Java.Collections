import java.util.*;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int n = Integer.parseInt(s);
        for (int i=0 ; i< n;i++){
            String st = scan.nextLine();
            int k = Integer.parseInt(st);
            if (k%2==0) stack.addFirst(k);
            else stack.addLast(k);
        }
        for (int i=0 ; i< n;i++)System.out.println(stack.pollFirst());
    }
}