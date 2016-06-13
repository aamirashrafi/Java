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
public class AndOpeartionIi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        int a=0xA;
        int b=0x0F;
        System.out.println("HEX representation");
        System.out.println(Integer.toHexString(a));
        System.out.println("HEX representation");
        System.out.println(Integer.toHexString(b));
        System.out.println("AND operartion of a and b= "+(a&b));
        System.out.println("1st part of program is finished");
        int c=0xA;
        int d=0127;
        System.out.println("HEX representation of 0xA = ");
        System.out.println(Integer.toHexString(c));
        System.out.println("OCTAL representation of 0127 = ");
        System.out.println(Integer.toOctalString(d));
        System.out.println("AND operation of c&d = "+(c&d));
        // TODO code application logic here
    }
    
}
