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
 * @author system12
 */
public class FileRead_15Jan {
    public static void main(String[] args)throws IOException {
        FileReader fr=new FileReader("ABC.txt");
        Scanner Sc=new Scanner(fr);
        PrintWriter Pr=new PrintWriter("MyFile.TXT");
        int i=0,ch=0;
        

///*********************///
        /*For Line By Line
        while(Sc.hasNextLine()){
            String a=Sc.nextLine();
            System.out.println("Line  : "+a);
            ch+=a.length();
            i++;
        }*/
        //Line By Line End
        
        //System.out.println("Line is "+i);
        //System.out.println("Character is : "+ch);
        ///***********************///
        int op;
        String a;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 1 for read or Enter 2 for Write:");
        op=input.nextInt();
        
        
        switch(op){
            
            case 1:
                    System.out.println("Enter Message to Write : ");
                    a=input.next();
                    Pr.println("Message is :"+a);
                    Pr.flush();
                    break;
            case 2:
                    while(Sc.hasNext()){
                    a=Sc.next();
                    System.out.println("Line : "+a);
                    ch+=a.length();
                    i++;
                    break;
            
            
//            Sc.useDelimiter("\\s+|-");
//            while(Sc.hasNext()){
//                System.out.print(Sc.next());
//            }
        }
        System.out.println("No of Words = "+ch);
        System.out.println("No of Character is = "+i);
    }
    
}
}
