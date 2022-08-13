package ex02.collection.list;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
		// List : 순서가 있고, 중복을 허용한다.
		
		Vector<Integer> v = new Vector();
		System.out.println("length / capacity");
		System.out.println(v.size() + "       " + v.capacity()); // 길이값지정
		
		Vector<Integer> v2 = new Vector(3, 4); // 초기용량, 증가용량
		v2.add(2);
		v2.add(33);
		v2.add(2);
		System.out.println(v2.size() + "       " + v2.capacity());
		System.out.println(v2);
		v2.add(20);
		v2.add(12);
		v2.add(55);
		v2.add(99);
		v2.add(55);
		System.out.println(v2.size() + "       " + v2.capacity());
		System.out.println(v2);
		
		// 출력하기 : 넣었던 순서대로 들어가며 중복이 허용된다. 
		Iterator it = v2.iterator();
		while ( it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		// 자체적으로 꺼내오는 메소드 get();
		for(int i = 0; i < v2.size(); i++) {
			System.out.print(v2.get(i) + " ");
		}
		System.out.println();
		// elementAt()으로 꺼내오기
		for(int i = 0; i < v2.size(); i++) {
			Integer num = v2.elementAt(i);
			System.out.print(num.toString() + " ");
		}
		System.out.println();
		System.out.println(v2.size() + v2.capacity());
		v2.trimToSize(); // 용량 조정하기
		System.out.println(v2.size() + v2.capacity());
		
	}

}
