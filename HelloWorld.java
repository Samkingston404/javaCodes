import java.util.*; // Importing necessary Java utilities
public class Solution {
  // Method to return the formatted string with the name and age
  public static String printIt(String name, int age) {
    return name + " " + age; // Concatenates the name and age with a space in between
  }
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in); // Creating a Scanner object for user input
    String name = in.nextLine(); // Reading user's name as a string input
    int age = in.nextInt(); // Reading user's age as an integer input
    System.out.println(printIt(name, age)); // Printing the formatted output from the printIt method
  }
}
