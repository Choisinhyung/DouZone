package ex06.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BinaryCopy { //낱개로 copy

	public static void main(String[] args) {
		
		//복사할 대상
		File src = new File("C:\\Windows\\explorer.exe");
		//복사해서 저장할 파일
		File dist = new File("C:\\Users\\user\\explorerCopy.dat");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		int c;
		
		try {
			fis = new FileInputStream(src); // 파일입력바이트 스트림 연결
			fos = new FileOutputStream(dist); //파일출력바이트 스트림 연결
			bis = new BufferedInputStream(fis); //버퍼입력스트림 연결
			bos = new BufferedOutputStream(fos); //버퍼출력스트림 연결
			
			//읽어들인 것을 어떤 타입으로 저장, -1이 아닐동안 계속 읽기
			while ((c = bis.read()) != -1 ) {
				bos.write((char)c);
			} //while end
			
			System.out.println("파일 복사 성공!");
			
			//사용했으니까 닫자~~
			bis.close();
			bos.close();
			fis.close();
			fos.close();
			
		} catch (Exception e) {
			System.out.println("파일 복사 오류 발생ㅠ");
//			e.printStackTrace();
		}

	}

}
