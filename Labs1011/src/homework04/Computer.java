/*
 *Course: CS1011-051
 *Fall 2020-2021
 *File header contains class Computer
 *Name: Parker
 *Created 10/21/2020
 */

package homework04;
/*
 *  Course CS1011-051
 *  Fall 2020-2021
 *  Computer purpose:
 *  @author Parker
 *  @version created on 10/21/2020 at 7:28 PM
 */

import java.util.Scanner;

public class Computer {
    private String processor;
    private long ramSize = (long) 1000000000.0;
    private long diskSize;
    private double cost;

    public void assignProcessor(){
        Scanner stdIn = new Scanner(System.in);
        this.processor = stdIn.nextLine();
    }

    public void assignRamSize(){
        this.ramSize = (long) 3000000000.0;
    }

    public void assignDiskSize(){
        Scanner stdIn = new Scanner(System.in);
        long diskSize;  //This line is unneeded and in fact it breaks the outcome of the program.
        diskSize = stdIn.nextLong();
    }

    public void calculateCost(){
        this.cost = this.ramSize / 20000000.0 +
                this.diskSize /20000000.0;
        if (this.processor.equals("Intel")){
            this.cost += 200;
        }else{
            this.cost+= 150;
        }
    }
    public void printSpecification(){
        System.out.println("Processor = " +this.processor);
        System.out.println("RAM = " +this.ramSize);
        System.out.println("Hard disk size = " + this.diskSize);
        System.out.println("Cost = $"+this.cost);
    }
}