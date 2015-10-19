import java.util.Scanner;

// non floating number literals are by default ints
public class IntegerPrimitives
{
  public static void main(String[] args)
  {
    // type name: byte
    // kind of value: integer
    // memory used: 1 byte
    byte maxByte = 127;

    // type name: short
    // kind of value: short
    // memory used: 2 bytes
    short maxShort = 32767;

    // type name: int
    // kind of value: integer
    // memory used: 4 byte
    int maxInt = 2147483647;

    // type name: long
    // kind of value: integer
    // memory used: 8 byte
    long maxLong = 9223372036854775807l;

    System.out.println("Max value of a byte is: ");
    System.out.println(maxByte);
    System.out.println("Min value of a byte is: ");
    System.out.println(maxByte * -1 + -1);

    System.out.println("Max value of a short is: ");
    System.out.println(maxShort);
    System.out.println("Min value of a short is: ");
    System.out.println(maxShort * -1 + -1);

    System.out.println("Max value of an int is: ");
    System.out.println(maxInt);
    System.out.println("Min value of an int is: ");
    System.out.println(maxInt * -1 + -1);

    System.out.println("Max value of a long is: ");
    System.out.println(maxLong);
    System.out.println("Min value of a long is: ");
    System.out.println(maxLong * -1 + -1);
  }
}
