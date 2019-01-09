import java.util.*;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> st1 = new ArrayDeque<>();
        Deque<Integer> st2 = new ArrayDeque<>();
        int t1=0,t2=0;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i=0;i<n;i++){
            int k = scan.nextInt();
            int z = scan.nextInt();
            if (t1> t2){st2.addLast(k);t2=t2+z;}
            else if (t1<= t2){st1.addLast(k);t1=t1+z;}
        }
        for (int i : st1) System.out.print(i+" ");
        System.out.println();
        for (int i : st2) System.out.print(i+" ");
        System.out.println();
    }
}