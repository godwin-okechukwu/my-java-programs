public class FizzBuzz
{
  public static void main(String[] args)
  {
    //Print the multiples of 3, 5 and 15 as
    //fizz, buzz and fizzbuzz, respectively
    for (int i = 1; i <= 20; i++){
      if (i % 15 == 0) System.out.println("FizzBuzz");
      else if (i % 3 == 0) System.out.println("Fizz");
      else if (i % 5 == 0) System.out.println("Buzz");
      else System.out.println(i);
    }
  }
}
