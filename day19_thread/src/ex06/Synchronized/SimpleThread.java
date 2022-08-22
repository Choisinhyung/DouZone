package ex06.Synchronized;

public class SimpleThread {

	static void threadMessage(String message) { // outer class
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + message);
	}
	
	static class MessageLoop implements Runnable { // inner class

		@Override
		public void run() {
			String[] importantInfo = {"aa aa", "bb b", "cc c", "dd d"};
			
			try {
				for (int i = 0; i < importantInfo.length; i++) {
					Thread.sleep(4000); //4초
					threadMessage("I wasnt done!!");
				} // end for
			} catch (Exception e) {
				e.printStackTrace();
			} // end try
			
		} // end run()
		
	} // end MessageLoop - inner class
	
	public static void main(String[] args) throws InterruptedException {
		long parience = 1000 * 60 * 60;
		
		if(args.length > 0) {
			try {
				parience = Long.parseLong(args[0]) * 1000;
			
			} catch (Exception e) {
				System.out.println("argument integer input");
				System.exit(1); // 강제 종료
			} // end try
		} // end if
		
		threadMessage("start MessageLoop thread test");
		long startTime = System.currentTimeMillis();
		Thread t = new Thread(new MessageLoop());
		t.start();
		
		while(t.isAlive()) {
			threadMessage("still waitting........");
			t.join(1000);
			
			if(((System.currentTimeMillis() - startTime) > parience) && t.isAlive()) {
				
				threadMessage("Tired of waitting.......");
				t.interrupt();
				t.join();
				
			}// end if
			
		} // end while
		
		threadMessage("Finally........");
	} 
} // end SimpleThread - outer class
