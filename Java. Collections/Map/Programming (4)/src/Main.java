import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, String> map = new TreeMap <>();
        Map<String, String> nomap = new LinkedHashMap<>();
        String[] k =scan.nextLine().split("");
        String[] v = scan.nextLine().split("");
        for (int i=0;i<k.length;i++) {
            map.put(k[i],v[i]);
            nomap.put(v[i],k[i]);
        }
        String[] t =scan.nextLine().split("");
        String[] m =scan.nextLine().split("");
        for (String l :t ) System.out.print(map.get(l));
        System.out.println();
        for (String l :m ) System.out.print(nomap.get(l));
        System.out.println();
    }
}

