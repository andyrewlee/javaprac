import java.util.Scanner;

public class FizzBuzz
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter a number: ");
    int userInput = keyboard.nextInt();

    if(userInput % 5 == 0 && userInput % 3 == 0)
      System.out.println("Fizz Buzz");
    else if(userInput % 5 == 0)
      System.out.println("Fizz");
    else if(userInput % 3 == 0)
      System.out.println("Buzz");
    else
      System.out.println(userInput);
  }
}
