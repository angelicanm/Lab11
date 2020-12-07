/**
 * @author Angelica Dick
 * CMSC203
 */
package lab11;

public class Function2 extends Function {

	@Override
	public String answerString(double optVal, double x, double y, double z) {

		return "Time: " + fnValue(x); 
	}

	@Override
	public double fnValue(double x) {
		
		return (x/3) + (2 * (Math.sqrt(Math.pow(x, 2) - 8*x + 25))) ;
	}

	@Override
	public double getXVal(double x) {
		
		return x;
	}

	@Override
	public double getYVal(double x) {
		
		return 0;
	}

	@Override
	public double getZVal(double x) {
		// TODO Auto-generated method stub
		return -1;
	}
	
	public String toString() {
		return "How long will take the dog to reach the ball";
				
	}

}
