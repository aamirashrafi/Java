/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package others;
import java.io.*;
import java.util.*;
/**
 *
 * @author Aamir
 */
public class DramaName {
    public static void main(String[] args)throws IOException{
       
        FileReader fr = new  FileReader("Name.txt");
        Scanner sc = new Scanner(fr);
        String str = null;
        while(sc.hasNextLine()){
        str = sc.nextLine().trim();
            
         String arr[]=str.split(",");//Split array by Coma(,)
           System.out.println("Title="+arr[0]+"  Catagory="+arr[1]+"  Time="+arr[2]+
                   "  Year="+arr[3]+"  Price="+arr[4]);
           }// while end
    }   
}

    

