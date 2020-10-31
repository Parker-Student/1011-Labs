/*
 *Course: CS1011-051
 *Fall 2020-2021
 *File header contains class Die
 *Name: Parker
 *Created 10/21/2020
 */

package week07;
/*
 *  Course CS1011-051
 *  Fall 2020-2021
 *  Die purpose:
 *  @author Parker
 *  @version created on 10/21/2020 at 12:31 PM
 */

import java.util.Random;

public class Die {
    private int numSides = 0;
    private int currentValue;
    private Random generator;

    public Die(int numSides) {
        final int defaultValue = 6;
        final int maxSides = 100;
        final int minSides = 2;
        if (numSides < minSides || numSides > maxSides) {
            this.numSides = defaultValue;

        } else {
            this.numSides = numSides;
        }

    }

    public int getCurrentValue() {
        return currentValue;
    }

    public void roll() {
        generator = new Random();
        currentValue = generator.nextInt(numSides) + 1;
    }

}