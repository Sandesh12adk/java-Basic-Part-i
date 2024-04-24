import java.util.Scanner;
public class File8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = in.nextInt();
        int[] arr;
        int i= 0;
        arr= new int[100];
        while (n != 0) {
            arr[i]= n%10;
            n=n/10;
            i++;
        }
        for(int j=0; j<i; j++ ){
            System.out.print(arr[j]);
        }
    }
}