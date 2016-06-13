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
public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter a Number : " +args[0]);
        int no=Integer.parseInt(args[0]);
        int a=no%2;
        if (a==0) {
            System.out.println(args[0]+ " is Even");
        } else {
            System.out.println(args[0]+" is Odd");
        }
    }
    
}
