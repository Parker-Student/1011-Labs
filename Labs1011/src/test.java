/*
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

public class test {
    public static void main(String[] args) {
     Date myStartTime = new Date();
     long startTime =myStartTime.getTime();
     long k=0;
     while (k<1000000000){
         k++;
     }
     Date myEndTime = new Date();
     long endTime=myEndTime.getTime();
     System.out.println("The elapsed time is " +
             "" + (endTime - startTime) + "milli sec");
    }
    }
