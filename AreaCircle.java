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
public class AreaCircle {
    public static void main(String[] args) {
        System.out.print("Enter Radius of Circle :");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        
        double A=Math.PI*a;
        System.out.println("Area of Circle is :"+A);
                
        
    }
    
    
}
