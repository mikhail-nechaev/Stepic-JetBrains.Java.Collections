import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    int firstLoad = 0;
    int secondLoad = 0;

    StringBuilder firstQueue = new StringBuilder();
    StringBuilder secondQueue = new StringBuilder();

    Scanner scanner = new Scanner(System.in);
    scanner.nextInt();

    while (scanner.hasNextInt()){
      String id = scanner.next();
      int load = scanner.nextInt();

      if (secondLoad < firstLoad){
        secondLoad += load;
        secondQueue.append(id).append(" ");
      } else {
        firstLoad += load;
        firstQueue.append(id).append(" ");
      }
    }

    System.out.println(firstQueue.toString());
    System.out.println(secondQueue.toString());

  }

}