/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kathycatering;

import java.util.Date;

/**
 *
 * @author Gertrude
 */
public class KathyCatering {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date dateOf = new Date();
        dateOf.setMonth(9);
        dateOf.setDate(9);
        dateOf.setYear(2001-1900);
        
        String eventType = "wedding";
        int numGuests = 30;
        
        System.out.println(dateOf.toString());
        Event wed1 = new Event(eventType, dateOf, numGuests);
        Event wed2 = new Event("birthday", dateOf, numGuests + 3);
        
        wed1.printEvent();
        wed2.printEvent();
    }
    
}
