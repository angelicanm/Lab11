/**
 * @author Angelica Dick
 * CMSC203
 */
package lab11;

import java.text.DecimalFormat;

public class Function3 extends Function {

	@Override
	public String answerString(double optVal, double x, double y, double z) {
		String str = "#,###,##0.##";
		DecimalFormat value = new DecimalFormat(str);
	    return "Minimum distance to (0,1) is " + value.format(optVal) +
	    		" at the points (" + value.format(x)+ ","
				+ value.format(y) + ") and (" + value.format(-x) + "," + value.format(y) + ")";
	}

	@Override
	public double fnValue(double x) {
		
		return (Math.sqrt(Math.pow(x, 4) - Math.pow(x, 2) + 1));
	}

	@Override
	public double getXVal(double x) {
		
		return x;
	}

	@Override
	public double getYVal(double x) {
		double y = Math.pow(x, 2);
		
		return y;
	}
	@Override
	public double getZVal(double x) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String toString() {
		return "Find the minimum distance between the function y = x^2 and the point (0, 1)";
	}

}
