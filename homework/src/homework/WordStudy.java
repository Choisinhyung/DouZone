package homework;

import java.util.Arrays;
import java.util.Scanner;

public class WordStudy {

	public static void main(String[] args) {
		//대소문자로 된 단어가 주어지면 가장 많이 사용된 알파벳이 무엇인지 알아내자
		//단 대,소문자 구문하지 않음
		// 가장 많이 사용된 알파벳이 여러 개 존재하는 경우 ? 를 출력한다.
		Scanner sc = new Scanner(System.in);
		
		//입력을 받아서 대문자로 변환
	    String str = sc.nextLine().toUpperCase();
	    // 알파벳 아스키코드로 저장할 배열 생성
	    int cnt[] = new int[26];
	    int max = 0; // 많은 값 찾을 때 사용할 변수
	    char result = ' '; // 결과값
	    int index = 0; // 인덱스값 지정할 때 사용할 변수

	    for(int i = 0; i < str.length(); i++) {
	    	//입력받은 문자열길이만큼 반복해서 i번째에 있는 값 - 65("A")를 저장
	    	//모두 대문자로 변환했으니까 65를 기준으로 계산
	    	// -65를 해야지 해당인덱스에 1이 저장된다 => 반복
	        index = str.charAt(i) - 65;
	        //확인용출력
//	        System.out.println(index);
	        //해당 인덱스 값에 ++
	        cnt[index]++;
	        //확인용출력
//	        System.out.println(Arrays.toString(cnt));
	        	
	        if(max < cnt[index]) {
	        	//만약에 cnt의 아까 -65한 값과 동일한 인덱스가 max보다 크면
	            max = cnt[index]; // max에 값을 저장
	            result = str.charAt(i); // 많은 값이 한개면 결과출력
	        } else if(max == cnt[index]) // 많은 값이 동일한게 있다면
	        	result = '?'; // ? 출력
	    }
	    
	    System.out.println(result);
	}

}
