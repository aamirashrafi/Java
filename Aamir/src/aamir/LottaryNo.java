/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aamir;
import java.util.*;
/**
 *
 * @author system12
 */
public class LottaryNo {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int i=Sc.nextInt();
        switch(i){
        case 1:
                int l=LottaryNo.generateLottaryNumber();
                System.out.println("Your # is : "+l);
                break;
        case 2:
                int winner=LottaryNo.generateWinner();
                System.out.println("Winner is : "+winner);
                break;
        default:        
    }
    }
public static int generateLottaryNumber(){ 
    int r=(int)(Math.random()*2001+1000);
    return r;
}
public static int generateWinner(){
    int r=(int)(Math.random()*2001+1000);
    return r;
}
}
