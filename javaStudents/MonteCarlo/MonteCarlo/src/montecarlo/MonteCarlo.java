/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package montecarlo;
import montecarlo.Bowl;

/**
 *
 * @author Gertrude
 */
public class MonteCarlo {

    /**
     * @param args the command line arguments
     */
    //Master bowl for reset method
    //boolean[] bowlMaster = {
    //    true,true,true,
   //     false,false,false};
    
    //Temp bowl for random draws
    //boolean[] bowl = new boolean[6];
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //new class constructor
        MonteCarlo mc = new MonteCarlo();
        //fill the bowl with marbles
        Bowl myBowl = new Bowl();
        myBowl.fillBowl(3,3);
        //Take one
        myBowl.drawOne();
        System.out.println("done");
        System.out.println(myBowl.marbles);
        simulation(100);
        simulation(10000);
    }
    
    public static void simulation(int nDraws) {
        
    }
   // public void resetBowl() {
     //   this.bowl = this.bowlMaster;
    //}
    
    //public void drawMarbles(int count) {
        
    //}
    
}
