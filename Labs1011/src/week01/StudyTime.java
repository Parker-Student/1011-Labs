/*
 *Course: CS1011-051
 *Fall 2020-2021
 *File header contains class StudyTime
 *Name: Parker
 *Created 9/10/2020
 */

package week01;
/*
 *  Course CS1011-051
 *  Fall 2020-2021
 *  StudyTime purpose: \
 *  @author Parker
 *  @version created on 9/10/2020 at 1:06 PM
 */

import java.util.Scanner;

public class StudyTime {
    public static void main(String[] args) {
        // Create a "reference variable"/object to gather data
        // from the keyboard
        Scanner in = new Scanner(System.in);

        // Request data from the user
        System.out.print("Enter the number of credits you are taking this term: ");
        int creditsTaken = in.nextInt();
        System.out.print("Enter the number of hours you plan to spend studying each week: ");
        int plannedHours = in.nextInt();

        // Calculate recommended hours of study
        int recommendedHoursLow = creditsTaken * 2;
        int recommendedHoursHigh = creditsTaken * 3;

        System.out.println("You are taking " + creditsTaken
                + " credits this term and plan to study " + plannedHours
                + " hours per week.");

        System.out.print("You plan to study ");
        if(plannedHours < recommendedHoursLow) {
            System.out.print("less than");
        } else if(plannedHours > recommendedHoursHigh) {
            System.out.print("more than");
        } else {
            System.out.print("in the range of");
        }
        System.out.println(" the recommended " + recommendedHoursLow + " - "
                + recommendedHoursHigh + " hours per week.");

    }

}
