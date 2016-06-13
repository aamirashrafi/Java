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
public class HomeWork15012016 {
    public static void main(String[] args) {
        int numbers[]=new int[20];
        System.out.println("Unsorted Numbers is:");
        for(int i=0;i<numbers.length;i++){
        numbers[i]=(int)(Math.random()*100)+2;
        System.out.print("  "+numbers[i]);
        }
        int sum=0;
        for(int i=0;i<numbers.length;i++)
        {
            sum+=numbers[i];
        }
        System.out.println("\nSome of Integer Array is :" +sum);
        double avg=sum/numbers.length;
        System.out.println("Average of Integer Array is : "+avg);
        
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int a:numbers){
            //
            sum+=a;
            if(a>max){max=a;}
            if(a<min){min=a;}
        }
        System.out.println("Maximum Value is : "+max);
        System.out.println("Minimum Value is : "+min);
        int temp;
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]>numbers[j]){
                    temp=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;
                }
            }
        }
        System.out.println("Sorted Numbers is:");
        for(int i=0;i<numbers.length;i++){
            System.out.print(" "+numbers[i]);
        }
        
    }
    
}
