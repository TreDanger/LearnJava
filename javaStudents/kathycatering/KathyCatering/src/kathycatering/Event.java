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
public class Event {
    private String eventType;
    private Date dateOf;
    private int numGuest;
    private double eventCost = 40;
    private String eventNum;
    
    public Event(String eventType, Date dateOf, int numGuest, String eventNum) {
        this.eventType = eventType;
        this.dateOf = dateOf;
        this.numGuest = numGuest;
        this.eventNum = eventNum; //event number
        //this.eventCost = eventCost;
    }
    
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
