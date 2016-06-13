/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aamir;
import java.util.Scanner;
/**
 *
 * @author system12
 */
public class HeightTen {
    public static void main(String[] args) {
    
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Distance :");
        double x=input.nextDouble();
        System.out.println("Enter Angle in Degree");
        double a=input.nextDouble();
        double h=x*Math.tan(Math.toRadians(a));
        System.out.println("Height is : "+h);
    }

}