import java.util.Arrays;

public class InsertionSort
{
  public static void main(String[] args)
  {
    int[] bigO = new int[] {7, 6, 5, 4, 3, 2, 1};
    int[] bigOmega = new int[] {1, 2, 3, 4, 5, 6, 7};

    System.out.println("BIG O");
    insertionSort(bigO);
    System.out.println("BIG OMEGA");
    insertionSort(bigOmega);
  }

  public static void insertionSort(int[] arrToSort)
  {
    for(int i = 1; i < arrToSort.length; i++)
    {
      System.out.println(i + 1 + " time through OUTER loop is " + Arrays.toString(arrToSort));

      int temp = arrToSort[i];
      int counter = i;
      int innerLoopCount = 1;

      while(counter > 0 && arrToSort[counter - 1] > temp)
      {
        System.out.println("\t" + innerLoopCount + " time through INNER loop is " + Arrays.toString(arrToSort));

        arrToSort[counter] = arrToSort[counter - 1];
        counter--;
        innerLoopCount++;
      }

      arrToSort[counter] = temp;
    }
    System.out.println(Arrays.toString(arrToSort));
  }
}
