package ex04.constructor;

public class Circle {
	 private int x, y, z;
	 
	 // this() : 생성자 함수의 다른 이름 this(100, 100, 100);
	 // ㄴ 맨 첫줄에 나와야 함
	 
	 
	 public Circle() {
		 x = y = z;
	 }
	 public Circle(int x) {
		 this.x = x;
	 }
	 public Circle(int x, int y) {
		 this.x = x;
		 this.y = y;
	 }
	 public Circle(int x, int y, int z) {
		 this.x = x;
		 this.y = y;
		 this.z = z;
	 }
	 
	 public void disp() {
		 System.out.println(x + y + z);
	 }
	 
	 
}



