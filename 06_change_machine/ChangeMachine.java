import java.util.Scanner;

public class ChangeMachine
{
  public static void main(String[] args)
  {
    System.out.println("Enter number of pennies");
    Scanner keyboard = new Scanner(System.in);
    int amount = keyboard.nextInt();

    int quarters = amount / 25;
    amount = amount % 25;
    System.out.println(quarters + " Quarters");

    int dimes = amount / 10;
    amount = amount % 10;
    System.out.println(dimes + " Dimes");

    int nickels = amount / 5;
    amount = amount % 5;
    System.out.println(dimes + " Nickels");

    int pennies = amount;
    System.out.println(pennies + " Pennies");
  }
}
