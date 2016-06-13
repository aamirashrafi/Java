/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package others;

/**
 *
 * @author rameexahmed
 */
public class Binaryoperation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 34,b = -89,c = 89;
        System.out.println("binary representation of 34 is:" +Integer.toBinaryString(a));
        System.out.println("binary representation of -89:"+Integer.toBinaryString(b));
        System.out.println("binary representation of +89:"+Integer.toBinaryString(c));
        int one_s = ~c;
        System.out.println("1's complement of 89 is:" +one_s);
        System.out.println("binary representation of 1's complement:" +Integer.toBinaryString(one_s));
        int two_s = one_s+1;
        System.out.println("2's complement of 89:" +two_s);
        System.out.println("binary representation of 2's:" +Integer.toBinaryString(two_s));
        int add_num = 34+two_s;
        System.out.println("34+(-89) gives:" +add_num);
        System.out.println("binary representation of 34+(-89):"+Integer.toBinaryString(add_num));
        
        
    }
    
}
