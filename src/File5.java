// Program to reverse the string. you will also be familiar with charAt() method after this program
 import java.util.Scanner;
public class File5{
public static void main(String[] args ) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the string:");
    String mystring = in.nextLine();
    for (int i = mystring.length() -1; i>= 0; i--) {
        char ch = mystring.charAt(i);
        System.out.print(ch);
    }
}
}
