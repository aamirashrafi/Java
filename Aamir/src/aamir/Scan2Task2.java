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
public class Scan2Task2 {
    public static void main(String[] args)throws IOException {
        FileReader fr=new FileReader("Scan2File.txt");
        Scanner line=new Scanner(fr);
        while(line.hasNextLine()){
        String l=line.next();
        System.out.println(""+l);
        //String a[]=l.split("[/|.]");
        //for(String s:a){
        //System.out.println(""+s);
        //}
        }
    }
}
