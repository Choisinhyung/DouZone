package ex01.dataType;

public class MainEntry {
	
	/* static변수는 따로 초기화를 하지 않아도 자동 초기화됨
	 * 정수형 : 0 / 실수형 : 0.0 / 문자형 : null
	 */
	static int su3;
	static String str2;
	static double dd;

	public static void main(String[] args) {
		
		System.out.println(su3);
		System.out.println(str2);
		System.out.println(dd);
		System.out.println("--------------------");

		int su = 9;
		char ch = 'A'; // 문자
		String str = "korea"; // 문자열
		double d = 12.34;
		
		System.out.println(su);
		System.out.println(ch);
		System.out.println(str);
		System.out.println(d + "\n");
		
		System.out.println("[" + su + "," + ch + "," + str + "," + d + "]\n");
		
		System.out.println(100); // ? int
		System.out.println(3.4); // ? double
		System.out.println("----------------------");
		System.out.println(100L); // ? long
		System.out.println(3.4F); // ? float
		
		System.out.println("---------------------");
		float f = 12.34f;  // 모든 float타입 값은 f를 붙여줘야 함
		System.out.println(f);
		
		System.out.println("---------------------");
//		int su2;
		int su2 = 9;
		System.out.println(su2); // local variable : 변수 선언하고 초기화를 하지 않으면 error
		
		/*
		 * 스택 영역에 4byte의 su2가 들어감. but 값이 없음.
		 * */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
