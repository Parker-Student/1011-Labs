/*
 *Course: CS1011-051
 *Fall 2020-2021
 *File header contains class ComputerDriver
 *Name: Parker
 *Created 10/21/2020
 */

package homework04;
/*
 *  Course CS1011-051
 *  Fall 2020-2021
 *  ComputerDriver purpose:
 *  @author Parker
 *  @version created on 10/21/2020 at 7:26 PM
 */

public class ComputerDriver {
    public static void main(String[] args) {
        Computer myPc = new Computer();
        myPc.assignProcessor();
        myPc.assignRamSize();
        myPc.assignDiskSize();
        myPc.calculateCost();
        myPc.printSpecification();
    }
}