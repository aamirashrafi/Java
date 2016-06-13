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
public class CheckComputer {
    public static void main(String[] args) {
        Computer c=new Computer();
        c.setBrand();
        c.setProcessor();
        c.setRAM();
        c.setHDD();
        c.setSerialPorts();
        c.setusbPorts();
        c.setHDMI();
        System.out.println("Brand Name is : "+c.getBrand());
        System.out.println("Processor Speed is "+c.getProcessor()+"GHz");
        System.out.println("RAM Size is : "+c.getRAM()+"GB");
        System.out.println("Hard Disk Size is "+c.getHDD()+"GB");
        System.out.println("No of Serial Interface is : "+c.getSerialPorts());
        System.out.println("No of USB interface is : "+c.getusbPorts());
        System.out.println("No of HDMI interface is : "+c.getHDMI());
    }
    
}

