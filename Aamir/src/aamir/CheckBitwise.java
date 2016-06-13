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
public class CheckBitwise {
    public static void main(String[] args) {
        int a=10,b=20;
        System.out.println("a="+Integer.toBinaryString(a));
        System.out.println("b="+Integer.toBinaryString(b));
        System.out.println("a X b = "+(a&b));
        System.out.println("a | b = "+(a|b));
        System.out.println("a's compliment = "+(~a));
        System.out.println(Integer.toBinaryString(a&b));
    }
}
