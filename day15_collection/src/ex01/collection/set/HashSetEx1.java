package ex01.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx1 {

	public static void main(String[] args) {
		// Set : 순서 없고, 중복 허용 X
//		HashSet<String> hs = new HashSet<String>();
		HashSet<String> hs = new HashSet();
		hs.add("키보드");
		hs.add("컵");
		hs.add("마우스");
		hs.add("볼펜");
		hs.add("키보드");
		System.out.println("요소 개수 : " + hs.size());
		System.out.println(hs);
		Iterator it = hs.iterator();
		
		// hasNext 다음 요소가 있느냐
		while ( it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		//컵 볼펜 키보드 마우스 
		// 순서 없고 중복허용하지 않다는 것을 증명 : 중복데이터같은 경우 가장 마지막에 들어간 데이터를 사용
		System.out.println();
		
		HashSet<Integer> hs2 = new HashSet();
		hs2.add(200);
		hs2.add(100);
		hs2.add(3000);
		hs2.add(100);
		System.out.println(hs2);
		for(Integer item : hs2) {
			System.out.print(item + " ");
		}
	}

}
