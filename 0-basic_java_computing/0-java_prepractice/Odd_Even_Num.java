public class Odd_Even_Num
{
  public static void main(String[] args)
  {
    //Prints a list of numbers, indicating whether
    // each one is an odd or even number
    for (int i = 1; i <= 20; i++)
      if (i % 2 == 0) System.out.println(i + " is an even number");
      else System.out.println(i + " is an odd number");
  }
}
