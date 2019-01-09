import java.util.*;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> st1 = new ArrayDeque<>();
        Deque<Integer> st2 = new ArrayDeque<>();
        Deque<Integer> max = new ArrayDeque<>();
        Map<Integer, Integer> map = new TreeMap <>();
        int t2=0;
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int n = Integer.parseInt(s);
        for (int i=0;i<n;i++){
            String str = scan.nextLine();
            String [] c = str.split(" +");
            if (c[0].equals("push")){
                int k = Integer.parseInt(c[1]);
                st1.push(k);
                    if (map.containsKey(k)) {
                        int t = map.get(k) ;
                        map.put(k,t+1);
                    }else map.put(k,1);
            }
            else if (c[0].equals("pop")) {
                int j = st1.pop();
                int t = map.get(j);
                if (t == 1) map.remove(j);
                else map.put(j,t-1);
            }
            else if (c[0].equals("max")){
                System.out.println(((TreeMap<Integer, Integer>) map).lastKey());
            }
        }
    }
}
