/*
 *Course: CS1011-051
 *Fall 2020-2021
 *File header contains class Cube
 *Name: Parker
 *Created 10/23/2020
 */

package midterm02;
/*
 *  Course CS1011-051
 *  Fall 2020-2021
 *  Cube purpose:
 *  @author Parker
 *  @version created on 10/23/2020 at 1:18 PM
 */

/**
 * CS1011-051 Fall 2020-2021
 * Class purpose: Software representation of a cube with a restricted set of attributes
 *
 * @author thomas
 * @version 1.1 Created on 10/23/2020 at 1:00 PM.
 */
public class Cube {
    private String color;
    private double length;

    /**
     * Constructor for the Cube
     *
     * @param color  is color of the cube
     * @param length is length of the side of the cube
     */
    public Cube(String color, double length) {
        this.color = color.toLowerCase();
        this.length = length;
    }

    /**
     * getter for color
     *
     * @return color of Cube
     */
    public String getColor() {
        return color;
    }

    /**
     * getter for length
     *
     * @return side length of cube
     */
    public double getLength() {
        return length;
    }

    /**
     * compute volume of cube
     *
     * @return volume of cube
     */
    public double getVolume() {
        double volume = length * length;
        return volume;
    }

    /**
     * override toString to display Cube attributes and volume
     *
     * @return cube attributes
     */
    public String toString() {
        return "Cube " + getColor() + " has side length " + getLength() + " with volume " + getVolume();
    }

    public static void main(String[] args) {
        Cube testCube = new Cube("ReD", 2.0);
        System.out.println(testCube);
    }
}