import java.util.Scanner;

public class Greeter
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter first name: ");
    String firstName = keyboard.nextLine();

    System.out.println("Enter last name: ");
    String lastName = keyboard.nextLine();

    System.out.println("Your Korean name is:");
    System.out.println(lastName + " " + firstName);
  }
}
