public class Needle
{
  public static void main(String[] args)
  {
    String haystack = "//////////////////////////////needle////////";
    int startingIndex = haystack.indexOf("needle");
    int endingIndex = startingIndex + "needle".length();

    System.out.println(endingIndex);

    // invoke substring method in haystack object
    // which is an instance of the String class
    String needle = haystack.substring(startingIndex, endingIndex);
    System.out.println(needle);
  }
}
