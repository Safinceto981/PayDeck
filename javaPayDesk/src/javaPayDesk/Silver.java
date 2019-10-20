package javaPayDesk;

public class Silver implements ICards
{
	double rate;

	@Override
	public double turnover(double turnover)
	{
			if(turnover<=299) {
				rate = 2.0;
			}else if(turnover>300) {
				rate = 3.5;
			}
			
			return rate;
	}
}
