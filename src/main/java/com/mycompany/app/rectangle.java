package com.mycompany.app;

import java.awt.*;

/**
 * Created by khalid on 10/5/16.
 */
public class rectangle implements shape {
    int length;
    int breadth;

    rectangle(int l, int b){
        length=l;
        breadth=b;
    }
    public void draw(){
        System.out.println("This is Rectangle draw: Aree is: " + length*breadth);
    }
}
