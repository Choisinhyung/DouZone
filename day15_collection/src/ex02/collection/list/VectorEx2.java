package ex02.collection.list;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class VectorEx2 {

	public static void main(String[] args) {
		int i;
		Date date = new Date();
		Vector v = new Vector();
		
		v.addElement("자바");
		v.addElement(12.34);
		v.addElement(date);
		
		System.out.println("---3개 객체 추가---");
		System.out.println("size : " + v.size() + ", capacity : " + v.capacity());
		
		for(i = 0; i < 10; i++) {
			v.addElement(i);
		}
		System.out.println("---10개 객체 추가---");
		System.out.println("size : " + v.size() + ", capacity : " + v.capacity());
		System.out.println("--- Vector 내용 출력 ---");
		Enumeration enu = v.elements();
		
		// 모든 데이터 꺼내오기
		while( enu.hasMoreElements()) {
			System.out.print(enu.nextElement() + " ");
		}
		System.out.println();
		System.out.println("--- 객체 내용 포함 확인 ---");
		if(v.contains("자바")) {
			System.out.println("자바 문자열이 포함되어 있습니다. ");
		} else {
			System.out.println("자바 문자열이 포함되어있지 않습니다. ");
		}
		
		//인덱스 모를 때
		System.out.println("12.34 객체 위치는? => " + v.indexOf(12.34));
		System.out.println("입력 시간 : " + date);
		//데이터 위치 찾아서 꺼내서 출력
		System.out.println(v.get(v.indexOf(date)));
		//date객체 삭제
		v.removeElementAt(v.lastIndexOf(date));
//		System.out.println(v.get(v.indexOf(date))); 삭제되어서 안나옴
		
		enu = v.elements();
		while(enu.hasMoreElements()) {
			System.out.print(enu.nextElement() + " ");
		}
		
		for(i = 0; i < v.size(); i++) {
//			v.removeElementAt(i);
//			v.remove(i);
//			v.removeAllElements();
			v.removeElementAt(i); // 데이터 위치가 삭제되면서 앞으로 당겨지며 인덱스 번호 변경됨
		}
		
		System.out.println();
		//삭제 후 남은 데이터
		System.out.println("size : " + v.size() + ", capacity : " + v.capacity());
		enu = v.elements();
		while(enu.hasMoreElements()) {
			System.out.print(enu.nextElement() + " ");
		}
		
		for(i = 0; i < v.size(); i++) {
			System.out.print(v.get(i) + " ");
		}
		
		System.out.println("-----------------");
		//셋팅
		v.removeAllElements(); // 모든 요소 제거
		
	}

}
