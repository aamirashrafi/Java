/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aamir;

/**
 *
 * @author Aamir
 */
public class Kel2Far {
    public static void main(String[] args) {
        System.out.println("Temperature in Kelvin : " +args[0]);
        float k=Float.parseFloat(args[0]);
        double f=(9/5)*(k-273)+32;
        System.out.println("Temperature in Fahrenheit is : " + f);
    }
    
}
