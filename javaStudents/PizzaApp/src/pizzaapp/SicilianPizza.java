/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaapp;

/**
 *
 * @author twats
 */
public class SicilianPizza extends Pizza {
    
    // type only constructor
    public SicilianPizza () {
        super("Sicilian");
        maxToppings = 2;
        baseCost = 10.;
    }
    
    // type and size constructor
      public SicilianPizza (int pizzaSize) {
        super("Sicilian", pizzaSize);
        maxToppings = 2;
        baseCost = 10.;
        
    }  

    
}
