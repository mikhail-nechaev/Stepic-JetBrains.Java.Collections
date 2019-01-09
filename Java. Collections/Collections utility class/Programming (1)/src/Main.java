import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> nameList = new ArrayList<>();
        String[] v = scan.nextLine().split(" ");
        int r = Integer.parseInt(v[0]);
        int c = Integer.parseInt(v[1]);
        Map<Integer, String> map = new LinkedHashMap<>();
        for (int i=0;i<r;i++)  {
            String s = scan.nextLine();
            map.put(i,s);
        }
        String s =scan.nextLine();
        int n = Integer.parseInt(s);
        List keys = new ArrayList(map.keySet());
        Collections.rotate(keys,n);
        for (int i = 0; i < keys.size(); i++) System.out.println(map.get(keys.get(i)));
    }
}

