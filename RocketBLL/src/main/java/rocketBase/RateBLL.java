package rocketBase;

import java.util.ArrayList;

import org.apache.poi.ss.formula.functions.*;

import exceptions.RateException;
import rocketDomain.RateDomainModel;

public class RateBLL {

	private static RateDAL RateDAL = new RateDAL();
	private static double interestRate;
	
	public static double getRate(int GivenCreditScore) throws RateException 
	{
		//TODO - DONE --RocketBLL RateBLL.getRate - make sure you throw any exception
		
		//		Call RateDAL.getAllRates... this returns an array of rates
		//		write the code that will search the rates to determine the 
		//		interest rate for the given credit score
		//		hints:  you have to sort the rates...  you can do this by using
		//			a comparator... or by using an OrderBy statement in the HQL
		
		ArrayList<RateDomainModel> rates = RateDAL.getAllRates();
		
		for (RateDomainModel r : rates){
			if(r.getiMinCreditScore() == GivenCreditScore){
				interestRate = r.getdInterestRate();
			} 
		
		//TODO - DONE -- RocketBLL RateBLL.getRate
		//			obviously this should be changed to return the determined rate
		
			if (interestRate == 0){
				throw new RateException(r);
			}
		}
		return interestRate;
	}
	
	
	//TODO -- DONE -- RocketBLL RateBLL.getPayment
	//		how to use:
	//		https://poi.apache.org/apidocs/org/apache/poi/ss/formula/functions/FinanceLib.html
	
	public static double getPayment(double r, double n, double p, double f, boolean t)
	{		
		return FinanceLib.pmt(r, n, p, f, t);
	}
}
