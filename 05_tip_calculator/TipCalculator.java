import java.util.Scanner;
import java.math.BigDecimal;

public class TipCalculator
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("What was your bill?");
    double bill = keyboard.nextDouble();

    System.out.println("Using double for tip");
    System.out.println(bill * 1.15);

    System.out.println("Using float for tip:");
    // if one number is double and other floating point, result will be double
    System.out.println(bill * 1.15f);

    System.out.println("Using Big Decimals for bill and tip: ");
    System.out.println(new BigDecimal(bill * 1.15));
  }
}
