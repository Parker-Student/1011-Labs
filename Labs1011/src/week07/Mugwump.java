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

public class Mugwump {

        private int hitPoints;
        private int maxHitPoints;

        // add methods here


        public int getHitPoints() {
                return hitPoints;
        }


        /**
         * This method handles the attack logic
         * @return the amount of damage an attack has caused, 0 if the attack misses or
         *         a negative amount of damage if the Mugwump heals itself
         */
        public int attack() {
            // get attack type from ai

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
         int standIn = 0;
                return standIn;
    }
}