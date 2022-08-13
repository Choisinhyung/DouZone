package ex02.Interface;

public class MainEntry {

	public static void main(String[] args) {
		
		BB b = new BB();
		b.draw();
		b.show();
		
		IDraw bb = new BB();
		bb.draw();
//		bb.show(); // 다운 캐스팅 되었기 때문에 IDraw타입 객체로는 호출 불가

	}

}
