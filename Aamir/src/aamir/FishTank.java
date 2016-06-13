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
public class FishTank {
    public static void main(String[] args) {
        System.out.println("Enter Heit of Tank : " +args[0]);
        float h=Float.parseFloat(args[0]);
        System.out.println("Enter Width of Tank : " +args[1]);
        float w=Float.parseFloat(args[1]);
        System.out.println("Enter Depth of Tank : " +args[2]);
        float d=Float.parseFloat(args[2]);
        float eh=h*w*d;
        float sa=(w+h)*(h+d)*2*(w+d);
        System.out.println("Edge Heit is :" +eh);
        System.out.println("Surface Area is : "+sa);
    }
    
}
