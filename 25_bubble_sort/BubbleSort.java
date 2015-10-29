import java.util.Arrays;

public class BubbleSort
{
  public static void main(String[] args)
  {
    int[] bigO = new int[] {7, 6, 5, 4, 3, 2, 1};
    int[] bigOmega = new int[] {1, 2, 3, 4, 5, 6, 7};

    System.out.println("BIG O");
    bubbleSort(bigO);
    System.out.println("BIG OMEGA");
    bubbleSort(bigOmega);
  }

  public static void bubbleSort(int[] arrToSort)
  {
    boolean swapped;
    int count = 0;

    do
    {
      swapped = false;

      System.out.println(count + 1 + " time through OUTER loop is " + Arrays.toString(arrToSort));
      for(int i = 0; i < arrToSort.length - 1 - count; i++)
      {
        System.out.println("\t" + (i + 1) + " time through INNER loop is " + Arrays.toString(arrToSort));
        if(arrToSort[i] > arrToSort[i + 1])
        {
          int temp = arrToSort[i];
          arrToSort[i] = arrToSort[i+1];
          arrToSort[i + 1] = temp;
          swapped = true;
        }
      }
      count++;
    } while(swapped == true);

    System.out.println("Sorted array is: ");
    System.out.println(Arrays.toString(arrToSort));
  }
}
