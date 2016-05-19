package com.mycompany.app;
import java.util.*;

import org.json.JSONException;
import org.json.JSONException.*;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Created by khalid on 11/5/16.
 */
public class JsonAbc {
   public static void main(String args[]){
   // void EnterDetails() {
        Scanner obj1 = new Scanner(System.in);
        JSONArray jsonArray = new JSONArray();
        Scanner obj2 = new Scanner(System.in);
    try {
        System.out.println("enter no of entries");
        int num = obj1.nextInt();


        for (int i = 0; i < num; i++) {
            JSONObject Jobj1 = new JSONObject();
            JSONArray jsonArray1 = new JSONArray();
            System.out.println("Enter first name");
            Jobj1.put("First name", obj2.nextLine());

            System.out.println("Enter Last name");
            Jobj1.put("Last name", obj2.nextLine());

            System.out.println("Enter qualification: Graduation, University, Branch");
            jsonArray1.put(obj2.nextLine());
            jsonArray1.put(obj2.nextLine());
            jsonArray1.put(obj2.nextLine());

            System.out.println("Enter DOB");
            Jobj1.put("DOB ", obj2.nextLine());

            System.out.println("Enter Age");
            Jobj1.put("Age", obj1.nextInt());

            Jobj1.put("Qualification ", jsonArray1);
            jsonArray.put(Jobj1);

        }


        int count = jsonArray.length();
        for (int i = 0; i < count; i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            System.out.println("Student-Details " + (i + 1) + ": " + jsonObject.toString());
        }
    }
    catch(JSONException e){
        throw new RuntimeException(e);
    }
        //}
    }
}
