/*
 *Course: CS1011-051
 *Fall 2020-2021
 *File header contains class GrowthRate
 *Name: Parker
 *Created 10/7/2020
 */

package week05;
/*
 *  Course CS1011-051
 *  Fall 2020-2021
 *  GrowthRate purpose:
 *  @author Parker
 *  @version created on 10/7/2020 at 12:57 PM
 */

import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;

public class GrowthRate {
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_RESET = "\u001B[0m";
    private static final int linearRange = 10000;
    private static final double exponentialRate = .01;
    private static int linearRate;

    public static void main(String[] args) {
        results();
    }

    public static int menuInput() {
        Scanner in = new Scanner(System.in);
        int input = 0;
        while (input != 2 && input != 1) {
            System.out.println(
                    "Your wealthy uncle gives you two options for inheritance" +
                    "\nInput 1 (Linear) or 2 (Exponential):");
            input = in.nextInt();
        }
        return input;
    }


    public static int calculate() {
        Random random = new Random();
        NumberFormat Format = NumberFormat.getCurrencyInstance();

        final int lifeSpan = 500;

        int weeks = random.nextInt(lifeSpan);
        linearRate = random.nextInt(linearRange);
        int i = weeks; //counter
        int endWeeks; //return weeks

        while (i > 0) {
            --i;

            double linear = linearRate * (weeks - i);
            double exponential = exponentialRate * (Math.pow(2, (weeks - i) - 1));


            if (linear > exponential) {
                System.out.println(
                        "Week " + (weeks - i) + ": " + ANSI_GREEN +
                                "Linear: " + Format.format(linear) + ANSI_RED +
                                " Exponential: " + Format.format(exponential) + ANSI_RESET);
            } else {

                endWeeks = weeks - i;
                System.out.println(
                        "Week " + endWeeks + ": " + ANSI_RED +
                                "Linear: " + Format.format(linear) + ANSI_GREEN +
                                " Exponential: " + Format.format(exponential) + ANSI_RESET + "\n");

                i = 0;


            }


        }


        return weeks;

    }

    public static void results() {
        Scanner in = new Scanner(System.in);
        NumberFormat Format = NumberFormat.getCurrencyInstance();
        int input = menuInput();
        int weeks = calculate();

        double linear = linearRate * weeks;
        double exponential = exponentialRate * (Math.pow(2, weeks - 1));

        double difference = linear - exponential;

        if (input == 1 && 0 > difference) {
            System.out.println("Got unlucky and missed out on: " + Format.format(Math.abs(difference)));

        } else if (input == 1 && 0 < difference) {
            System.out.println("Got lucky and ended up with an extra: " + Format.format(Math.abs(difference)));

        } else if (input == 2 && 0 > difference) {
            System.out.println("Got lucky and ended up with an extra: " + Format.format(Math.abs(difference)));

        } else if (input == 2 && 0 < difference) {
            System.out.println("Got unlucky and missed out on: " + Format.format(Math.abs(difference)));

        } else {
            results();
        }

        System.out.println("\nYour uncle died after " + weeks + " weeks");
        System.out.println("\nEnter 1 to play again: ");

        int k = in.nextInt();
        ;
        while (k == 1) {
            results();
        }
        ;

    }
}