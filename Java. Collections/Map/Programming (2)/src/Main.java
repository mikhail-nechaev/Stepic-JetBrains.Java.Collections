import java.util.*;

public class Main  {
    public static void main(String[] args) {

        Map<String, Integer> map = new TreeMap <>();
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine().toLowerCase();
        int t=0;
        for (String s : str.split(" +")){
            //System.out.println(s);
            if (map.containsKey(s)) {
                t = map.get(s) ;
                map.put(s,t+1);
            }else map.put(s,1);
        }
        for ( Map.Entry<String,Integer> p :map.entrySet())System.out.println(p.getKey()+" "+p.getValue());
    }
}
