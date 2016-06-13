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
public class BinaryAddition {
    public static void main(String[] args) {
        int a=34,b=-89;
        int d=89;
        System.out.println("2's Compliment of 89");
        System.out.println("89 in Binary = " +Integer.toBinaryString(d));
        int d1=~d;
        System.out.println("1's Compliment of 89 = "+Integer.toBinaryString(d1));
        d=d1+1;
        System.out.println("2's Compliment of 89 = "+Integer.toBinaryString(d));
        System.out.println("\n\n\n34 in Binary = "+Integer.toBinaryString(a));
        System.out.println("-89 in Binary = "+Integer.toBinaryString(b));
        int c=a+b;
        System.out.println("Addition of 34 and -89 = "+Integer.toBinaryString(c));
        //System.out.println("C="+c);
    }
   
}
