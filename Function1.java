/**
 * @author Angelica Dick
 * CMSC203
 */
package lab11;

import java.text.DecimalFormat;

public class Function1 extends Function{

	@Override
	public String answerString(double optVal, double x, double y, double z) {
		
	String str = "$#,###.##";
		DecimalFormat dF = new DecimalFormat(str);
				dF.applyPattern("#0.##");
		
		return "Minimum cost is "+ dF.format(optVal)+" with height = "+ 
				dF.format(y) +"cm and radius = "+ dF.format(x) +"cm";
		
	}

	@Override
	public double fnValue(double x) {
		
			return (0.8 * Math.PI * Math.pow(x,2)) + (800/x);
	}

	@Override
	public double getXVal(double x) {
		
		return x;
	}

	@Override
	public double getYVal(double x) {
		
		return 2000 / (Math.PI*Math.pow(x, 2));
	}

	@Override
	public double getZVal(double x) {
		// TODO Auto-generated method stub
		return -1;
	}
	
	public String toString() {
		return "Minimize the cost of a can that will hold 2 liters of liquid";
	}

}
