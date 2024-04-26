// Code to convert the decimal number into binary
import java.util.Scanner;
public class File3 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Scanner in = new Scanner(System.in); // Here in is the object or instance or the class Scanner
        System.out.println("Enter the decimal number");
        int quot = in.nextInt();
        int i = 0;
        while (quot != 0) {
            array[i] = quot % 2;
            quot = quot / 2;
            i++;
        }
        System.out.println("Binary Representation");
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(array[j]);
        }

    }
}
