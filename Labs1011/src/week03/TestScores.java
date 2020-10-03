package week03;/*
 *Course: CS1011-051
 *Fall 2020-2021
 *File header contains class test
 *Name: Parker
 *Created 9/18/2020
 */

/*
 *  Course CS1011-051
 *  Fall 2020-2021
 *  test purpose: testing class
 *  @author Parker
 *  @version created on 9/18/2020 at 12:24 PM
 */

import java.util.Date;
import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
    while (done());
    }// end main.

    public static boolean done(){
     Scanner in = new Scanner(System.in);
        int score;
        int scoreSum = 0;
        int count = 0;
        double average = 0;
     do{
         System.out.println("Enter score (-1 to quit): ");
         score = in.nextInt();
         scoreSum += score;
         count ++;
         average = (double) scoreSum/count;

    }while(score >= 0);
        System.out.println("Average score is " + average);
        return false;
    }

} // end class SumOddInts


