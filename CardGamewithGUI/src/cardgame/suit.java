/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;

/**
 *
 * @author system18
 */
public enum suit {
   Clubs("c"), Diamonds("d"), Hearts("h"), Spades("s");
   
   
   private  String val;
        private suit(String v){val=v;}
 
        public String getSuitValue(){
        return val;

           } 
}
