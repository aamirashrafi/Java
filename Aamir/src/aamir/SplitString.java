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
public class SplitString {
    public static void main(String[] args) {
        String arr="Amadeus Drama 160Mins. 1984 14.83 As Good As It Gets Drama 139 Mins. 1998 11.3 Batman Action 126Mins. 1989 10.15 Billy Elliot Drama 111Mins. 2001 10.23 Blade Runner Science Fiction 117Mins. 1982 11.98 Shadowlands Drama 133Mins. 1993 9.89 Shrek Animation 93Mins 2001 115.99 Snatch Action 103Mins 2001 20.67 The Lord of the Rings Fantasy 178Mins 2001 25.87.";
        String abc[]=arr.split("[ |1]",0);
        for(String a:abc){
            System.out.println(""+a);
        }
    }
}


