/*
 *Course: CS1011-051
 *Fall 2020-2021
 *File header contains class Loops
 *Name: Parker
 *Created 10/1/2020
 */

package week04;
/*
 *  Course CS1011-051
 *  Fall 2020-2021
 *  Loops purpose: generate pi stuff
 *  @author Parker
 *  @version created on 10/1/2020 at 12:07 PM
 */

import java.util.Random;
import java.util.Scanner;

public class PiEstimate {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);

        double pointsIn = 0;
        double pointsOut = 0;
        double x;
        double y;

        System.out.println("How many points: ");
        int input = in.nextInt();

        while(input > 0){
            x = rand.nextDouble();
            y = rand.nextDouble();

            if (Math.sqrt((x * x) + (y * y)) <= 1) {
                ++pointsIn;
            } else {
                ++pointsOut;
            }
            --input;

        }
        double Pi = (pointsIn / (pointsIn+pointsOut)) *4;

        System.out.println("The points in the circle were: " + pointsIn);
        System.out.println("The points outside the circle was: " + pointsOut);
        System.out.println("Pi Estimate " + Pi);
    }
}