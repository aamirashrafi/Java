/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aamir;

import java.util.Scanner;

/**
 *
 * @author Hp-Pc
 */
public class Circumference {
    public static void main(String[] args) {
        System.out.println("Enter Radius of Circle");
        Scanner rad=new Scanner(System.in);
        double r=rad.nextDouble();
        double s=2*Math.PI*r;
        System.out.println("Circumference of Circle is : "+s);
                
                
                
    }
}
