import java.util.Scanner;
import java.util.Random;

public class NinjaGold
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    Integer totalGold = 0;
    String choice;
    Integer gold;
    String building;

    do
    {
      System.out.println("Farm or Cave or House or Casino?");
      choice = keyboard.nextLine();
      char formattedChoice = choice.toUpperCase().charAt(0);


      if(formattedChoice == 'F')
      {
        // farm earns 10 - 20 golds
        gold = new Random().nextInt(11) + 10;
      }
      else if (formattedChoice == 'C' && choice.length() == 4)
      {
        // cave earns 5 - 10 golds
        gold = new Random().nextInt(6) + 5;
      }
      else if (formattedChoice == 'H')
      {
        // house earns 2 - 5 golds
        gold = new Random().nextInt(4) + 2;
      }
      else if (formattedChoice == 'C')
      {
        // casino earns/takes 0-50 golds
        int coinFlip = new Random().nextInt(1);
        gold = new Random().nextInt(50);
        if(coinFlip == 0)
          gold *= -1;
      }
      else
      {
        gold = null;
      }

      if(gold == null)
      {
        System.out.println("Invalid choice pick again");
      }
      else
      {
        totalGold += gold;

        if(gold > 0)
        {
          System.out.println("You chose " + choice + " and earned " + gold);
        }
        else if(gold < 0)
        {
          System.out.println("You chose " + choice + " and lost " + gold);
        }
        else
        {
          System.out.println("You chose " + choice + " and didn't earn anything");
        }
        System.out.println("You currently have " + totalGold + " gold");
      }
    }
    while(totalGold >= 0);
  }
}
