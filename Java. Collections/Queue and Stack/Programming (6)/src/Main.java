import java.util.*;

public class Main {

  public static void main(String[] args) {
    Deque<Integer> deque = new ArrayDeque<>();
    TreeMap<Integer, Integer> map = new TreeMap<>();
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    int n = Integer.parseInt(s);
    for (int i=0;i<n;i++){
      String [] str = in.nextLine().split(" ");
      switch (str[0]) {
        case ("push") : {
          int tmp = Integer.parseInt(str[1]);
          deque.push(tmp);
          if (map.containsKey(tmp)) {
            int t = map.get(tmp);
            map.put(tmp, t + 1);
          } else map.put(tmp, 1);
          break;
        }
        case ("pop") :{
          int j = deque.pop();
          int t = map.get(j);
          if (t == 1) map.remove(j);
          else map.put(j, t - 1);
          break;
        }
        case ("max") : {
          System.out.println(map.lastKey());
          break;
        }
      }
    }
  }
}