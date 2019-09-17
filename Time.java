import java.util.Scanner;


public class Time
{
  public static void main(String[] args) {
    Scanner new = new Scanner (System.in);


    int hour = static int random(1 - 12);
    int min = static int random(1 - 59);
    int sec = static int random(1 - 59);

    System.out.println("The time is " + hour+ ":" + min+ ":" + sec);
      }
}
