import java.util.*; // Importing necessary Java utilities
public class PrimeNumber {
  // Method to check if a number is prime
  public static boolean isPrime(int number) {
    if(number < 1) { // Check if the number is less than 1
        return false; // Numbers less than 1 are not prime
    }
    for(int i = 2; i <= Math.sqrt(number); i++) { // Loop from 2 to the square root of the number
        if(number % i == 0) { // Check if the number is divisible by i
            return false; // If it is divisible, it's not prime
        }
    }
    return true; // If no divisors were found, the number is prime
  }
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in); // Creating a Scanner object for user input
    int number = in.nextInt(); // Reading an integer input from the user
    System.out.println(isPrime(number)); // Printing the result of the isPrime method
  }
}
