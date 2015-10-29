import java.util.Scanner;

public class RecursiveSum
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Add up numbers from 1 to what number?");
    int userInput = keyboard.nextInt();
    int sum = recursiveSum(userInput);

    System.out.println("Adding up numbers from 1 to " + userInput
                        + " is : " + sum);
  }
  public static int recursiveSum(int num)
  {
    if(num == 1)
    {
      return 1;
    } else {
      return num + recursiveSum(num - 1);
    }
  }

}
