/*
 *Course: CS1011-051
 *Fall 2020-2021
 *File header contains class BattleSim
 *Name: Parker
 *Created 10/21/2020
 */

package week07;
/*
 *  Course CS1011-051
 *  Fall 2020-2021
 *  BattleSim purpose:
 *  @author Parker
 *  @version created on 10/21/2020 at 12:30 PM
 */

import java.util.Scanner;

/**
 * BattleSim Driver for Battle Simulator 3000
 */
public class BattleSim {

    public static final Die INITIATIVE_DIE = new Die(10);

    public static void main(String[] args) {
        // Local variables
        // Include any variable that will need to be accessed throughout the program here
        Scanner in = new Scanner(System.in);
        // sentinel value for the game loop
        boolean play;
        // String used to determine the winner of the epic battle
        // game loop
        do {
            // print the introduction and rules
            intro();
            // initialize game
            // Initialize the Warrior and Mugwump classes, set the current victor to "none"
            Warrior warrior = new Warrior();
            Mugwump mugwump = new Mugwump();
            String victor = "none";
            // while neither combatant has lost all of their hit points, report status and battle!
            while (victor.equalsIgnoreCase("none")) {
                report(warrior, mugwump);
                victor = battle(warrior, mugwump, in);
            }
            // declare the winner
            victory(victor);


            // ask to play again
            play = playAgain(in);

        } while (play);
        // Thank the user for playing your game
        System.out.println("Thanks for playing!");
    }

    /**
     * This method displays the introduction to the game and gives a description of the rules.
     */
    private static void intro() {
        // Write a suitable introduction to your game
        System.out.println("Welcome to Battle Simulator 3000! The world's more low tech battle simulator!\n" +
                "You are a Valiant Warrior defending your humble village from an evil Mugwump! Fight bravely, \n" +
                "or the citizens of your town will be the Mugwump's dinner!\n" +
                "\n" +
                "You have your Trusty Sword, which deals decent damage, but can be tough to hit with sometimes. \n" +
                "You also have your Shield of Light, which is not as strong as your sword, but is easier to deal \n" +
                "damage with.\n" +
                "\n" +
                "Let the epic battle begin!");
    }

    /**
     * This method handles the battle logic for the game.
     *
     * @param warrior The Warrior of Light!
     * @param mugwump The Evil Mugwump!
     * @return The name of the victor, or "none", if the battle is still raging on
     */
    private static String battle(Warrior warrior, Mugwump mugwump, Scanner in) {
        // determine who attacks first (Roll! For! Initiative!) and store the result
        int init = initiative();
        do {
            if (init == 1) {
                // attack code
                // If the Warrior attacks first

                mugwump.takeDamage(warrior.attack(attackChoice(in)));


                // Warrior attacks and assigns the resulting damage to the mugwump
                // Check if the Mugwump has been defeated
                ++init;

            } else if (init == 2) {
                // If not, Mugwump attacks!
                warrior.takeDamage(mugwump.attack());
                // Otherwise, the Warrior wins!
                // Otherwise the Mugwump is first
                // see above

                --init;
            }

            report(warrior, mugwump);
        }while (warrior.getHitPoints()>0 && mugwump.getHitPoints() > 0);



        // If neither combatant is defeated, the battle rages on!

        String victor = "o";
        return victor;
    }

    /**
     * This method reports the status of the combatants
     *
     * @param warrior The Warrior of Light!
     * @param mugwump The Evil Mugwump!
     */
    private static void report(Warrior warrior, Mugwump mugwump) {
        // TODO
        System.out.println("Warrior HP: " + warrior.getHitPoints());
        System.out.println("Mugwump HP: " + mugwump.getHitPoints());
    }

    /**
     * This method asks the user what attack type they want to use and returns the result
     *
     * @return 1 for sword, 2 for shield
     */
    private static int attackChoice(Scanner in) {
        // TODO
        int input = 0;
        while (input != 1 && input != 2) {
            System.out.println("Would you like to use your: Sword(1), Shield(2)?");
            input = in.nextInt();
        }
        return input;
    }

    /**
     * Determines which combatant attacks first and returns the result. In the case of a tie,
     * re-roll.
     *
     * @return 1 if the warrior goes first, 2 if the mugwump goes first
     */
    private static int initiative() {
        // roll for initiative for both combatants
        // until one initiative is greater than the other
        int playerInitiative = 0;
        int mugwumpInitiative = 0;
        while (playerInitiative == mugwumpInitiative) {
            INITIATIVE_DIE.roll();
            playerInitiative = INITIATIVE_DIE.getCurrentValue();
            INITIATIVE_DIE.roll();
            mugwumpInitiative = INITIATIVE_DIE.getCurrentValue();

        }
        if (playerInitiative > mugwumpInitiative) {
            return 1;
        } else {
            return 2;
        }
    }

    /**
     * This method declares the victor of the epic battle
     *
     * @param victor the name of the victor of the epic battle
     */
    private static void victory(String victor) {
        // TODO
    }

    /**
     * This method asks the user if they would like to play again
     *
     * @param in Scanner
     * @return true if yes, false otherwise
     */
    private static boolean playAgain(Scanner in) {
        // TODO
        char again;

        do {
            System.out.println("Would you like to play again?(y/n)");
            again = in.nextLine().toLowerCase().charAt(0);
        } while (again != 'y' && again !='n');

        if (again == 'y') {
            return true;
        } else {
            return false;
        }
    }
}