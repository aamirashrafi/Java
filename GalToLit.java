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
public class GalToLit {
    public static void main(String[] args) {
        System.out.println("Enter no of Gallon :");
        Scanner Gal=new Scanner(System.in);
        double G=Gal.nextDouble();
        double Lit=G*3.7845;
        System.out.println(G+" gallons has "+Lit+"Liters");
    }
}
