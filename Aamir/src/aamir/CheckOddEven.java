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
public class CheckOddEven {
    public static void main(String[] args) {
        System.out.println("Enter Number To Check : " +args[0]);
        int number=Integer.parseInt(args[0]);
        int a=number%2;
        if (a==1) {
            System.out.println("Number is Odd");
        } else {
            System.out.println("Number is Even");
        }
    }
    
}
