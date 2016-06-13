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
public class PrtcFileReader1 {
    public static void main(String[] args)throws IOException {
        File a=new File("MyFile.txt");
        FileReader fr=new FileReader(a);
        PrintWriter pr=new PrintWriter("Scan2File.txt");
        Scanner Sc=new Scanner(fr);
        while(Sc.hasNext()){
            String b=Sc.nextLine();
            System.out.println(" "+b);
            pr.println(b);
            pr.flush();
        }
        
    }
}
