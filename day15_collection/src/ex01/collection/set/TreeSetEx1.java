package ex01.collection.set;

import java.util.TreeSet;

public class TreeSetEx1 {

	public static void main(String[] args) {
		// set : 순서없고 중복 허용
		// 자기자신 객체 생성 가능 / 부모로도 가능 타입파라미터 가져올 수 있음
		// 오름차순 정렬하는 기능을 가지고 있다!!! 해시셋은 정렬안됨
		
		TreeSet set = new TreeSet();
		int[] score = {85, 95, 35, 45, 65, 10, 100, 50};
		
		for(int i = 0; i < score.length; i++) {
			set.add(new Integer(score[i]));
			
		}
		System.out.println(set);
		
		System.out.println("50보다 작은 값" + set.headSet(new Integer(50)));
		System.out.println("50보다 큰 값" + set.tailSet(50));
		System.out.println(set.first());
		System.out.println(set.last());

	}

}
