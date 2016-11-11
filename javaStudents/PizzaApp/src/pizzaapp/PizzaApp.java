/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaapp;

/**
 * Create pizza class that implements comparable interface
 * 
 * offers regular/sicilian (round/square)
 * 
 * super class for pizza
 *  two subclasses
 * 
 * comparable sorts based on size
 *  Small, med, large, XLarge
 * 
 * instance should include 
 *  size
 *  type
 *  toppings (arraylist of strings)
 *  cost of pizza
 * 
 * main program asks for 
 *  4 toppings for reg pizza, two for sicilian
 *  cust name
 *  type and size
 *  print ottal and description
 *  bonus: allow user to order multiple pizzas
 */


/**
 *
 * @author twats
 */
public class PizzaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SicilianPizza thisOrder = new SicilianPizza(1);
        System.out.println("Type: " + thisOrder.pizzaType);
        System.out.println("Size: " + thisOrder.pizzaSize);
        
    }
    
}
