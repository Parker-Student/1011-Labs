/*
 *Course: CS1011-051
 *Fall 2020-2021
 *File header contains class lab3
 *Name: Parker
 *Created 9/24/2020
 */

package week03;
/*
 *  Course CS1011-051
 *  Fall 2020-2021
 *  lab3 purpose: conditionals
 *  @author Parker
 *  @version created on 9/24/2020 at 10:57 AM
 */

import java.text.DecimalFormat;
import java.util.Scanner;


public class CalculateTaxes {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("###,###,###.00");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter S for Single and M for Married filing: ");
        String selection = in.nextLine().toUpperCase();
        System.out.println("Enter estimated income: ");
        double input = in.nextDouble();

        if (selection.equals("M")) {
            System.out.println("Your estimated taxes are: " + df.format((input * (married(input)/100))) + "\r\n"
                    + "This results in an effective tax rate of: " + df.format(married(input)));
        } else if (selection.equals("S")) {
            System.out.println("Your estimated taxes are: " + df.format((input * (single(input)/100))) + "\r\n"
                    + "This results in an effective tax rate of: " + df.format(single(input)));
        }
    }

    public static double married(double income) {

        double taxed = 0.0;
        double initIncome = income;

        if(income > 0){
            taxed += calculate(income, 19400, .1);

            income -= 19400;
        }
        if (income > 0 ){

            taxed += calculate(income, 59549, .12);

            income -= 59549;
        }
        if(income > 0 ){

            taxed += calculate(income, 89449, .22);

            income -= (89449);
        }
        if(income > 0 ){

            taxed += calculate(income, 153049, .24);

            income -= (153049);
        }
        if(income > 0){

            taxed += calculate(income, 86749, .32);

            income -= (86749);
        }
        if(income > 0){

            taxed += calculate(income, 204149, .35);

            income -= 204149;
        }if(income > 0){

            taxed += income * .37;

            //income -= (510300 - 204100);
        }

        return (taxed/initIncome * 100);
    }

    public static double single(double income) {

        double taxed = 0.0;
        double initIncome = income;

        if(income > 0){
            taxed += calculate(income, 9700, .1);

            income -= 9700;
        }
        if (income > 0 ){

            taxed += calculate(income, 29774, .12);

            income -= 29774;
        }
        if(income > 0 ){

            taxed += calculate(income, 44724, .22);

            income -= (44724);
        }
        if(income > 0 ){

            taxed += calculate(income, 76524, .24);

            income -= (76524);
        }
        if(income > 0){

            taxed += calculate(income, 43374, .32);

            income -= (43374);
        }
        if(income > 0){

            taxed += calculate(income, 306199, .35);

            income -= 306199;
        }if(income > 0){

            taxed += income * .37;

          //income -= (510300 - 204100);
        }

        return (taxed/initIncome * 100);
    }


    //Takes in income, bracket, and rate
    //Returns taxed amount at the given income and rate
    public static double calculate(double income, int bracket, double rate){
// if income less than bracket then return income * rate, else return bracket * rate
         return income < bracket ? income * rate : bracket  *  rate;

    }
}
