import java.util.*;
public class EvenOrOdd {
  public static String evenOrOdd(int number) {
    StringBuilder result = new StringBuilder();
    if(number % 2 == 0) {
        result.add("Even");
    }
    else {
        result.add("Odd");
    }
    return result.toString();
  }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println(evenOrOdd(number));
    }
}