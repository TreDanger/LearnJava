/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaapp;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * instance should include 
 *  size
 *  type
 *  toppings (arraylist of strings)
 *  cost of pizza
*/

/**
 *
 * @author twats
 */
public abstract class Pizza implements Comparable {
    public int pizzaSize = 3; //Size of this pizza, 1 = small, 2 = med, 3 = large, 4 = XLarge, Large is default
    public String sizeString;
    public String pizzaType; //Traditional or Sicilian
    public ArrayList<String> toppings = new ArrayList<>();
    public Double toppingCost = 0.;
    //private String[] AvailableToppings = new String[10];
    public int maxToppings;
    
    public Double baseCost = 0.;
    public Double sizeUpCharge =0.;
    
    public HashMap<Integer, String> sizeMap = new HashMap<>();
    
    
    
    ////////
    // create constructors
    ///////
    
    // default constructor..
    public Pizza() {
        pizzaType = "Traditional";
    }
    // pizza type only
    public Pizza(String pizzaType) {
        this.pizzaType = pizzaType;
    }
    
    // pizza type, and size
    public Pizza(String pizzaType, int pizzaSize) {
        this.pizzaType = pizzaType;
        this.pizzaSize = pizzaSize;
        
        switch (pizzaSize) {
            case 1: sizeUpCharge = 0.;
            case 2: sizeUpCharge = 2.;
            case 3: sizeUpCharge = 3.5;
            case 4: sizeUpCharge = 4.;
        }
    }
    
    // create other methods
    public void addTopping(String topping) {
        
        if (toppings.size() < maxToppings) {
            toppings.add(topping);
            toppingCost += 0.5; //assume 0.5 per topping
            System.out.println("" + topping + " added to this pizza");
        }
        else {
            System.out.println("You can't add any more toppings to this pizza");  
        }
    }
    
    // THis depends on the size of the pizza
    //public abstract void genToppingsMenu();
    
        
    
    
    public double calcTotal() {
        // TODO - add calculate total method which looks at prices per topping
        return toppingCost + sizeUpCharge + baseCost;
    }
    
    @Override
    public int compareTo(Object p) {
        Pizza pizz = (Pizza)p;
        if (this.pizzaSize > pizz.pizzaSize) {
            return 1;
        }
        else if(this.pizzaSize < pizz.pizzaSize) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
