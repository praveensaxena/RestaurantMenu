package com.wctc.distjava.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Praveen Saxena
 */
public class MenuExpert {
    
    public List getEntries(String choice){
        List entries = new ArrayList();
        
        if(choice == null || choice.isEmpty()){
            entries.add("You must select an item from menu");
        }else if (choice.equalsIgnoreCase("drink")) {
             entries.add("Water");
             entries.add("Soda");
             entries.add("Beer");
             entries.add("Wine");
        } else if (choice.equals("appetizer")) {
            entries.add("Chips n Dip");
            entries.add("Vegi Samosa"); 
        } else if (choice.equals("entrees")) {
            entries.add("Orange Peel Chicken");
            entries.add("Mangolian Beef");
        }else {
            entries.add("Ice cream");
            entries.add("Cake");
        }

        return entries;
    }
}
