import java.util.Scanner;

public class RecursiveFactorial
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Find factorial of what number?");
    int userInput = keyboard.nextInt();
    int output = recursiveFactorial(userInput);

    System.out.println("Factorial of " + userInput + " is " + output);
  }
  public static int recursiveFactorial(int num)
  {
    if(num == 1 || num == 2)
    {
      return num;
    }
    else
    {
      return num * recursiveFactorial(num - 1);
    }
  }
}
