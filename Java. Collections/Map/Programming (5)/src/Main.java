import java.util.*;

public class Main  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<Integer, String> map = new TreeMap<>();
        String[] k = scan.nextLine().split(" ");
        int n1 = Integer.parseInt(k[0]);
        int n2 = Integer.parseInt(k[1]);
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String[] v = scan.nextLine().split(" ");
            int l = Integer.parseInt(v[0]);
            map.put(l, v[1]);
        }
        for (Map.Entry<Integer,String> p : map.entrySet()) {
            int l = p.getKey();
            if (l>=n1 && l<=n2) System.out.println(l+" "+p.getValue());
        }
    }
}
