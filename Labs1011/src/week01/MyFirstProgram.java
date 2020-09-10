package week01;

import java.util.Scanner;

public class MyFirstProgram {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Scanner keyboardInput = new Scanner(System.in);

        System.out.println("Please input a number");

        int number = keyboardInput.nextInt();
        System.out.println("You entered " + number);


    }
}
