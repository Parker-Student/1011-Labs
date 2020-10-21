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
    private int numSides;
    private int currentSide;
    private Random random;

    public Die(int numSides){
        //Die die = new Die();
        this.numSides = numSides;
        random = new Random();
        currentSide = rollDie();
    }

    public int getNumSides() {
        return numSides;
    }

    public void setNumSides(int numSides){
        this.numSides = numSides;
    }

    public int getCurrentValue(){
        return currentSide;
    }

    public int rollDie(){

        return random.nextInt(numSides)+1;

    }

    @Override
    public String toString(){
        return "Your called a " + currentSide;
    }


}