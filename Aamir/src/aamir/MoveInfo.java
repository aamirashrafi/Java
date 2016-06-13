/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aamir;
import java.util.*;
import java.io.*;
/**
 *
 * @author Aamir
 */
public class MoveInfo {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("FilmInfo.txt");
        Scanner line=new Scanner(fr);
        while(line.hasNextLine()){
        String l=line.nextLine().trim();
        String arr[]=l.split(",");
        System.out.println("Title = "+arr[0]+" Catagry "+arr[1]+" Time="+arr[2]+" Year="+arr[3]+" Price = "+arr[4]);
        }
    }
}
