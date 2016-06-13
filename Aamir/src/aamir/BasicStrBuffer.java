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
public class BasicStrBuffer {
    public static void main(String[] args) {
        StringBuffer buffer=new StringBuffer("banana Split");
        buffer=buffer.delete(4,12);
        System.out.println(""+buffer);
        buffer=buffer.append(42);
        System.out.println(""+buffer);
        buffer=buffer.insert(4, "na");
        System.out.println(""+buffer);
        buffer.setCharAt(0, 's');
        System.out.println(""+buffer);
        buffer=buffer.reverse();
        System.out.println(""+buffer);
        
    }
    
}
