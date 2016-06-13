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
public class VolSph {
    public static void main(String[] args) {
        System.out.println("Radius : " + args[0]);
        float r=Float.parseFloat(args[0]);
        double v=(4/3)*(3.1417)*r*r*r;
        System.out.println("Volume is : " +v);
    }
    
}
