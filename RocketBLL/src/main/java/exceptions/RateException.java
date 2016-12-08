package exceptions;

import rocketDomain.RateDomainModel;

public class RateException extends Exception {

	public RateDomainModel rdm = null;
	
	public RateException(RateDomainModel rate) {
	
		this.rdm = rdm;
	}
	
	public RateDomainModel getRateException(){
		return rdm;
	}

	//	TODO - DONE -- RocketBLL RateException - RateDomainModel should be an attribute of RateException
	//	* Add RateRomainModel as an attribute
	//	* Create a constructor, passing in RateDomainModel
	//	* Create a getter (no setter, set value only in Constructor)
}
