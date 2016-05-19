package com.mycompany.app;

import java.util.*;
import java.lang.Exception.*;
import java.io.*;
/**
 * Created by khalid on 13/5/16.
 */
public class File_IOI {
    public static void main(String args[]) throws IOException {
        FileInputStream in = null;       // FileReader in = null;// FileWriter out = null;
        FileOutputStream out = null;     //can do same thing using 16-bit
        int c;
        try {
            in = new FileInputStream("input.txt");
           //out = new FileOutputStream("output.txt");

          // while ((c = in.read()) != -1) {
            //    out.write(c);
            //}

            int size= in.available();
            for(int i=0;i<size;i++){
                System.out.println((char)in.read() + " ");
            }
        } finally {
            in.close();
            //out.close();
        }

    }
}