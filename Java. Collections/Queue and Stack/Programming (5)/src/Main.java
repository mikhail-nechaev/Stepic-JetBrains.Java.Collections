import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Deque<Integer> deuqe1 = new ArrayDeque<>();
    Deque<Integer> deque2 = new ArrayDeque<>();
    int tmp1=0;
    int tmp2=0;
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for (int i=0;i<n;i++){
      int first = in.nextInt();
      int second = in.nextInt();
      if (tmp1> tmp2){
        deque2.addLast(first);
        tmp2 += second;}
      else {
        deuqe1.addLast(first);
        tmp1 += second;}
    }
    for (int i : deuqe1) System.out.print(i+" ");
    System.out.println();
    for (int i : deque2) System.out.print(i+" ");
    System.out.println();
  }
}