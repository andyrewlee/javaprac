import java.util.Scanner;

public class LoveCalculator
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter first and last name of lover one: ");
    String loverOne = keyboard.nextLine();

    System.out.println("Enter first and last name of lover two: ");
    String loverTwo = keyboard.nextLine();

    System.out.println("Love Calculator results: ");

    // invoke length method in string object
    int result = loverOne.length() * 9999 + loverTwo.length() * 9999;

    // Java converts the number to string and concatenates them
    // always displays output strings even if it looks like numbers
    System.out.println(result % 100 + "%");
  }
}
