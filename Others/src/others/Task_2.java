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
public class Task_2 {
    public static void main(String[] args) {
        int num_1 = 0xA,num_2 =0x0F,and_op_1=0,num_3 = 0xA,
        num_4 = 0127,and_op_2=0;
        System.out.println("START");
        System.out.println("1st part of program starts");
        System.out.println("0xA value in hexadecimal is:" +Integer.toHexString(num_1));
        System.out.println("0x0F value in hexadecimal is:"+Integer.toHexString(num_2));
        and_op_1 = +(num_1&num_2);
        System.out.println("And operation of two hex numbers(0xA&0x0F) is:"+and_op_1);
        System.out.println("1st part of program finished");
        System.out.println("2nd part of program starts");
        System.out.println("octal representation of 0127:"+Integer.toOctalString(num_4));
        and_op_2 = +(num_3&num_4);
        System.out.println("And operation of a hex and a octal number(0xA&0127) number is:"+and_op_2);
        System.out.println("2nd part of program finished");
        System.out.println("END");
        
        
        
    }
    
}
