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
public class CalSwitch {
    public static void main(String[] args) {
        int a=10,b=20,c;
        int i=Integer.parseInt(args[0]);
        switch (i) {
            case 1:
                c=a+b;
                System.out.println("Addition of "+a+" and "+b+" is "+c );
                break;
            case 2:
                c=a-b;
                System.out.println("Subtruction of "+a+" from "+b+" is "+c );
                break;
            case 3:
                c=a*b;
                System.out.println("Multiplication of "+a+" and "+b+" is "+c );
                break;
            default:
                System.out.println("Invalid Choise");
        }
    
    }
}
