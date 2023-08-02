package com.workintech;

public class Cuboid extends Rectangle {

    private int height;

    public Cuboid(int length, int width, int height){
        super(length, width);
        if(height < 0){
            this.height = 0;
        } else{
            this.height = height;
        }
    }

    public double getHeight(){
        return height;
    }
    public double getVolume(){
        return height * getWidth() * getLength();
    }

}
