/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aamir;
import java.util.*;
/**
 *
 * @author Aamir
 */
public class StrComp {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 1st String : ");
        String a=input.next();
        System.out.println("Enter 1st String : ");
        String b=input.next();
        System.out.println(Compare(a,b));
    }

public static boolean Compare(String a, String b){
boolean chk=false;
int l1=a.length();
int l2=b.length();
if(l1==l2){
    char a1[]=a.toCharArray();
    char b1[]=b.toCharArray();
    for(int i=0;i<a.length();i++){
        if((a1[i]==b1[i])||(a1[i]=='?')||(b1[i]=='?')){
            chk=true;
        }
        else{
            return false;
        }
        
    }
////Edited Start

if(chk==true){
    return true;
    }
}
////Edit End



else{
    return false;
}
//if(chk==true){
//    return true;
//    }
return false;
}
}
