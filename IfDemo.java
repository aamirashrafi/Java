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
public class IfDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter value of a : ");
        int a=input.nextInt();
        System.out.println("Enter value of b : ");
        int b=input.nextInt();
        if(a<b)
            System.out.println("a id less than b");
        else if(a==b)
            System.out.println("a is equal to b");
        else if(a>b)
            System.out.println("a is greater than b");
    }
    
}
