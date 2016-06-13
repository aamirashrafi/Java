/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aamir;

/**
 *
 * @author Aamir
 */
public class AgeRet {
    public static void main(String[] args) {
        System.out.println("Enter Age :"+args[0]);
        int age=Integer.parseInt(args[0]);
        int left=60-age;
        System.out.println("Year Left in Retirement is "+left);
    }
}
