/*
 *Course: CS1011-051
 *Fall 2020-2021
 *File header contains class PlayGame
 *Name: Parker
 *Created 10/23/2020
 */

package midterm02;
/*
 *  Course CS1011-051
 *  Fall 2020-2021
 *  PlayGame purpose:
 *  @author Parker
 *  @version created on 10/23/2020 at 1:40 PM
 */

import java.util.Scanner;

public class PlayGame {


    private static void playGame() {

    }

    public static void main(String[] args) {
        boolean loop = true;
        while (loop) {
            Scanner in = new Scanner(System.in);
            System.out.println("Do you want to play a game(y/n)");
            String input = in.nextLine();
            if (input.equals("y") || input.equals("Y")) {
                playGame();
            } else if (input.equals("N") || input.equals("n")) {
                loop = false;

            }


        }
    }
}