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
public class Fah2Kel {
    public static void main(String[] args) {
        System.out.println("Temperature in Fahrenheit : " +args[0]);
        float f=Float.parseFloat(args[0]);
        double k=(5/9)*(f-32)+273;
        System.out.println("Temperature in Kelvin is : " + k);
    }
}
