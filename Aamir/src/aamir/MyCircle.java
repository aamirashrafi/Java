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
public class MyCircle {
    private MyPoint Center;
    private int radius;
    private int x,y;
    public void MyCircle(int x,int y,int radius){
        this.x=x;
        this.y=y;
    }
    public void MyCircle(MyPoint Center,int radius){
        this.Center=Center;
        this.radius=radius;
    }
    public int getRadius(){
     return this.radius;   
    }
    public void setRadius(int radius){
        this.radius=radius;
    }
    public MyPoint getCenter(){
       return Center; 
    }
    public void setCenter(MyPoint Center){
        this.Center=Center;
    }
    public int getCenterX(){
        x=this.x;
        return x;
    }
    public int getCenterY(){
        y=this.y;
        return y;
    }
    public void setCenterXY(int x, int y){
        //this.Center=MyPoint;
    }
}
