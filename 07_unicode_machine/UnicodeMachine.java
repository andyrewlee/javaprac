import java.util.Scanner;

public class UnicodeMachine
{
  public static void main(String[] args)
  {
    System.out.println("Enter a character to convert into Unicode");
    Scanner keyboard = new Scanner(System.in);
    String userInput = keyboard.nextLine();

    // a string is a collection of characters
    //  0    1    2    3    4    5
    // 'h'  'e'  'l'  'l'  'l'  'o'
    System.out.println("Input has unicode value of: ");
    System.out.println((int) userInput.charAt(0));

    System.out.println("Char is in single quotes and String in double quotes");
    char myChar = 'A';
    String myString = "A";
    System.out.println("Char can be typecasted as integer to display its Unicode value");
    System.out.println("For example 'A' has a Unicode value of: ");
    System.out.println((int) myChar);
  }
}
