package javaPayDesk;

public class Gold implements ICards
{
	double rate;
	
	@Override
	public double turnover(double turnover) {
		// TODO Auto-generated method stub
		
		if(turnover<=299) {
			rate = 2.0;
		}else if(turnover<=399) {
			rate = 3.0;
		}
		else if(turnover<=499) {
			rate = 4.0;
		}
		else if(turnover<=599) {
			rate = 3.0;
		}
		else if(turnover<=699) {
			rate = 3.0;
		}
		else if(turnover<=799) {
			rate = 3.0;
		}
		else if(turnover<=899) {
			rate = 3.0;
		}
		else if(turnover<=1000) {
			rate = 9.0;
		}
		else if(turnover>1000){
			rate = 10.0;
		}
		
		return rate;
	}
}




	
	


