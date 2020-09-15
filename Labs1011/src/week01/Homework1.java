/*
 *Course: CS1011-051
 *Fall 2020-2021
 *File header contains class Homework1
 *Name: Parker
 *Created 9/15/2020
 */

package week01;
/*
 *  Course CS1011-051
 *  Fall 2020-2021
 *  Homework1 purpose: accept input and print to screen
 *  @author Parker
 *  @version created on 9/15/2020 at 9:27 AM
 */

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a number:");
        int input = in.nextInt();
        System.out.println("You entered " + input);
    }

}