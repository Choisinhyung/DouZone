//package ex01.lambda;
//
//interface Message {
//	void something(); // 미완성 함수
//}
//
//class Person {
//	public void greeting(Message msg) {
//		msg.something(); // 미완성 (main에서 p.greeting 불가)
//	}
//}
//
//public class MainEntry {
//
//	public static void main(String[] args) {
//		// Lambda Expression, JDK 1.8 이상
//		Person p = new Person();
//		p.greeting(new Message() {
//			
//			@Override
//			public void something() {
//				System.out.println("good morning");
//			}
//			
//		});
//		System.out.println("==============");
//		
//		//public int sum(int x, int y) { return x + y; }
//		// ( x, y ) -> { x + y }
//		
//		p.greeting(() -> {
//			System.out.println("good morning");
//			
//		});
//	}
//
//}
