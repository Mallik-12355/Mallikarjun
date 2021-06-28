package com.nit.airtel;
import com.nit.sim.Sim;
public class Airtel implements Sim{
	public void call(){
		System.out.println("Calling From Airtel: ");
	}
	public void sms(){
		System.out.println("Sending Sms From Airtel");
	}
/*	public void videoCall(){
		System.out.println("Video Calling From Airtel");
	}
*/
}
