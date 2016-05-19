package com.mycompany.app;
import java.util.*;
import java.io.IOException;
import java.io.*;

/**
 * @author Khalid
 * @date
 * @version
 */
public class personFile {
    /**
     *
     * @param args
     * @throws IOException
     */
    public static void main(String args[]) throws IOException {
        //FileInputStream in = null;       // FileReader in = null;//
        //FileOutputStream out = null;     //can do same thing using 1
        Scanner obj1 = new Scanner(System.in);
        Scanner obj2 = new Scanner(System.in);
        Scanner obj3 = new Scanner(System.in);
        BufferedWriter bw = null;
       // File file= new File("PeresonFile.txt");
       // file.createNewFile();
        try {

            System.out.println("enter no of entries");
            int num = obj1.nextInt();
         //   FileWriter fw = new FileWriter(file);
            bw = new BufferedWriter(new FileWriter("PeresonFile2.txt"));


            for (int i = 0; i < num; i++) {
                bw.newLine();

                bw.write("Person "+(i+1));
                bw.newLine();

                System.out.println("Enter Name");
                bw.write("Name = "+obj2.nextLine());
                bw.newLine();

                System.out.println("Enter e-mail");
                bw.write("E-mail = "+obj2.nextLine());
                bw.newLine();

                System.out.println("Enter Marital status: Married)(true), Umarried (false)");
                bw.write("Marital = "+obj2.nextLine());
                bw.newLine();

                bw.write("Ph-No = " +obj1.nextInt());
                bw.newLine();

            }
        }catch(IOException e){
            System.out.println("error in file");
        }
        finally {
            bw.close();
            //out.close();
        }


    }
}
