package com.nit.airtel3g;
import com.nit.airtel.Airtel;
import com.nit.sim3g.Sim3G;
public class Airtel3G extends Airtel 
								implements Sim3G {
		public void videoCall(){
			System.out.println("Video Calling Wth Airtel3G: ");
	}
}
