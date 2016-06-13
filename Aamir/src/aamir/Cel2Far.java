/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aamir;

/**
 *
 * @author system12
 */
public class Cel2Far {
    public static void main(String[] args) {
        System.out.println("Celcius To Faraunheit");
        System.out.println("Temperature in Celcius : " + args[0]);
        double cel=Double.parseDouble(args[0]);
        double far=(9/5)*cel+32;
        System.out.println("Temperature in Faraunheit is : " +far);
        
        
        System.out.println("\n\n\nFaraunheit To Celcius");
        System.out.println("Enter Temperature in Faraunheit : " +args[1]);
        double far2=Double.parseDouble(args[1]);
        double cel2=(5/9)*(far2-32);
        System.out.println("Temperature in Celcius is: " +cel2);
    }
    
}
