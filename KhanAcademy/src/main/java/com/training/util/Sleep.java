package com.training.util;

public class Sleep {

public static void sleepMS(int ms) {
			try {
				Thread.sleep(ms);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
			public static void sleepSecounds(int secounds) {
				try {
					Thread.sleep(secounds*1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}		

	}

}
