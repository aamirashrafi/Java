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
public class CardGame {
    static String cards[]=new String[52];
    final static String suit[]={"Diamond","Spades","Hearts","Clubs"};
    final static String rank[]={"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
    final static String colors[]={"Red","Black"};
    static int top=0;
    
    public static void main(String[] args) {
     init();
     Print();
     int c=Pick();
     int c1=Pick();
     Shuffle();
     System.out.println("\n\n*******************************Shuffled Cards*******************");
     Print();
   Compare(c,c1);
    }
    public static void init(){
        int k=0,l=0;
        for(int i=0;i<suit.length;i++){
            if(i%2==0){
                l=0;
            }
            else
                l=1;
            for(int j=0;j<rank.length;j++){
                cards[k++]=rank[j]+" of "+suit[i]+" having "+colors[l];
            }
        }
        
    }
    
    public static void Print(){
        int out=0;int c=0;
        System.out.println("\n\n*******************************First Suit*******************");
        for(int i=0;i<cards.length;i++){
            System.out.print("\t\t"+cards[i]);
            out++;
            c++;
            if(c==13){
                System.out.println("\n\n******************************Next Suit*******************");
            c=0;
            }
            if(out==2){
                out=0;
                System.out.println("\n");
            }
        }
    }
    
    
    public static void Shuffle(){
        String temp;
        for(int i=0;i<cards.length;i++){
            int r=(int)(Math.random()*(51-i)+i);
            temp=cards[r];
            cards[r]=cards[i];
            cards[i]=temp;
        }
    }
    public static int Pick(){
        int r=(int)(Math.random()*52);
        System.out.println("User Pick " +cards[r]);
        return r;
    }
//    public static int Pick(){
//        return Check[top++]
//    }
    
    public static void Compare(int card1,int card2){
        if(card1==card2){
            System.out.println("Both are equal");
            System.out.println("Card is : "+cards[card1]);
        }
        else{
            System.out.println("Cards are not equal");
            System.out.println("First card is : "+cards[card1]);
            System.out.println("second card is : "+cards[card2]);
        }
        
         if(card1<card2){
            System.out.println("Both are In Sequence");
     System.out.println("First card is : "+cards[card1]);
            System.out.println("second card is : "+cards[card2]);
        }
        else{
            System.out.println("Cards are not in sequence");
            System.out.println("First card is : "+cards[card1]);
            System.out.println("second card is : "+cards[card2]);
        }
    }
    
}
