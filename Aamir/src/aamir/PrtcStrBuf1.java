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
public class PrtcStrBuf1 {
    public static void main(String[] args) {
        StringBuffer Line=new StringBuffer("Aamir is a good boy");
        System.out.println(""+Line);
        Line=Line.delete(0, 2);
        System.out.println(""+Line);
        Line=Line.append(42);
        System.out.println(""+Line);
        Line=Line.insert(5,"not");
        System.out.println(""+Line);
        Line.setCharAt(1, 'b');
        System.out.println(""+Line);
        String i=Computer.name;
        System.out.println(""+i);
    }
}
