/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaapp;

import java.util.HashMap;

/**
 *
 * @author twats
 */
public class toppingsMenu {
    public static HashMap<String, Double> menu;
    String size;
    String style;
            
    toppingsMenu() {
        System.out.println("No options selected... assuming Large traditional Pizza");
        
    }
    
    public static void genToppingsMenu() {
        menu.put("Pep", .50);
        menu.put("Sausage", 0.5);
    }
    
}
