import java.util.*;
public class Solution {
  public static String printIt(String name, int age) {
    return name+" "+age;
  }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        int age = in.nextInt();
        System.out.println(printIt(name, age));
    }
}