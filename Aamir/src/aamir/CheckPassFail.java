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
public class CheckPassFail {
    public static void main(String[] args) {
        System.out.println("Enter No : " +args[0]);
        int No=Integer.parseInt(args[0]);
        if (No>=50) {
            System.out.println("Congratulation! You Pass");
        } else {
            System.out.println("Sorry! You Fail.");
        }
    }
    
}
