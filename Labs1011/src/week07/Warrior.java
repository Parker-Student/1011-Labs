/*
 *Course: CS1011-051
 *Fall 2020-2021
 *File header contains class Warrior
 *Name: Parker
 *Created 10/21/2020
 */

package week07;
/*
 *  Course CS1011-051
 *  Fall 2020-2021
 *  Warrior purpose:
 *  @author Parker
 *  @version created on 10/21/2020 at 12:31 PM
 */

public class Warrior {

    private int hitPoints;
    private Die d20;
    private Die d10;
    private Die d8;
    private Die d4;

    public Warrior() {
        d4 = new Die(20);
        d10 = new Die(10);
        d8 = new Die(8);
        d20 = new Die(20);
        hitPoints = setInitialHitPoints();

    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void takeDamage(int damage) {


    }

    public int attack(int type) {
        int damage = 0;
        if (type == 1) {
            d20.roll();
        }
        if (d20.getCurrentValue() >= 12) {
            for (int i = 0; i < 2; i++) {
                d8.roll();
                damage = d8.getCurrentValue();
            }
            System.out.println("You slash your sword, and hit the mugwump for " +
                    damage + " points of damage!");
            return damage;
        } else {
            System.out.println("You swing your sword, but miss!");
        }
          d20.roll();
        return damage;


}

    private int setInitialHitPoints() {
        int i = 0;
        do {
            hitPoints +=  d10.getCurrentValue();
        }while(i<6);

        return hitPoints;
    }


}