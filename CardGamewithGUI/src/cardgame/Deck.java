/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;

/**
 *
 * @author ASIM AZHAR
 */
public class Deck {
    public static final int NCARDS = 52;
   Cards card[]=new Cards[NCARDS];
  int  currentCard=0;
   
   public void generate(){
       int i = 0;
    
//   	 for ( int suit = 0; suit < 4; suit++ )           
//   	    for ( int rank = 0; rank < 13; rank++ )
//            {card[i] = new Cards(); 
//                   card[i].SetRank(rank);
//                      card[i++].SetSuit(suit);
//            }
       
       for( rank r:rank.values()){
           for(suit s:suit.values()){
           
           card[i]=new Cards(r,s);
           //card[i].SetRank(r);
           //card[i].SetSuit(s);
           i++;
           }
           
       }
      }
   
   
   public void Print(){
   
    int end=1;
       System.out.println("\n\n***************** The DECK************************************");
   	 for ( int i = 0; i < card.length; i++ )           
   	   {card[i].Print();
           if(end==3) {
                System.out.println("\n");
                end=0;
            }
            end++;

            }
      }
   
   
   public Cards Pick()
      {
   	 if ( currentCard < NCARDS )
   	 {
   	    return ( card[ currentCard++ ] );
   	 }
   	 else
   	 {
   	    System.out.println("Out of cards error");
   	    return ( null );  // Error;
   	 }
      }

 public Cards PickRandom()
          {
              
              int random=(int)(Math.random()*NCARDS);
   
   	
   	    return ( card[ currentCard++ ] );
   	
   	
             }

 public void Shuffle(int n){
 
 
    for (int i = 0; i < n; i++) {
            int r = (int) (Math.random() * (NCARDS));
               int s = (int) (Math.random() * (NCARDS));
            Cards t = card[r];
            card[r] = card[s];
            card[s] = t;
        }
       
    }

 
 
        }
 
 
   
       
   
   
   

