import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<Integer> list = new ArrayList<>();

            while (scanner.hasNextInt()) {
                list.add(scanner.nextInt());
            }

            List<Integer> arrayList = new ArrayList<>();


            for (int i = 0; i < list.size(); i++) {
                if (i % 2 != 0){
                    arrayList.add(list.get(i));
                }
            }

            for (int i = arrayList.size() - 1; i >= 0; i--) {
                System.out.print(arrayList.get(i) + " ");
            }
        }
    }
}