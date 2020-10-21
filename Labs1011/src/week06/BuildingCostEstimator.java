/*
 *Course: CS1011-051
 *Fall 2020-2021
 *File header contains class BuildingCostEstimator
 *Name: Parker
 *Created 10/14/2020
 */

package week06;
/*
 *  Course CS1011-051
 *  Fall 2020-2021
 *  BuildingCostEstimator purpose:
 *  @author Parker
 *  @version created on 10/14/2020 at 10:54 AM
 */

public class BuildingCostEstimator {

    private int NumFullBaths;
    private int NumHalfBaths;
    private int NumBedrooms;
    private int NumWindows;
    private double NumGarages;
    private int SquareFeet;

    public BuildingCostEstimator() {
        setNumWindows(NumWindows);
        setNumGarages(NumGarages);
        setNumBedrooms(NumBedrooms);
        setNumFullBaths(NumFullBaths);
        setNumHalfBaths(NumHalfBaths);
        setSquareFeet(SquareFeet);
    }

    public int getNumFullBaths() {
        return NumFullBaths;
    }

    public void setNumFullBaths(int numFullBaths) {
        NumFullBaths = numFullBaths;
    }

    public int getNumHalfBaths() {
        return NumHalfBaths;
    }

    public void setNumHalfBaths(int numHalfBaths) {
        NumHalfBaths = numHalfBaths;
    }

    public int getNumBedrooms() {
        return NumBedrooms;
    }

    public void setNumBedrooms(int numBedrooms) {
        NumBedrooms = numBedrooms;
    }

    public int getNumWindows() {
        return NumWindows;
    }

    public void setNumWindows(int numWindows) {
        NumWindows = numWindows;
    }

    public double getNumGarages() {
        return NumGarages;
    }

    public void setNumGarages(double numGarages) {
        NumGarages = numGarages;
    }

    public int getSquareFeet() {
        return SquareFeet;
    }

    public void setSquareFeet(int squareFeet) {
        SquareFeet = squareFeet;
    }

    public double costToBuild() {
        double total =
                (NumBedrooms * 3000) +
                        (NumFullBaths * 20000) +
                        (NumHalfBaths * 7000) +
                        (NumGarages * 8000) +
                        (NumWindows * 10000) +
                        (SquareFeet * 135);

        return total;
    }


}
/*
UML
--Building Cost Estimator--
NumFullBaths : int
NumHalfBaths : int
NumBedrooms : int
NumWindows : int
NumGarages : double
SquareFeet : double
----------------------
Getters
    getNumFullBaths() : int
    getNumHalfBaths() : int
    getNumBedrooms() : int
    getNumWindows() : int
    getNumGarages() : double
    getSquareFeet() : double
Setters (void)
    setNumFullBaths()
    setNumHalfBaths()
    setNumBedrooms()
    setNumWindows()
    setNumGarages()
    setSquareFeet()
costToBuild() : public
public BuildingCostEstimator : constructor
 */