package quiz;

import java.util.HashMap;
import java.util.Iterator;

import quiz.Emp;

public class Emp extends EmpDto {
	
	// emp 추가 삭제 리스트출력 수정 프로그램 종료
	HashMap map = new HashMap();
	
	Emp() {
		
	}
	
	public Emp(String name, String phoneNum, String department, String lank, int pay) {
		int id = name.hashCode();
		EmpDto e = new EmpDto(name, phoneNum, department, lank, pay);
		map.put(id, e);
	}
	
	//추가
	public void EmpAdd(String name, String phoneNum, String department, String lank, int pay) {
		String id = name;
		EmpDto e = new EmpDto(name, phoneNum, department, lank, pay);
		map.put(id, e);
	}
	
	//삭제
	public void EmpRmv(String name) {
		String id = name;
		map.remove(id);
	}
	
	//수정
	public void EmpCh(String name, String phoneNum, String department, String lank, int pay) {
		EmpDto e = new EmpDto(name, phoneNum, department, lank, pay);
		String id = name;
		map.put(id, e);
	}
	
	//리스트 출력
	public void list() {
        Iterator it = map.values().iterator();
        while(it.hasNext()){
            System.out.println(it.next().toString());
        }
	}	
	
	
	
	

}
