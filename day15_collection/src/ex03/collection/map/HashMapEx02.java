package ex03.collection.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx02 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap();
		map.put("신형1", 100);
		map.put("신형2", 99);
		map.put("신형3", 98);
		map.put("신형4", 97);
		map.put("신형5", 96);
		
		//entrySet : 데이터 전체 꺼내서 확인하기
		//set그릇에 넣자~u
//		Set set = (Set)map.entrySet().iterator();
		Set set = (Set)map.entrySet();
		System.out.println(set);
		Iterator it = set.iterator();
		
		
		
		//위에서 가져온 모든 데이터를 분리해보자
		while(it.hasNext()) {
			//맵에 있는 요소 분리하기
			Map.Entry e = (Map.Entry)it.next();
			System.out.print("이름 : " + e.getKey());
			System.out.print(", 점수 : " + e.getValue());
			System.out.println();
		}
		
		//키만 뽑아오자
		set = map.keySet();
		System.out.print("참가자 명단 : " + set);
		
		//값만 뽑아오자
		Collection values = map.values();
		it = values.iterator();
		
		int total = 0;
		while(it.hasNext()) { // 다음 요소가 있는지?
			Integer i = (int)it.next(); // object타입이기 때문에 형변환
			total += i.intValue(); // 데이터 누적
		}
		
		System.out.println();
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (double)total/set.size());
//		System.out.println("평균 : " + total/map.size());
		//컬렉션은 인터페이스, 컬렉션s는 클래스
		System.out.println("최고 점수 : " + Collections.max(values));
		System.out.println("최하 점수 : " + Collections.min(values));
	}

}
