package com.mycompany.app;
import org.json.JSONArray;
import org.json.JSONObject;
import java.lang.Object;
import java.nio.Buffer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
import java.io.IOException;
import java.io.*;
/**
 * Created by khalid on 13/5/16.
 */


public class JsonFile {
    public static void main(String args[]){
        String phNo;
        Scanner obj1=new Scanner(System.in);
        Scanner obj2=new Scanner(System.in);
        JSONArray jsonArray = new JSONArray();
        JSONArray jsonArray1 = new JSONArray();
        String regexMail = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern1 = Pattern.compile(regexMail);
        String regexNo= "\\d{10}";
        Pattern pattern2 = Pattern.compile(regexNo);
        String regex3="";
        //BufferedWriter[] bw1 = null;
        try {
            //bw = new BufferedWriter(new FileWriter("jsonFile.txt"));
            System.out.println("enter no of entries");
            int num = obj1.nextInt();
            for (int i = 0; i < num; i++) {
                JSONObject Jobj1 = new JSONObject();
                boolean emailgood=false,phgood=false,goodname=false;
                System.out.println("Enter Details of person"+(i=1));

                while(!goodname) {
                    System.out.println("Enter Name");
                    if (obj2.hasNextLine()) {
                        Jobj1.put(" Name = ", obj2.nextLine());
                        goodname=true;
                    } else
                        System.out.println("That's not a String!");
                    //obj1.next(); // this is important!
                }

                System.out.println("Enter Address");
                Jobj1.put("Address = ", obj2.nextLine());

                while(!emailgood) {
                    System.out.println("Enter E-mail");
                    String str1 = obj2.nextLine();

                    Matcher matcher1 = pattern1.matcher(str1);
                    if (matcher1.matches()) {
                        Jobj1.put("E-mail = ", str1);
                        emailgood = true;
                    }
                    else System.out.println("Invalid E-mail");
                }
                while(!phgood){
                    System.out.println("Enter a valid Ph-No");
                    phNo=obj2.nextLine();
                    //String str2= String.valueOf(phNo);
                    Matcher matcher2 = pattern2.matcher(phNo);
                    if(matcher2.matches()){
                        //if((str2.length()==10)) {
                            Jobj1.put("Ph-No = ",phNo);
                            phgood = true;
                        //}
                    }
                    else System.out.println("Invalid Ph-No");
                }

                jsonArray.put(Jobj1);

                // bw.write(Jobj1.toString());
            }
            System.out.println(jsonArray);
            int count = jsonArray.length();
            for (int i = 0; i < count; i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                System.out.println("Enter File name for person" + (i + 1));
                BufferedWriter bw1 = new BufferedWriter(new FileWriter(obj2.nextLine()));
                bw1.write("person " + (i + 1) + "\n");
               // bw1.newLine();
                bw1.write(jsonObject.toString(2));
                bw1.newLine();
                bw1.close();
            }
        }
        catch(Exception e){
            System.out.println("Error");
        }


    }

}
