import java.math.BigDecimal;

// floating number literals are by default doubles
public class FloatingPointPrimitives
{
  public static void main(String[] args)
  {
    // floating number literals are by default doubles
    // even small literals can take on different values when converted to float
    // therefore we have to specify we want to use float with 'f'
    float f1 = 1.0f/3;
    double f2 = 1.0/3;

    System.out.println("FLOAT");
    System.out.println(f1);
    System.out.println("DOUBLE");
    System.out.println(f2);

    // we can see that java considers 1.0f and 1.0 differently

    boolean b1 = (0.1 == 0.1);
    boolean b2 = (0.1f == 0.1);
    boolean b3 = (1.0 == 1.0);
    boolean b4 = (1.0f == 1.0);

    System.out.println("0.1 == 0.1");
    System.out.println(b1);

    System.out.println("0.1f == 0.1");
    System.out.println(b2);

    System.out.println("1.0 == 1.0");
    System.out.println(b3);

    System.out.println("1.0f == 1.0");
    System.out.println(b4);

    // BigDecimal can represent all numbers
    // designed to represent fractions with finite-length decimal
    System.out.println("0.1f is actually " + new BigDecimal(0.1f));
    System.out.println("0.1 is actually " + new BigDecimal(0.1));

    System.out.println("1.0f is actually " + new BigDecimal(1.0f));
    System.out.println("1.0 is actually " + new BigDecimal(1.0));

    System.out.println("1.3f is actually " + new BigDecimal(1.3f));
    System.out.println("1.3 is actually " + new BigDecimal(1.3));
  }
}
