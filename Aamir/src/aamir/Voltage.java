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
public class Voltage {
    public static void main(String[] args) {
        System.out.println("Current : " +args[0]);
        System.out.println("Resistance : " +args[1]);
        float i=Float.parseFloat(args[0]);
        float r=Float.parseFloat(args[1]);
        float v=i*r;
        System.out.println("Value of Voltage when current is " +i+ "Amp and resistance is " +r+ "Ohms is " +v+ "Volts");
        
    }
    
}
