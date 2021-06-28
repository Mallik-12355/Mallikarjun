package com.nit.customer;
import com.nit.mobile.Mobile;
import com.nit.airtel.Airtel;
import com.nit.bsnl.Bsnl;
import com.nit.airtel3g.Airtel3G;
public class Customer{
	public static void main(String[] args){
		Mobile iphone=new Mobile();
		iphone.insertSim(new Airtel());
		iphone.insertSim3G(new Airtel3G());
		System.out.println();
		iphone.insertSim(new Bsnl());
	}
}
