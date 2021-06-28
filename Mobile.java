package com.nit.mobile;
import com.nit.sim.Sim;
import com.nit.sim3g.Sim3G;
public class Mobile{
	public void insertSim(Sim sim){
		sim.call();
		sim.sms();		
	}
	public void insertSim3G(Sim3G sim3g){
		sim3g.videoCall();
	}
}
