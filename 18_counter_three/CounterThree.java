import java.util.Scanner;

public class CounterThree
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("What number should I go up to?");
    int limit = keyboard.nextInt() + 1;
    keyboard.nextLine();

    System.out.println("Odds or Evens or All? O/E/A");
    char choice = keyboard.nextLine().toUpperCase().charAt(0);;

    int count = 1;

    while(count < limit)
    {
      if(choice == 'A')
        System.out.println(count);
      else
      {
        if(choice == 'O' && count % 2 != 0)
          System.out.println(count);
        else if(choice =='E' && count % 2 == 0)
          System.out.println(count);
      }
      count++;
    }
  }
}
