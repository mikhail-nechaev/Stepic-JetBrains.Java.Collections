import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> nameList = new ArrayList<>();
        String[] v = scan.nextLine().split(" ");
        for (int i=0;i<v.length;i++)  {
            int k = Integer.parseInt(v[i]);
            nameList.add(k);
        }
        String s =scan.nextLine();
        int n = Integer.parseInt(s);
        for (int i=0;i<n;i++){
            String[] t = scan.nextLine().split(" ");
            int g = Integer.parseInt(t[0]);
            int y = Integer.parseInt(t[1]);
            Collections.swap(nameList,g,y);
        }
        for (int j : nameList) System.out.print(j+" ");
        System.out.println();
    }
}
