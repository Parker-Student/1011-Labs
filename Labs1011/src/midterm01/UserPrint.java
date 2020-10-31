package midterm01;/*
 *Course: CS1011-051
 *Fall 2020-2021
 *File header contains class UserPrint
 *Name: Parker Foord
 *Created 10/2/2020
 */

/*
 *  Course CS1011-051
 *  Fall 2020-2021
 *  UserPrint purpose: To print user input to the console
 *  @author Parker Foord
 *  @version created on 10/2/2020 at 1:13 PM
 */

import java.util.Scanner;

public class UserPrint {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = in.nextInt();
        System.out.println("You entered: " + input);

    }
}