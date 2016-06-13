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
public class CharCheck {
    public static void main(String[] args) {
        System.out.println("Name : " + args[0]);
        char ch=args[0].charAt(0);
        System.out.println(""+ch);
        boolean a=Character.isLetter(ch);
        
        if (a!=true) {
            System.out.println(ch+" is a digit.");
        } else {
            System.out.println(ch+" is a letter.");
        }
        
    }
    
}
