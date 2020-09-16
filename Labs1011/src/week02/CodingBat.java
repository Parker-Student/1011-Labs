/*
 *Course: CS1011-051
 *Fall 2020-2021
 *File header contains class CodingBat
 *Name: Parker
 *Created 9/16/2020
 */

package week02;
/*
 *  Course CS1011-051
 *  Fall 2020-2021
 *  CodingBat purpose:
 *  @author Parker
 *  @version created on 9/16/2020 at 1:02 PM
 */

public class CodingBat {
    //How Many Pennies
    public int howManyPennies(double dollars) {
        return (int)(dollars * 100.0);
    }
    // Fraction
    public double fraction(int numerator, int denominator) {
        return ((double)numerator)/denominator;
    }
    //Negate
    public int negate(int value) {
        return value * -1;
    }
    //Last Half
    String lastHalf(String str) {
        int index = str.length()/2;

        return str.substring(index);
    }
    //Make Initialization
    String makeInitialization(String name, int value) {
        return("int " + name + " = " + value + ";"  );
    }

}
