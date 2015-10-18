import java.util.Scanner;

public class AnnoyingMotivator
{
  public static void main(String[] args)
  {
    System.out.println("Have you eaten your veggies? Y/N");

    Scanner keyboard = new Scanner(System.in);
    String userInput = keyboard.nextLine();

    while(userInput.toUpperCase().charAt(0) != 'Y')
    {
      System.out.println("Have you eaten your veggies? Y/N");
      userInput = keyboard.nextLine();
    }

    System.out.println("I apologize for bugging you, you'll thank me one day");
  }
}
