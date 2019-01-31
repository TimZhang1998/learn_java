/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracttest;

/**
 *
 * @author Dell
 */
public class Point extends Shape{
    private int x;
    private int y;
    
    public Point(){
    }
    
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }
            
    public void setX(int x){
        this.x=x;
    }
    
    public void setY(int y){
        this.y=y;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public String getName(){
        return "Point";
    }
    
    public String toString(){
        return "["+ getX() + "," + getY() + "]";
    }
}
