/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aamir;
import java.util.*;
/**
 *
 * @author system12
 */
public class Phytha {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter value of a : ");
        int a=input.nextInt();
        System.out.print("Enter Value of b : ");
        int b=input.nextInt();
        System.out.print("Enter Value of c : ");
        int c=input.nextInt();
        
        int i1=4*a*c;
        double i2=Math.pow(b,2);
        double i3=Math.sqrt(i1-i2);
        System.out.println(""+i1);
          System.out.println(""+i2);
            System.out.println(""+i3);
            double i4=(b+i3)/(2*a);
//        double i=(b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
//        System.out.println("Value of i is"+i);
        System.out.println("Value of i is"+i4);
    }
    
}
