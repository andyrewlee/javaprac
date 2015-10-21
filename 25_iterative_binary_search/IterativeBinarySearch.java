import java.util.Scanner;

public class IterativeBinarySearch
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("What number do you want to look for in my secret array?");
    int numToLookFor = keyboard.nextInt();

    // array HAS to be sorted
    int[] mySecretArr = new int[] {10, 23, 34, 20, 13, 8, 3, 50};

    int low = 0;
    int high = mySecretArr.length -1;
    boolean found = false;

    while(low <= high)
    {
      int mid = (low + high)/ 2;

      if(mySecretArr[mid] > numToLookFor)
      {
        high = mid - 1;
      }
      else if(mySecretArr[mid] < numToLookFor)
      {
        low = mid + 1;
      }
      else
      {
        found = true;
        System.out.println("FOUND THE NUMBER HERE IS THE INDEX " + mid);
        break;
      }
    }
    if(!found)
    {
      System.out.println("Unfortunately " + numToLookFor + " doesn't exist");
    }
  }
}
