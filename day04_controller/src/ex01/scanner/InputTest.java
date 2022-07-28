package ex01.scanner;

public class InputTest {

	public static void main(String[] args) { // 들어오는 값을 가변적인 배열에 저장
		
//		System.out.println("String, Int = ");
		
		if(args.length <= 0) {
			System.out.println("데이터를 입력하세요 ");
			return;
		}
		
		String str = args[0];
		String strSu = args[1];
		int num = Integer.parseInt(strSu);
		
		int su = Integer.parseInt(args[1]); // 윗줄 코드를 이 코드로 간단하게 사용가능
		
		
		System.out.println(str);
		System.out.println(num + 33);

	}

}
