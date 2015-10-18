// we have three classes: Calculator, Scanner and System in this file
import java.util.Scanner;

public class Calculator
{
  public static void main(String[] args)
  {
    // we are creating an instance of the class Scanner that we imported
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter first number: ");

    // we can store data in variables
    // we have to specify what type of data we are strong
    int n1 = keyboard.nextInt();

    System.out.println("Enter second number: ");

    // invoke nextInt method in keyboard
    int n2 = keyboard.nextInt();

    System.out.println("Sum of two numbers is: ");
    System.out.println(n1 + n2);
  }
}
