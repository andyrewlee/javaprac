import java.util.Scanner;

public class LinearSearch
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("What number do you want to look for in my secret array?");
    int numToLookFor = keyboard.nextInt();

    // array doesn't have to be sorted
    int[] mySecretArr = new int[] {10, 23, 34, 20, 13, 8, 3, 50};

    for(int i = 0; i < mySecretArr.length; i++)
    {
      System.out.println("Currently looking for number " + numToLookFor);
      System.out.println("and comparing with the number " + mySecretArr[i]);
      if(numToLookFor == mySecretArr[i]) {
        System.out.println("FOUND THE NUMBER HERE IS THE INDEX: " + i);
        break;
      }
      System.out.println("They are not the same, moving on to the next number");
    }
  }
}
