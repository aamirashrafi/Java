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
 * @author system12
 */
public class StrWrite {
    public static void main(String[] args) throws IOException {
        Scanner input=new Scanner(System.in);
        PrintWriter Pr=new PrintWriter("MyFile.TXT");
        System.out.println("Enter Your User Name: ");
        String a=input.next();
        Pr.println("Name:"+a);
        System.out.println("Enter Your Password : ");
        a=input.next();
        Pr.println("Password : "+a);
        Pr.flush();
    }
}
