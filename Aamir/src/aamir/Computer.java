/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aamir;
import java.util.*;
/**
 *
 * @author Aamir
 */
public class Computer {
Scanner Sc=new Scanner(System.in);
String Brand;
float processor;
int Ram,HDD;
int usbPorts;
int SerialPorts;
int HDMI;
public static String name="This is computer";
public String getBrand(){
    return Brand;
} 
public void setBrand(){
    System.out.println("Enter Manufacturar's Name : ");
    String a=Sc.next();
    Brand=a;
    
}
public void setProcessor(){
    System.out.println("Enter Processor Speed in GHz: ");
    float a=Sc.nextFloat();
    processor=a;
}
public float getProcessor(){
    return processor;
}
public void setRAM(){
    System.out.println("Enter Size of RAM in GBs :");
    int a=Sc.nextInt();
    Ram=a;
}
public int getRAM(){
    return Ram;
}
public void setHDD(){
    System.out.println("Enter Size of Hard Disc in GBs :");
    int a=Sc.nextInt();
    HDD=a;
}
public int getHDD(){
    return HDD;
}
public void setusbPorts(){
    System.out.println("Enter No. of USB Ports : ");
    int a=Sc.nextInt();
    usbPorts=a;
}
public int getusbPorts(){
    return usbPorts;
}
public void setHDMI(){
    System.out.println("Enter No of HDMI Ports:");
    int a=Sc.nextInt();
    HDMI=a;
}
public int getHDMI(){
    return HDMI;
}
public void setSerialPorts(){
    System.out.println("Enter No Serial Ports:");
    int a=Sc.nextInt();
    SerialPorts=a;
}
public int getSerialPorts(){
    return SerialPorts;
}

}
