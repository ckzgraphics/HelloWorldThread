package com.sample.HelloWorldThread;

public class PrintWorld extends Thread {
	
	public void run(){
		try {
			int randomSleepTime = (int) (Math.random() * 2000);
			sleep(randomSleepTime);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.print(" World ");
	} // FUNC END
	
} // CLASS END
