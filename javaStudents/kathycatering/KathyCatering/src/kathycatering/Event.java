/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kathycatering;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author Gertrude
 */
public class Event {
    private String eventType;
    private Date dateOf;
    private int numGuest;
    private double eventCost = 40;
    //private Random randnum = new Random();
    private String eventNum;
    static int eventNumStem = 0;
    
    ///
    /// Create different constructors
    ///
    
    // ..for when event type, date, and number of guests are all known
    public Event(String eventType, Date dateOf, int numGuest) {
        this.eventType = eventType;
        this.dateOf = dateOf;
        this.numGuest = numGuest;
        
        if (eventNumStem == 0){
            Random randnum = new Random();
            eventNumStem = randnum.nextInt();
        } else {
            eventNumStem++;
        }
        char firstChar = this.eventType.charAt(0);
        this.eventNum = Character.toString(firstChar) + Integer.toString(eventNumStem);
    }
    
    //...for when only event type and date are known
    public Event(String eventType, Date dateOf) {
        this.eventType = eventType;
        this.dateOf = dateOf;
        
        if (eventNumStem == 0){
            Random randnum = new Random();
            eventNumStem = randnum.nextInt();
        } else {
            eventNumStem++;
        }
        char firstChar = this.eventType.charAt(0);
        this.eventNum = Character.toString(firstChar) + Integer.toString(eventNumStem);//.toString();
    }
    
    //...for when only the event type is known
    public Event(String eventType) {
        this.eventType = eventType;
        
        if (eventNumStem == 0){
            Random randnum = new Random();
            eventNumStem = randnum.nextInt();
        } else {
            eventNumStem++;
        }
        char firstChar = this.eventType.charAt(0);
        this.eventNum = Character.toString(firstChar) + Integer.toString(eventNumStem);
    }
    
    //Special Methods
    
    public double calculateTotal() {
        return this.numGuest * this.eventCost;
    }
    
    public void printEvent() {
        System.out.println("Event Number: " + eventNum);
        System.out.println("Event Type: " + eventType);
        System.out.println("Date: " + this.getEventDate());
        System.out.println("Number of Guests: " + this.numGuest);
        System.out.println("Total Cost: " + this.calculateTotal());
        System.out.println("-------------------------------------");
    }
    //////
    //Setter methods
    /////
    
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }
    
    public void setDateOf(Date date){
        dateOf = date;
    }
    
    public void setNumGues(int numGuest){
        this.numGuest = numGuest;
    }
    
    public void setEventCost(double cost) {
        eventCost = cost;
    }
   
    public void setEventNum (String eventNum) {
        this.eventNum = eventNum;
    }
    
    //
    //Getter methods
    //
    
    public String getEventType() {
        return this.eventType;
    }
    
    public Date getEventDate() {
        return this.dateOf;
    }
    
    public double getEventCost() {
        return this.eventCost;
    }
    
    public String getEventNumber() {
        return this.eventNum;
    }
    
}
