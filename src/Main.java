package com.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ClassFirst.methodFirst();
        ClassSecond.methodSecond();
        ClassThird.methodThird();
    }
}

class ClassFirst {
    // Write a Java program to print 'Hello' on screen and your name on a separate line.
    // Expected Output :
    // Hello
    // Sandesh adhikari

    public static void methodFirst() {
        System.out.println("Hello");
        System.out.println("Sandesh adhikari");
    }
}

class ClassSecond {
    // A program to add two numbers
    public static void methodSecond() {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = myobj.nextInt();
        System.out.println("Enter second number");
        int b = myobj.nextInt();
        int sum = a + b;
        System.out.println("Sum= " + sum);
    }
}
class ClassThird{
    public static void methodThird(){
        System.out.println("Enter the number");
        Scanner obj = new Scanner(System.in);
        int a= obj.nextInt();
        for(int i=1; i<=10; i++){
            System.out.printf("%d * %d= %d%n",a,i,(a*i));
        }
    }
}