/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aamir;
import java.util.Scanner;
/**
 *
 * @author system12
 */
public class Random {
    public static void main(String[] args) {
        int a=97,b=102;
        boolean bool=false;
        char no=(char)(Math.random()*(b-a+1)+a);
        System.out.println(""+no);
        Scanner input=new Scanner(System.in);
        for(int i=1;i<=6;i++)
        {
            
            System.out.println("Enter a Character");
            char ch=input.next().charAt(0);
//            System.out.println(""+ch);
            if(ch==no)
            {
                bool=true;
                break;
            }
        }
        if(bool)
            System.out.println("You Win!");
        else
            System.out.println("You Loose!");
            
            }
        }
    
    

