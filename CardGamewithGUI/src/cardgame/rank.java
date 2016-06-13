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
public enum rank {
 two("2"),Three("3"),Four("4"),Five("5"),Six("6"),Seven("7"),Eight("8"),Nine("9"),Ten("t"), Jack("j"), Queen("q"), King("k"), Ace("a");
 
 private  String val;
        private rank(String v){val=v;}
 
        public String getRankValue(){
        return val;

           } 
 
 
  
}
