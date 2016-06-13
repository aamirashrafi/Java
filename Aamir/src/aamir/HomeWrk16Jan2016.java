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
public class HomeWrk16Jan2016 {
    static int LotteryNumbers[]=new int[5];
    static int ComGenNo[]=new int[5];
    public static void main(String[] args) {
        System.out.println("Welcome To Play Lottery...");
        System.out.println("1. Enter your own lottery number.");
        System.out.println("2. Get a computer-generated lottery number");
        Scanner input=new Scanner(System.in);
        System.out.print("Your choice: ");
        int op=input.nextInt();
        switch (op) {
            case 1:
                System.out.print("Enter 5 single digit numbers, separated by space :");
                LotteryNumbers=YourNumber();
                for (int i = 0; i <LotteryNumbers.length; i++) {
                System.out.println(""+LotteryNumbers[i]);    
                }
                
                /*Your No
                for(int i=0;i<LotteryNumbers.length;i++){
                    Scanner no=new Scanner(System.in);
                    LotteryNumbers[i]=no.nextInt();
                    System.out.println(""+LotteryNumbers[i]);    
                }
                //Your No*/
                
                ComGenNo=generateLotteryNumbers();
                for(int i=0;i<ComGenNo.length;i++){
                System.out.print(" "+ComGenNo[i]);//////////////
                }
                System.out.println("\nYour Number is :");
                for (int i = 0; i < LotteryNumbers.length; i++) {
                    System.out.print(" "+LotteryNumbers[i]);
                }
                //int com=
                Compare(ComGenNo,LotteryNumbers);
                //System.out.println("Thgere are "+com+" matching digits.");
                break;
            case 2:
                
                ComGenNo=generateLotteryNumbers();
                for(int i=0;i<ComGenNo.length;i++){
                System.out.print(" "+ComGenNo[i]);
                }
                LotteryNumbers=YourNumber();
                System.out.println("Your Number is : ");
                for (int i = 0; i <LotteryNumbers.length; i++) {
                    System.out.println(""+LotteryNumbers[i]);
                }
                Compare(ComGenNo,LotteryNumbers);
                break;
            default:
        }
    }
    private static int[] generateLotteryNumbers(){
        System.out.println("The Lottery Number is :");
        int[] r={((int)(Math.random()*9+1)),((int)(Math.random()*9+1)),((int)(Math.random()*9+1)),((int)(Math.random()*9+1)),((int)(Math.random()*9+1)),};    
        return r;
    }
    private static int[] YourNumber(){
        
        for(int i=0;i<LotteryNumbers.length;i++){
                    Scanner no=new Scanner(System.in);
                    LotteryNumbers[i]=no.nextInt();
                    //System.out.println(""+LotteryNumbers[i]);    
                }
        return LotteryNumbers;
    }
    private static void Compare(int[] ComGenNo,int[] LotteryNumbers){
        int com=0;
        for (int i = 0; i < LotteryNumbers.length; i++) {
            for (int j = 0; j < LotteryNumbers.length; j++) {
                if (ComGenNo[i]==LotteryNumbers[j]) {
                  com++;  
                }
            }
        }
        System.out.println("\nThere are "+com+" matching digits.");
        //return com;
    }
}
    

