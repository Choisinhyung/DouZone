package ex01.thread;

public class MainEntry {

	public static void main(String[] args) {
		Thread t1 = new UserThread("t1");
		UserThread t2 = new UserThread("t2");
		Thread t3 = new UserThread("t3");
		Thread t4 = new UserThread("t4");
		
//		t1.run(); // x
		
		// 처음에는 들어간 순서대로 잘 나옴. 
		//but 메시지큐에 순서가 매번 다르게 저장되기에 이후에는 출력순서가 바뀔 수 있다.
		t1.start(); // run() 유도한다.
		t2.start(); // run() 유도한다.
		t3.start(); // run() 유도한다.
		t4.start(); // run() 유도한다.
		
		
		
		
	}

}