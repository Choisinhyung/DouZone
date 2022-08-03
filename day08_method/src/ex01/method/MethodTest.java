package ex01.method;

public class MethodTest {

	
	public static int iShow() {
		int su = 200;
//		return 100;
//		return su;
		return su + 99;
	}
	
	public static String show() {
		return "Hello";
	}
	
	public static int plus(int x, int y) {
		int sum = x + y;
		return sum;
	}
	
	public static int add(int x, int y) {
		return x + y;
	}
	
	
	public static void main(String[] args) {
		//출력의 책임은 호출한 곳에 있다. 
		System.out.println(iShow());
		int num = iShow();
		System.out.println("iShow() = " + num);
		String str = show();
		System.out.println(str);
		int sum = plus(3, 5);
		System.out.println(sum);
		System.out.println(add(3, 7));
	}

}
