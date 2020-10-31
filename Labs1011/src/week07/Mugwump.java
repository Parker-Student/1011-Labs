/*
 *Course: CS1011-051
 *Fall 2020-2021
 *File header contains class Mugwump
 *Name: Parker
 *Created 10/21/2020
 */

package week07;
/*
 *  Course CS1011-051
 *  Fall 2020-2021
 *  @author Parker
 *  @version created on 10/21/2020 at 12:29 PM
 */

import java.util.Random;

public class Mugwump {

        private int hitPoints;
        private int maxHitPoints;
        private Die d20;
        private Die d10;
        private Die d8;
        private Die d4;

    public Mugwump(){
        d4 = new Die(20);
        d10 = new Die(10);
        d8 = new Die(8);
        d20 = new Die(20);
        hitPoints = setInitialHitPoints();

    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void takeDamage(int damage){

        hitPoints -= damage;
    }

    private int setInitialHitPoints(){
        int i = 0;
        do {
        maxHitPoints +=  d10.getCurrentValue();
        }while(i<10);

        return maxHitPoints;
    }

        /**
         * This method handles the attack logic
         * @return the amount of damage an attack has caused, 0 if the attack misses or
         *         a negative amount of damage if the Mugwump heals itself
         */
        public int attack() {
            // get attack type from ai
                ai();
            // roll attack die

            // determine results of attack

            // return the damage
                int damage = 0;
                return damage;
        }

        /**
         * This method determines what action the Mugwump performs
         * @return 1 for a Claw attack, 2 for a Bite, and 3 if the Mugwump licks its wounds
         */
        private int ai() {
        //if(){}


         Random r = new Random();
         int random = r.nextInt(3)+1;
         if(random > 1){
             return 1;
         }else{
             return 2;
         }

    }
}