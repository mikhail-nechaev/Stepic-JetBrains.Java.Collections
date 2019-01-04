import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red");
        for (String s : nameList) {
            System.out.println(s);
        }
    }
}