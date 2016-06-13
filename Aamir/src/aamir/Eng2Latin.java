/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aamir;

/**
 *
 * @author system12
 */
public class Eng2Latin {
    public static void main(String[] args) {
        String line="This is a Pakistan.";
        String l[]=line.split("[ |.]");
        for(String a:l){
           if(a.length()>1){
            StringBuffer Buffer=new StringBuffer(a);
            char save=Buffer.charAt(0);
            Buffer.deleteCharAt(0);
            Buffer.append(save);
            //Buffer.append("ay");
            Buffer.insert(Buffer.length(),"ay");
            System.out.println(""+Buffer);
        }
        else {
        System.out.println(""+a);}
        
           }
    }
}
