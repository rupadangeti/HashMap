package com.core.example1;




import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
 
public class TestHashMap {
 
   public static void main(String args[]){
 
      HashMap<String,String> hmCountry = new HashMap<String,String>();
      // adding elements to the HashMap
      hmCountry.put("CA","California");
      hmCountry.put("FL","Florida");
      hmCountry.put("TX","Texas");
      hmCountry.put("LA","LosAngles");
      hmCountry.put("NY","Newyork");
      hmCountry.put("NJ","Newjersy");
      hmCountry.put("PA","Pennsylvania ");
      hmCountry.put("OH","Ohio");
      hmCountry.put("KY","Kentuky");
      
 
      // display the HashMap content using Iterator
      Set set = hmCountry.entrySet();
      Iterator iterator = set.iterator();
      while(iterator.hasNext()) {
         Map.Entry ent = (Map.Entry) iterator.next();
         System.out.print("key: " + ent.getKey() + ", Value: ");
         System.out.println(ent.getValue());
      }
   }
}