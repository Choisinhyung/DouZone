package ex01.thread;

public class UserThread extends Thread {
	
	String name;

	public UserThread(String name) {
//		super(); // 스레드 클래스가 가지고 있는 디폴트 생성자
		this.name = name;
	}

	@Override
	public void run() { // 스레드 실행부(구현부)
		
		for(int i = 1; i <= 10; i++) {
			if(i == 7) {
				try {
					// 중지상태
					sleep(1000); // Thread를 상속 받았기에 바로 사용가능, 예외 발생 / 1000 = 1초
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
				System.out.println(name);			
			} // end if
			
			System.out.println(i);
		} // end for
		
//		super.run();
	}
	

}
