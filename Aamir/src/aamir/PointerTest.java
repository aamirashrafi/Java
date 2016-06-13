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
public class PointerTest {
    public static void main(String[] args) {
        Student Sam=new Student();
        Sam.grade='A';
        Student SamTwin=new Student();
        SamTwin.grade='D';
        SamTwin=Sam;
        SamTwin.grade='C';
        System.out.println(Sam.grade);
        System.out.println(SamTwin.grade);
    }
} 
