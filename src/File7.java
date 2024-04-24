// Program to check the word is Palindrome or not
import java.util.Scanner;
public class File7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = in.next();
        MyClass.paliChecker(str);
    }
}
class MyClass {
    public static void paliChecker(String str) {
        int left = 0;
        int right = str.length() - 1;
    while(left<right)

    {
        if (str.charAt(left) != str.charAt(right)) {
           System.out.println("The word is not palindrom");
           return;
        }
        right--;
        left++;
    }
        System.out.println("The word is  palindrom");
    return;
}
}
