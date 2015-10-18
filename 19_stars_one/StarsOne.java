public class StarsOne
{
  public static void main(String[] args)
  {
    int i;
    for(i = 1; i < 11; i++)
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
