package quiz;

public class QuizEx1 {

	public static void main(String[] args) {
		
		/* 산술연산자 문제
		 * 만원, 천원, 백원, 십원이 각 몇 장인지 구하시오. (56,7,8,9)
		 */
		
		int pay = 567890;
		
		int man = pay / 10000;
		int chun = (pay / 1000) % 56;
		int back = (pay / 100) % 567;
		int sip = (pay / 10) % 5678;
		
		System.out.println("만원 : " + man + "장 입니다.");
		System.out.println("천원 : " + chun + "장 입니다. ");
		System.out.println("백원 : " + back + "개 입니다. ");
		System.out.println("십원 : " + sip + "개 입니다. ");
		
		
		//위의 코드가 아닌 나머지 값을 저장할 변수를 선언하여 사용하면 숫자를 일일이 쓰지 않아도 된다..!!
		
		/* 이렇게 해도 됨
		 * pay / 10000
		 * (pay % 10000) / 1000
		 * ((pay % 10000) % 1000) / 100
		 * (((pay % 10000) % 1000) % 100) / 10
		 */
		
		int money = 10000;
		
		while(pay > 0) {
			System.out.println(money + "원 : " + (int)pay / money );
			pay = pay % money;
			money = money / 10;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
