/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;

import javax.swing.ImageIcon;

/**
 *
 * @author ASIM AZHAR
 */
public class Cards {
//   String[] suit = { "Clubs", "Diamonds", "Hearts", "Spades" };
//    String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
//
// String R;
//    String S;
    suit S;
    rank R;
    ImageIcon img;
    
    public Cards(rank r,suit s){
    R=r;
    S=s;
     String link=R.getRankValue()+S.getSuitValue()+".gif";
        System.out.println(""+link);    
    img=new ImageIcon(this.getClass().getResource("/images/"+link));
    
    
    }
    public void SetRank(rank r){
        R=r;
    
    
        }
    
      public void SetSuit(suit s){
        S=s;
    
    
        }
    
      public void Print(){
          System.out.print(S +" of "+R+"\t           ");
      
      }
      
      public String toString()

    {

          return R + " of " + S;

    }
  public boolean Compare(Cards d)

    {   if(this.R.equals(d.R)) return true;
        else  return false;
        
    }
  
  
  public boolean isGreater(Cards d)

    {   if(this.R.compareTo(d.R)>0) return true;
        else  return false;
        
    }
  
    }



