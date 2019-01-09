import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Integer> map = new TreeMap <>();
        Map<String, Integer> nomap = new LinkedHashMap<>();
        String k =scan.nextLine();
        int n = Integer.parseInt(k);
        for (int i=0;i<n;i++) map.put(scan.nextLine().toLowerCase(),1);
        k =scan.nextLine();
        n = Integer.parseInt(k);
        for (int i=0;i<n;i++){
            String[] str = scan.nextLine().toLowerCase().split(" +");
            for (String s : str){
                if (map.containsKey(s)) continue;
                nomap.put(s,1);
            }
        }
        for ( Map.Entry<String,Integer> p :nomap.entrySet())System.out.println(p.getKey());
    }
}






