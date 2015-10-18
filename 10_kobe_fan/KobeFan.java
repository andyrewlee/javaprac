import java.util.Scanner;

public class KobeFan
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Is Kobe the greatest Laker of all time? Y/N");
    String response = keyboard.nextLine();

    if(response.toUpperCase().charAt(0) == 'Y')
      System.out.println("You are awesome, you are a good person");
    else
      System.out.println("You want a piece of me?");
  }
}
