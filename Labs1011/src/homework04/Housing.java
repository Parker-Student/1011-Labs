/*
 *Course: CS1011-051
 *Fall 2020-2021
 *File header contains class Housing
 *Name: Parker
 *Created 10/22/2020
 */

package homework04;
/*
 *  Course CS1011-051
 *  Fall 2020-2021
 *  Housing purpose:
 *  @author Parker
 *  @version created on 10/22/2020 at 1:04 AM
 */


import java.util.Random;

public class Housing {

    public static void main(String[] args) {
        double floorArea;
        double totalFloorArea = 0;

        for(int i = 0; i < 3; i++){
           Random r = new Random();
           floorArea = 1000 + r.nextInt(1500);
           House house = new House();
           house.build(floorArea);
           totalFloorArea += floorArea;
           house.sell();
            System.out.println(totalFloorArea);

        }
    }

}