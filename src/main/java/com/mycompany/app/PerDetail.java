/*
	Project Person_Database
	version 1.0
	@copyright khd
*/
package com.mycompany.app;  //project folder my-app
import java.util.*;         //access Scanner class
import java.io.IOException; //handle i/o exception
import java.io.*;

public class PerDetail{
	    public static void main(String arg[]) throws IOException {
            Scanner obj1 = new Scanner(System.in);
            Scanner obj2 = new Scanner(System.in);
            Scanner obj3 = new Scanner(System.in);
            BufferedWriter bw = null;
      
        //try to catch any error
        try {
	    //Prompt for no of entries each corresponding to a person
            System.out.println("enter no of entries");
            int num = obj1.nextInt();
	    //
            bw = new BufferedWriter(new FileWriter("PeresonFile2.txt"));

	    //Prompting user to enter details of a person...	
            for (int i = 0; i < num; i++) {
	        System.out.println("Person"+(i+1)+"details:");
  		bw.write("Person "+(i+1)+"\n");

                System.out.println("Enter Name");
                bw.write("Name = "+obj2.nextLine()+"\n");

                System.out.println("Enter e-mail");
                bw.write("E-mail = "+obj2.nextLine()+"\n");

                System.out.println("Enter Address: ");
                bw.write("Address = "+obj2.nextLine()+"\n");

                System.out.println("Enter Ph-No");
                bw.write("Ph-No = " +obj1.nextInt());
                bw.newLine();

            }

	//if error occurs in try block that is handled here
        }
	catch(IOException e){
            System.out.println("error in file");
        }

        //finally execute this statement
        finally {
            if(bw != null)
            bw.close();  //close the object before exiting..

        }


        }
			
		
	
}
