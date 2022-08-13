package ex01.collection.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetEx2 {

	public static void main(String[] args) {
		
		//오브젝트는 어떤 타입도 수용
		Object[] objArr = {"1", new Integer(1), "2", "3", "4", "4", "4"};
		
		Set set = new HashSet(); // 부모로부터 가손 객체 생성 가능
		
		for(int i = 0; i < objArr.length; i++) {
			set.add(objArr[i]);
		}
		System.out.println(set);
	}

}
