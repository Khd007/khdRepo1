package com.mycompany.app;
import com.thoughtworks.xstream.mapper.Mapper;
import org.apache.commons.lang.ObjectUtils;

import java.util.*;
import java.lang.*;
/**
 * Created by khalid on 11/5/16.
 */

public class hashmapExp {

   public static void  main(String args[]) {
       Scanner obj = new Scanner(System.in);
       String value;
       boolean good = false;
       int count = 0;
       HashMap<String, Integer> hm = new HashMap<String, Integer>();

       while (!good) {
           System.out.println("Enter new String or enter z to exit");
           value = obj.nextLine().trim();
           if (!value.equalsIgnoreCase("z")) {
               if (hm.containsKey(value)) {
                   Integer integer = hm.get(value);//or count++;
                   hm.put(value,++integer);
               } else {
                 //or  count=0;
                 //  count += 1;
                   hm.put(value, 1);
               }
           }
           else good=true;
       }

       for(Map.Entry m:hm.entrySet())
           System.out.println(m.getKey()+" "+m.getValue());
   }
}



