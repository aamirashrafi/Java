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
public class OutcomeOf {
    public static void main(String[] args) {
        int a=0XA,b=0X0F;
        System.out.println("A = "+Integer.toHexString(a));
        System.out.println("B = "+Integer.toHexString(b));
        int c=a&b;
        System.out.println("A & B = "+c);
        System.out.println("A X B = "+Integer.toHexString(c));
        
        a=0XA;
        b=0127;
        System.out.println("\n\n\nA = " +Integer.toHexString(a));
        System.out.println("B = "+Integer.toOctalString(b));
        c=a&b;
        System.out.println("A & B = "+c);
        
        System.out.println("A X B = "+Integer.toHexString(c));
        
    }
    
}
