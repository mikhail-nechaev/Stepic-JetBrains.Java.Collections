import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        if (!scan.hasNextLine()) return;
        String str = scan.nextLine();
        String[] r = str.split(" +");

        for (int i=0;i< r.length;i++) if (i%2 !=0)nameList.add(r[i]);
        for (int i = nameList.size()-1; i >= 0; i--) System.out.print(nameList.get(i)+" ");
    }
}