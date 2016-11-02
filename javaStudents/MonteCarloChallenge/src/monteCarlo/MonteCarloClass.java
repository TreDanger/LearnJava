/**
 *   Challenge objectives:
 *   Using MC simulation, estimate probability of...
 *   	Getting three same color marbles out of a bowl with 
 *      3 blue/3 white marbles
 *      
 *   Steps:
 *   	Create var's for blue/white
 *   	add var's to count attemps/success
 *   	loop 
 *   	create an array to simulate bowl
 *   	create second array to hold three marbles selected
 *   	
 *   	create smaller loop to draw 3
 *   	randomly choose one marble and add to drawn marbles
 *   	redue size by 1 (one you chose)
 *   	update bowl to be without selected marble
 *   	
 *   	creat test to check if all three are the same
 *   	if so, add to success counter
 *   	either way, add to attempts
 *   	
 *   	from there, calculate success/attempts rate.
 *
 */
package monteCarlo;

/**
 * @author twats
 *
 */
public class MonteCarloClass {

	/**
	 * @param args
	 */
	// initialize arrays, params
	
	boolean[] bowlMaster = {
			true,true,true,
			false,false,false}; // array: true = blue, false = white
	
	boolean[] bowl = new boolean[6];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void resetBowl () {
		//Resets the boolean bowl
		this.bowl = this.bowlMaster;
	}
	
}
