package quiz_05;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class VideoInfo extends Video { // controller
	
	HashMap map = new HashMap();
	
	VideoInfo() {
		
	}

	//생성자 기본 호출?
	public VideoInfo(String title, String category, String lend, String lendName, Date lendDate) {
		int id = title.hashCode();
		Video v = new Video(title, category, lend, lendName, lendDate);
		map.put(id,v);
	}
	
	//데이터 전체를 맵에 넣자..?	// 추가
	public void VideoInfoAdd(String title, String category, String lend, String lendName, Date lendDate) {
		String id = title;
		Video v = new Video(title, category, lend, lendName, lendDate);
		map.put(id,v);
	}
	
	//삭제
	public void VideoInfoRmv(String title) {
		String id = title;
		map.remove(id);
	}
	
	//수정
	public void VideoInfoCh(String title, String category, String lend, String lendName, Date lendDate) {
		Video v = new Video(title, category, lend, lendName, lendDate);
		String id = title;
		map.put(id, v);
	}
	
	//리스트 출력
	public void list() {
        Iterator it = map.values().iterator();
        while(it.hasNext()){
            System.out.println(((Video) it.next()).display());
        }
	}
}
