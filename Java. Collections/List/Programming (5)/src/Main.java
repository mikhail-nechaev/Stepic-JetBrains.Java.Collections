import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        if (!scan.hasNextLine()) return;
        String str = scan.nextLine();
        String[] r = str.split(" +");

        for (int i=0;i< r.length;i++) nameList.add(r[i]);
        System.out.print("[");
        int i=0;
        for (i = 0; i < nameList.size()-1; i++) System.out.print(nameList.get(i)+", ");
        System.out.println(nameList.get(i)+"]");
    }
}