import java.util.Scanner;

public class RecursiveFibonacci
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Which fibonacci number do you want?");
    int fibNum = keyboard.nextInt();

    int myFib = recursiveFibonacci(fibNum);
    System.out.println(fibNum + "th fibonacci number is " + myFib);
  }

  public static int recursiveFibonacci(int num)
  {
    if(num == 0)
    {
      return 0;
    }
    else if(num == 1 || num == 2)
    {
      return 1;
    }
    else
    {
      return recursiveFibonacci(num - 1) + recursiveFibonacci(num - 2);
    }
  }
}
