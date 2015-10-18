public class CounterTwo
{
  public static void main(String[] args)
  {
    // print from 1 to 255 odds
    int count = 1;

    while(count < 256)
    {
      if(count % 2 != 0)
        System.out.println(count);
      count++;
    }
  }
}
