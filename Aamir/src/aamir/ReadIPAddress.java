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
public class ReadIPAddress {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("IPadress.txt");
        Scanner line=new Scanner(fr);
        while(line.hasNextLine()){
        String l=line.next();
        String arr[]=l.split("[/|.]");
        for(String a:arr){
            
        System.out.println(""+a);
        }
        }
    }
}
