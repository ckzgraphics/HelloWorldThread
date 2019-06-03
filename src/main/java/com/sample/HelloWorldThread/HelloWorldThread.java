package com.sample.HelloWorldThread;

import java.util.concurrent.TimeUnit;

public class HelloWorldThread {

/**
 * THIS PROGRAM CREATS 2 OBJECTS FROM THE CLASS- PrintHello and PrintWorld
 * Object of PrintHello class prints the string 'Hello' on the console
 * Object PrintWorld class prints the string 'World' on the console
 * INTERNALLY RUN FUNCTION (of Thread class) IS CALLED BY EACH OBJECT
 */
public static void main(String[] args){
		
		try {
			
			long loopStartTime = System.nanoTime();
			for(int i=0; i<6; i++){
				
				PrintHello p = new PrintHello();
				PrintWorld w = new PrintWorld();
				p.start();
				w.start();
				
				// WAIT FOR 10 SECONDs 
				Thread.sleep(10000);
				// NEW LINE CHARACTER
				System.out.println();
			}
			long loopEndTime = System.nanoTime();
			
			long totalTime = loopEndTime - loopStartTime;
			
			System.out.println("\n TOTAL PROGRAM EXECUTION TIME : ".concat(Long.toString(TimeUnit.NANOSECONDS.toMinutes(totalTime)).concat(" Minutes")));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} // MAIN END

} // CLASS END
