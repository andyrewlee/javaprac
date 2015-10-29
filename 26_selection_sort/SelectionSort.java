import java.util.Arrays;

public class SelectionSort
{
  public static void main(String[] args)
  {
    int[] bigO = new int[] {7, 6, 5, 4, 3, 2, 1};
    int[] bigOmega = new int[] {1, 2, 3, 4, 5, 6, 7};

    System.out.println("BIG O");
    selectionSort(bigO);
    System.out.println("BIG OMEGA");
    selectionSort(bigOmega);
  }

  public static void selectionSort(int[] arrToSort)
  {
    for(int i = 0; i < arrToSort.length; i++)
    {
      System.out.println(i + 1 + " time through OUTER loop is " + Arrays.toString(arrToSort));
      int minIndex = i;

      for(int j = i; j < arrToSort.length; j++)
      {
        System.out.println("\t" + (j - i + 1) + " time through INNER loop is " + Arrays.toString(arrToSort));
        if(arrToSort[j] < arrToSort[minIndex]) {
          minIndex = j;
        }
      }
      if(minIndex != i)
      {
        int temp = arrToSort[i];
        arrToSort[i] = arrToSort[minIndex];
        arrToSort[minIndex] = temp;
      }
    }
    System.out.println(Arrays.toString(arrToSort));
  }
}
