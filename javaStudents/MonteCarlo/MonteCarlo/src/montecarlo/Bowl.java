/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package montecarlo;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author Gertrude
 */
public class Bowl {
    
    ArrayList<String> marbles = new ArrayList<>();
    
    public void drawOne() {
        //make random number generator
        Random rr = new Random();   
        // draw random number
        int numMarble = marbles.size();
        int randInt = rr.nextInt(numMarble);
        
        String selection = marbles.get(randInt);
        marbles.remove(randInt);
        
        System.out.println(selection);
        System.out.println(numMarble);
        System.out.println(randInt);
    }
    
    public void fillBowl(int nWhite, int nBlue) {
        int count = 0;
        while (count < nWhite) {
            marbles.add("white");
            count ++;
        }
        count = 0;
        while (count < nBlue) {
            marbles.add("blue");
            count ++;
        }
    }
    
}

