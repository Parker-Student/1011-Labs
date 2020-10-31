/*
 *Course: CS1011-051
 *Fall 2020-2021
 *File header contains class ParkingLot
 *Name: Parker
 *Created 10/29/2020
 */

package week08;
/*
 *  Course CS1011-051
 *  Fall 2020-2021
 *  ParkingLot purpose:
 *  @author Parker
 *  @version created on 10/29/2020 at 10:56 AM
 */

public class ParkingLot {
    private String name;
    public static final double CLOSED_THRESHOLD = 80;
    private int capacity;
    private int carsInLot;
    private int startClosed;
    private int endClosed;

    ParkingLot(int capacity){
    this.capacity = capacity;
    }

    ParkingLot(String name, int capacity){
       this.capacity = capacity;
        this.name = name;

    }

    public void displayStatus(){
        System.out.println(this.name + " is " + getPercentFull() + "%");
    }

    public int getMinutesClosed(){
       return endClosed - startClosed;
    }

    public int getNumberOfSpotsRemaining(){
        return capacity - carsInLot;
    }

    public double getPercentFull(){
        return (carsInLot/capacity) * 100;
    }

    public boolean isClosed(){
        if(getPercentFull() >= CLOSED_THRESHOLD ){
            return true;
        }else{
            return false;
        }
    }

    public void markVehicleEntry(int timestamp){
    carsInLot++;
    if(isClosed()){
        startClosed = timestamp;
    }
    }

    public void markVehicleExit(int timestamp){
    carsInLot--;
        if(isClosed()){
            endClosed = timestamp;
        }
    }

    public String getName(){
        return "Blacktop" ;
    }

    

}