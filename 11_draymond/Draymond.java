public class Draymond
{
  public static void main(String[] args)
  {
    boolean klayThompson = true;
    boolean stephCurry = true;

    String champions = "Golden State Warriors";
    String losers = "Cleveland Cavaliers";

    System.out.println("Klay Thompson?");
    if(klayThompson)
      System.out.println("Yup.");
    else
      System.out.println("Nope.");

    System.out.println("Splash Brothers?");
    if(klayThompson && stephCurry)
      System.out.println("Yup.");
    else
      System.out.println("Nope.");

    System.out.println("We won?");
    if(losers == "Cleveland Cavaliers" || champions == "Golden State Warriors")
      System.out.println("Yup.\nThey Suck?\nYup.\nWe here?\nYup.\nThey not?\nNope.");
    else
      System.out.println("Nope.\nThey Suck?\nNope.\nWe here?\nNope.\nThey not?\nYup.");
  }
}
