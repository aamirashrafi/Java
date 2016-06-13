/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package others;

/**
 *
 * @author c2d
 */
public class BinaryAdditionOf2No {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=34;
        int b=89;
        int c=-89;
        System.out.println("Binary representation of 34 is "+Integer.toBinaryString(a));
        System.out.println("Binary respresentation of 89 is "+Integer.toBinaryString(b));
        System.out.println("Binary respresentation of -89 is "+Integer.toBinaryString(c));
        int d=~b;
        System.out.println("1s complement of 89 is "+Integer.toBinaryString(d));
        int e=d+1;
        System.out.println("2s complement of 89 is "+Integer.toBinaryString(e));
        int f=d+e;
        System.out.println("Addition of 34+(-89) "+Integer.toBinaryString(f));
    }
    
}
