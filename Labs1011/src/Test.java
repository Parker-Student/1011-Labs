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
public class Test {

    public static void main(String[] ignored) {
        Fraction x = new Fraction(1, 3);
        Fraction y = new Fraction(2, 7);
        swap(x, y);
        System.out.println(x);
    }

    public static void swap(Fraction a, Fraction b) {
        int temp = a.numerator;
        a.numerator = b.numerator;
        b.numerator = temp;
        temp = a.denominator;
        a.denominator = b.denominator;
        b.denominator = temp;
    }
    public static class Fraction {
        private int numerator;
        private int denominator;

        public Fraction(int num, int den) {
            numerator = num;
            denominator = den;
        }

        public String toString() {
            return numerator + "/" + denominator;
        }
    }
    }
