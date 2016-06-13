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
public class CharcClass {
    public static void main(String[] args) {
        int a=Character.digit('\u0043',16);
        System.out.println(""+a);
        int b=Character.getNumericValue('\u0042');
        System.out.println(""+b);
        Character C=new Character('A');
        char ch=C.charValue();
        System.out.println(""+ch);
        int i=Character.getType(78);
        System.out.println(""+i);
        System.out.println(Integer.toHexString(16));
        System.out.println(Integer.toBinaryString(16));
        System.out.println(Integer.toOctalString(16));
        //System.out.println(Character.isLetter());
        
    }
    
}
