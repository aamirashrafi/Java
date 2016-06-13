/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package others;
import java.io.*;
import java.util.*;
/**
 *
 * @author system12
 */
public class Scan2Two {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("IPadress.txt");
        Scanner line=new Scanner(fr);
        while(line.hasNextLine()){
        String l=line.nextLine();
        System.out.println(""+l);
        String a[]=l.split("[/|.]");
        for(String s:a){
            System.out.println(""+s);
        }
    }// end of while
    
    
    }
}
