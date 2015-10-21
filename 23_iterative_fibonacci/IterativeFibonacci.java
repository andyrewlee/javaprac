import java.util.Scanner;

public class IterativeFibonacci
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Which fibonacci number do you want?");
    int fibNum = keyboard.nextInt();

    int fib1 = 0;
    int fib2 = 1;
    int fib3;

    for(int i = 0; i < fibNum; i++)
    {
      fib3 = fib1 + fib2;
      fib1 = fib2;
      fib2 = fib3; 
    }

    System.out.println(fib1);
  }
}
