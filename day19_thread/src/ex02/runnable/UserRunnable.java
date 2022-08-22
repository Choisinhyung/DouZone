package ex02.runnable;

public class UserRunnable implements Runnable {
	
	String name;
	
	public UserRunnable(String name) {
		this.name = name;
	}
	
	@Override
	public void run() { //스레드 실행부(구현부)
		
		for(int i = 1; i <= 10; i++) {
			if(i == 7) {
				try {
					// 중지상태
					Thread.sleep(1000); // Thread를 상속 받았기에 바로 사용가능, 예외 발생 / 1000 = 1초
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
				System.out.println(name);			
			} // end if
			
			System.out.println(i);
		} // end for
		
		System.out.println("졸령");

	}

}
