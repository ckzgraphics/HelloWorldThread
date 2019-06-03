package com.sample.HelloWorldThread;

public class PrintHello extends Thread {
	
	public void run(){
		try {
			int randomSleepTime = (int) (Math.random() * 1001);
			sleep(randomSleepTime);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.print(" Hello ");
	} // FUNE END

} // CLASS END
