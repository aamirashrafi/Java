/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aamir;

import java.util.Scanner;

/**
 *
 * @author Aamir
 */
public class CopyOfHomeWork {
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
                //System.out.print(" "+LotteryNumbers[i]);    
                }
                ComGenNo=generateLotteryNumbers();
                for(int i=0;i<ComGenNo.length;i++){
                System.out.print(" "+ComGenNo[i]);//////////////
                }
                System.out.println("\nYour Number is :");
                for (int i = 0; i < LotteryNumbers.length; i++) {
                    System.out.print(" "+LotteryNumbers[i]);
                }
                
                Compare(ComGenNo,LotteryNumbers);
                break;
            case 2:
                ComGenNo=generateLotteryNumbers();
                for(int i=0;i<ComGenNo.length;i++){
                System.out.print(" "+ComGenNo[i]);
                }
                System.out.println("\nYour Number is : ");
                LotteryNumbers=YourNumber();
                /*for (int i = 0; i <LotteryNumbers.length; i++) {
                    System.out.print(" "+LotteryNumbers[i]);
                }*/
                Compare(ComGenNo,LotteryNumbers);
                break;
            default:
        }
    }
    
    /**************Generate Number*******************/
    
    private static int[] generateLotteryNumbers(){
        System.out.println("The Lottery Number is :");
        int[] r={((int)(Math.random()*10+0)),((int)(Math.random()*10+0)),((int)(Math.random()*10+0)),((int)(Math.random()*10+0)),((int)(Math.random()*10+0)),};    
        return r;
    }
    
    
    /*********************Your Number*******************/
    private static int[] YourNumber(){
        Scanner no=new Scanner(System.in);
// ********Spacing Work**********
        String spc=no.nextLine();
        System.out.println(""+spc);
        String a[]=spc.split(" ");
        for (int i = 0; i < LotteryNumbers.length; i++) {
            LotteryNumbers[i]=Integer.parseInt(a[i]);
        }
        return LotteryNumbers;
    }
    
    /********************Compare*****************/
    
    private static void Compare(int[] ComGenNo,int[] LotteryNumbers){
        int com=0;
        for (int i = 0; i < LotteryNumbers.length; i++) {
            if (ComGenNo[i]==LotteryNumbers[i]) {
                  com++;  
                }
        }
        System.out.println("\nThere are "+com+" matching digits.");
        
    }
}
    


    

