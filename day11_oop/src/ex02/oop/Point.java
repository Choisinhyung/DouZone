package ex02.oop;

class Point { // 접근지정자
	// private 본인 클래스에서만 사용가능하기 때문에 메인클래스에서 pt.으로 함수를 호출했을 때 불가능하다. 
	private int x, y; // private < default(같은 패키지 모두 공유) < protected < public
	
	public Point() { //생성자함수 - 멤버변수 초기화 담당
		x = 9; y = 8;
	}
	
	public void setData(int xx, int yy) {
		x = xx;
		y = yy;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int xx) {
		this.x = xx;
	}

	public int getY() {
		return y;
	}

	public void setY(int yy) {
		this.y = yy;
	}
	
	public void display() {
		System.out.println(x + ", " + y);
//		System.out.println(getX() + ", " + getY());
	}
	
}