import java.util.Scanner;

public class file6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string or a text:");
        String line = in.nextLine();
        int n = 0;
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (Character.isLetter(ch)) {
                n++;
            }
        }
        System.out.println("Number of letters: " + n);
    }
}

