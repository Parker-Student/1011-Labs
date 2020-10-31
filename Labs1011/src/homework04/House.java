/*
 *Course: CS1011-051
 *Fall 2020-2021
 *File header contains class House
 *Name: Parker
 *Created 10/22/2020
 */

package homework04;
/*
 *  Course CS1011-051
 *  Fall 2020-2021
 *  House purpose:
 *  @author Parker
 *  @version created on 10/22/2020 at 12:57 AM
 */

public class House {

    private double floorArea;
    private double salePrice;

//    House house = new House();

    public void build(double floorArea){
        floorArea = floorArea;
    }

    public void sell(){
        salePrice = 150 * floorArea;
        System.out.println(salePrice);

    }


}