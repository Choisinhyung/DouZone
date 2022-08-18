package ex03.IO;

import java.io.IOException;

public class KeyInput {

	public static void main(String[] args) throws IOException { // 예외처리 위임
		int su1 = 0, su2 = 0;
		
		System.out.println("데이터 입력 끝은 Ctrl + Z를 누르세요. ");
		
		// 원래 더 이상 읽어올 값이 없으면 -1을 리턴한다. 
		while( (su1 = System.in.read()) != -1 ) { //예외처리 해야함
			System.out.print(su1 + "\t");
		}
		System.out.println(su1);
	}

}