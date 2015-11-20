import java.util.Scanner;

public class ScannerDemo
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("How old are you?: ");
    int age = keyboard.nextInt();
    keyboard.nextLine();

    System.out.println("What is your name?: ");
    String name = keyboard.nextLine();

    System.out.println("Double your age is: ");
    System.out.println(age * 2);
    System.out.println("Double your name is: ");
    System.out.println(name + name);
  }
}
