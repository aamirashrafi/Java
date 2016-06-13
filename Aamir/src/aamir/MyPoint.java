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
public class MyPoint {
   private int x,y;
   private MyPoint Point;
   public void MyPoint(){
       this.x=0;
       this.y=0;
   }
   public void MyPoint(int x, int y){
       this.x=x;
       this.y=y;
   }
   public void setX(int x){
       this.x=x;
   }
   public int getX(){
       return x;
   }
   
   public int getY(){
       return y;
   }
   public void setY(int y){
       this.y=y;
   }
   public void setXY(int x, int y){
       this.x=x+y;
   }
   public double distanec(int x1, int x2, int y1, int y2){
     double d=Math.sqrt(Math.pow((x2-x1), 2)-Math.pow((y2-y1), 2));
     return d;
   }
   public void movePoint(int x, int y){
       this.x=this.x+x;
       this.y=this.y+y;
   }
   public void changePoint(int x,int y){
       this.x=x;
       this.y=y;
   }
   public boolean equals(MyPoint P){
       boolean a=true;
       return a;
   }/*
   public Point Mid(int x1, int x2, int y1,int y2){
   Point P1=new Point(x1,y1);
   Point p1 = new Point(0, 0);
   Point p2 = new Point(4, 4);
   Point p3 = p1.findMidpoint(p2);
   return P1;
   }*/
}
