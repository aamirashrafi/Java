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
public class AreaSq {
    public static void main(String[] args) {
        System.out.println("Enter Length : " + args[0]);
        float l=Float.parseFloat(args[0]);
        System.out.println("Enter Width : " + args[1]);
        float w=Float.parseFloat(args[1]);
        System.out.println("Enter Heit : " +args[2]);
        float h=Float.parseFloat(args[2]);
        double area=l*w*h*h;
        System.out.println("Area of Square is " + area);
    }
    
}
