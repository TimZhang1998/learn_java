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
public class Circle extends Point{
    private double r;
    
    public Circle(){
    }
    
    public Circle(int x,int y,double r){
        super(x,y);
        setR(r);
    }
    
    public void setR(double r){
        this.r=(r<0.0?0.0:r);
    }
    
    public double getR(){
        return r;
    }
    
    public double getD(){
        return 2*r;
    }
    
    public double getC(){
        return Math.PI*getD();
    }
    
    public double getArea(){
        return Math.PI*r*r;
    }
    
    public String getName(){
        return "Circle";
    }
    
    public String toString(){
        return "Centre = "+super.toString()+";Radius = "+r;
    }
}
