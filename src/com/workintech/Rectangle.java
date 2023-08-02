package com.workintech;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(int length, int width){
        this.width = width < 0 ? 0 : width;
        this.length = length;

    }

    public double getWidth(){
        return width;
    }

    public double getLength(){
        return length;
    }

    public double getArea(){
        return width * length;
    }

}
