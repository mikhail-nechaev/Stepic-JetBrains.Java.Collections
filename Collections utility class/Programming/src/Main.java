import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    List<Integer> list = new ArrayList<>();

    String elements = scan.nextLine();
    int spaces = 0;
    for (int i = 0; i < elements.length(); i++)
    {
      if (elements.charAt(i) == ' ')
      {
        ++spaces;
      }
    }

    if (spaces == 0)
    {
      list.add(Integer.parseInt(elements));
    }
    else
    {

      int begin = 0;
      int end = 0;
      int spaceCur = 0;
      for (int i = 0; i < elements.length(); i++)
      {
        if (elements.charAt(i) == ' ')
        {
          end = i;
          String buf = elements.substring(begin, end);
          list.add(Integer.parseInt(buf));
          begin = end + 1;
          ++spaceCur;
        }

        if (spaceCur == spaces)
        {
          String buf = elements.substring(i + 1);
          list.add(Integer.parseInt(buf));
          break;
        }
      }
    }

    int times = scan.nextInt();

    for (int i = 0; i < times; i++)
    {
      Collections.swap(list, scan.nextInt(), scan.nextInt());
    }


    for (int current: list)
    {
      System.out.print(current + " ");
    }
  }
}
