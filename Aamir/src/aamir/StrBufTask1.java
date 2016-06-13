/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aamir;
import java.util.*;
import java.io.*;
/**
 *
 * @author Aamir
 */
public class StrBufTask1 {
    public static StringBuffer Buffer1;
    public static void main(String[] args) {
        String Line1="I am going to school.";
        String Line2="not wishing";
        int a=Line1.length();
        Buffer1=new StringBuffer(Line1);
        Buffer1.insert((a/2)," "+Line2);
        System.out.println(""+Buffer1);
        
        }
        
    }
    

