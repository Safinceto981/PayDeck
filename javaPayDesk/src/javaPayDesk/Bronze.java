package javaPayDesk;

public class Bronze implements ICards 
{
	double rate;

	@Override
	public double turnover(double turnover) {
		
			double rate = 0;
			// TODO Auto-generated method stub
			if(turnover<100) {
				rate = 0.0;
			}else if (turnover>=100 &&turnover<300) {
				rate = 1.0;
			}else if(turnover>=300) {
				rate = 2.5;
			}
			return rate;
	}
}
