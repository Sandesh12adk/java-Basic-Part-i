//Program to find the sum of the digits in the integer number entered by the user
import java.util.Scanner;
public class File4 {
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the number:");
      int quot= in.nextInt();
      int i= 0;
      int sum= 0;
      while(quot!=0){
        sum+= quot%10;
        quot= quot/10;
      }
      System.out.println("sum= " + sum);
    }

}
