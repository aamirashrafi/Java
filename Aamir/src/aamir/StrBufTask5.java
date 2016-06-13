/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aamir;
import java.io.*;
import java.util.*;

/**
 *
 * @author Aamir
 */
public class StrBufTask5 {
    public static void main(String[] args) {
        Scanner No=new Scanner(System.in);
        System.out.println("Enter Phone Number :");
        String no=No.next();
        
        StringBuffer Buffer=new StringBuffer(no);
       
        Buffer=Buffer.insert(4, '-');
        Buffer=Buffer.insert(8, '-');
        System.out.println(""+Buffer);
        //System.out.println(""+no);
    }
    
}
