/*
 *Course: CS1011-051
 *Fall 2020-2021
 *File header contains class BannerDriver
 *Name: Parker
 *Created 10/23/2020
 */

package midterm02;
/*
 *  Course CS1011-051
 *  Fall 2020-2021
 *  BannerDriver purpose:
 *  @author Parker
 *  @version created on 10/23/2020 at 1:10 PM
 */

public class BannerDriver {
    public static void main(String[] args) {

        firstBanner = new Banner("first");
        secondBanner = new Banner("second");
        System.out.println(firstBanner.getMessage());
        System.out.println(secondBanner.getMessage());

    }
    public static Banner firstBanner;
    public static Banner secondBanner;
}