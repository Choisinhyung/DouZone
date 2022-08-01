package ex09.break_Continue;

public class MainEntry {

	public static void main(String[] args) {
		
		// break, continue
		
		boolean flag = true;
		
		//식별자는 변수명 만드는 규칙과 동일하다(예약어 사용x)
		frust : {
			
			second: {
			
				third : {
					int l = 100;
					System.out.println("Before the break");
					if(flag) break second; //해당하는 식별자까지 탈출
					System.out.println("This won't execute ");
				} //end third
			
			System.out.println("우리반 화이팅");
			} //end second
		System.out.println("This is after second block");
		} //end frust
	}
}
