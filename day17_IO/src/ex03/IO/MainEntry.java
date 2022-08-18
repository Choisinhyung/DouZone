package ex03.IO;

import java.io.IOException;
import java.io.InputStream;

public class MainEntry {

	public static void main(String[] args) {
		//io : 입출력
		
		//시스템인의 리턴타입은 인풋 스트림
		InputStream is = System.in; // 표준입력
		
		try {
			
			System.out.println("단일 문자 입력 : ");
			//read는 예외가 발생하기 때문에 예외처리를 해야 한다.
			// 단일이기 때문에 처음 하나의 값만 읽어온다. 
			int num = is.read() - 48; // 예외 발생 '0' ~ '9' : 48 ~ 57 (아스키코드)
			
			//이건 두번 읽은 것
			is.read();		is.read(); // 문제 발생 처리 - 자바에서는 '문자' 2바이트 처리
			
			int num2 = is.read() - 48;
			
			System.out.println(num + num2);
			System.out.println((char)num);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
