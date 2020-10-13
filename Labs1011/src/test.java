/*
 *Course: CS1011-051
 *Fall 2020-2021
 *File header contains class test
 *Name: Parker
 *Created 9/30/2020
 */

/*
 *  Course CS1011-051
 *  Fall 2020-2021
 *  test purpose: test class
 *  @author Parker
 *  @version created on 9/30/2020 at 11:59 PM
 */

import java.text.NumberFormat;
import java.util.Scanner;
import java.math.*;
import java.util.*;
public class test {
    public static void main(String[] args) {

        Random random = new Random(123);


        int i = 1000;
        while(i >0){
            int c = random.nextInt();
            System.out.println(c);
            --i;
        }
    }
}