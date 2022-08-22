package ex07.innerClass;


// 중첩클래스
class OuterClass { // 외부 클래스
	// 내부에 있는 것 사용 불가, 자기 자신 것만 사용 가능
	
	static int no;
	String message = "안녕하세용";
	
	public void outerMethod() {
		System.out.println("outer method call");
//		System.out.println(su); // 내부 클래스 요소 사용 불가
	}
	
	class InnerClass { // 내부 클래스
		int su = 99;
		public void show() {
			System.out.println(su); // 내부(자신의 것) 사용 가능
			System.out.println(message); // 외부클래스 멤버 사용 가능
		}
		
		public void disp() {
			outerMethod(); // 외부클래스 메소드 호출
		}
	} // end InnerClass
} // end OuterClass

public class MainEntry {

	public static void main(String[] args) {
		//1.
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass inner = oc.new InnerClass();
		
		inner.disp();
		inner.show();
		System.out.println("-------------------");
		
		//2.
		OuterClass.InnerClass ic = new OuterClass().new InnerClass();
		ic.show();
		
	}

}
