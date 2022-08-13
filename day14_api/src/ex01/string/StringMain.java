package ex01.string;

public class StringMain {

	public static void main(String[] args) {
		int x = 3, y = 5;
		System.out.println("x = " + x + ", " + "y = " + y);
		x = y; // 값은 같아도 주소는 다르다
		System.out.println("x = " + x + ", " + "y = " + y);
		y = 77;
		System.out.println("x = " + x + ", " + "y = " + y);
		
		String s1 = "kosa";
		String s2 = "happy";
		
		System.out.println("s1 = " + s1 + ", " + "s2 = " + s2);
		System.out.println("s1 = " + s1.hashCode() + ", " + "s2 = " + s2.hashCode());
		s1 = s2;
		System.out.println("s1 = " + s1 + ", " + "s2 = " + s2);
		// 주소가 같아졌다..!!!!!!!!!!!! 위험함 : 번지에 같은 값이 들어갈 수 있는 위험성
		System.out.println("s1 = " + s1.hashCode() + ", " + "s2 = " + s2.hashCode());
		s1 = "virus";
		System.out.println("s1 = " + s1.hashCode() + ", " + "s2 = " + s2.hashCode());
		// 변수는 같은데 주소값이 계속 바뀐다
		s1 = "sinhyung";
		System.out.println("s1 = " + s1.hashCode() + ", " + "s2 = " + s2.hashCode());
		
		s1 = "gildong";
		System.out.println("s1 = " + s1.hashCode() + ", " + "s2 = " + s2.hashCode());
		
		
		
		
	}

}
