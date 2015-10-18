import java.util.Scanner;

public class StarsTwo
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("How many rows of stars do you want?");
    int userInput = keyboard.nextInt();
    int i;
    for(i = 1; i < userInput + 1; i++)
    {
      String output = "";
      int j;
      for(j = 0; j < i; j++)
      {
        output = output + "*";
      }
      System.out.println(output);
    }
  }
}
