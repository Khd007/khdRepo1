package com.mycompany.app;

/**
 * Created by khalid on 10/5/16.
 */
public class traingle implements shape {
    int base;
    int altitude;
    traingle(int b, int alt){
        base= b;
        altitude= alt;
    }
    public void draw(){
        System.out.println("This is traingle draw: Area is: "+ (base*altitude)/2);

    }
}
