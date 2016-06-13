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
public class SimCal {
    public static void main(String[] args) {
        System.out.println("First Number : " +args[0]);
        System.out.println("Second Number : " +args[1]);
        float a=Float.parseFloat(args[0]);
        float b=Float.parseFloat(args[1]);
        float sum=a+b;
        float avg=sum/2;
        float sub=a-b;
        float mul=a*b;
        float div=a/b;
        System.out.println("Sum of " +a+ "and " +b+ " is :" +sum);
        System.out.println("Average of " +a+ " and " +b+ " is :" +avg);
        System.out.println("Subtruction of " +b+ " from " +a+ " is : " +sub);
        System.out.println("Multiplication of " +a+ " and " +b+ " is : " +mul);
        System.out.println("Division of " +a+ " by " +b+ " is :" +div);
    }
    
}
