/*
 *Course: CS1011-051
 *Fall 2020-2021
 *File header contains class Lab2
 *Name: Parker
 *Created 9/16/2020
 */

package week02;
/*
 *  Course CS1011-051
 *  Fall 2020-2021
 *  Lab2 purpose: allow the user to preform various operations
 *  @author Parker
 *  @version created on 9/16/2020 at 1:13 PM
 */

import java.util.Scanner;

public class Lab2 {

    public static void main(String[] args) {
        while (inputLoop()) ;
    }

    //How Many Pennies
    public static int howManyPennies(double dollars) {
        return (int) (dollars * 100.0);
    }

    // Fraction
    public static double fraction(int numerator, int denominator) {
        return ((double) numerator) / denominator;
    }

    //Negate
    public static int negate(int value) {
        return value * -1;
    }

    //Last Half
    public static String lastHalf(String str) {
        int index = str.length() / 2;
        return str.substring(index);
    }

    //Make Initialization
    public static String makeInitialization(String name, int value) {
        return ("int " + name + " = " + value + ";");
    }
    public static String menu(){
        return ("Please enter a number to preform the selected operation: \r\n" +
                "1.Negate\r\n" +
                "2.How Many Pennies\r\n" +
                "3.Last Half\r\n" +
                "4.Make Initialization\r\n" +
                "5.Fraction\r\n" +
                "(Enter 6 to End)\r\n" +
                "Selection: ");
    }

    public static boolean inputLoop() {
        Scanner in = new Scanner(System.in);
       System.out.println(menu());
        switch (Integer.parseInt(in.nextLine())) {
            case 1:
                System.out.println("Enter a number you wish to negate:");
                System.out.println(negate(Integer.parseInt(in.nextLine())));
                break;
            case 2:
                System.out.println("Please use the following format (dollars.cents)\r\n" +
                        "Example: $2.18 -> 2.18 \r\n" +
                        "Enter an amount you wish to convert:");
                System.out.println(howManyPennies(Double.parseDouble(in.nextLine())) + " pennies");
                break;
            case 3:
                System.out.println("Enter a string of characters: \r\n");
                System.out.println(lastHalf(in.nextLine()));
                break;
            case 4:
                System.out.println("Enter a variable name:");
                String name = in.nextLine();
                System.out.println("Enter the variable value: ");
                System.out.println(makeInitialization(name, Integer.parseInt(in.nextLine())));

                break;
            case 5:
                System.out.println("Enter a numerator: ");
                int num = Integer.parseInt(in.nextLine());
                System.out.println("Enter a denominator:");
                System.out.println(fraction(num, Integer.parseInt(in.nextLine())));
                break;
            default:
                return false;

        }
        return true;
    }
}

