package TuitionCalc;

public class TuitionCalculationForm {
	public static double Calculate(double InitialTuitionFee, double PercentOfIncrease, double APR, double Term) {
		double Total = 0;
		for (double i = 4; i>0; i--) {
			double Price = InitialTuitionFee;
			InitialTuitionFee *= (1+PercentOfIncrease);
			Total += Price;
		}
		Total = Total * Math.pow((1+APR/12), (12*Term));
		return Total;
	}
	public static double Monthly(double Total, double Term) {
		double Monthly = Total / (12*Term);
		return Monthly;
				
	}

}
