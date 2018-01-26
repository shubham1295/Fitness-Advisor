package org.sunbeam.Tool;

public class Tool {

	public static String bmiCalc( float ht, float wt )
	{
		float bmi = 0;
		float ht1 = ht/100;
		
		bmi = ( (wt)/(ht1*ht1) );
		
		if( bmi < 18.5 )
			return "underweight";
		else if ( bmi >= 18.5 && bmi <= 24.9 )
			return "normal";
		else if ( bmi >= 25 && bmi<=29.9 )
			return "overweight";
		else if ( bmi > 30 )
			return "obese";
		
		return null;
	}
}
