package ex06.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {

	public static void main(String[] args) throws Exception { // 예외 위임
		//읽기 객체 - FileInputStream
		InputStream is = new FileInputStream("C:\\Users\\user\\Desktop\\코코.jpg"); // 상대경로
		//쓰기 객체 - FileOutputStream
		OutputStream os = new FileOutputStream("C:\\Users\\user\\Desktop\\copy.jpg");
		
		long start = System.currentTimeMillis(); // 시작 시간 저장
		
		//작업 while
		while(true) {
			int inputData = is.read();
			if(inputData == -1) break;
			os.write(inputData);
		} // end while
		
		long end = System.currentTimeMillis(); // 끝난 시간 저장
		
		System.out.println(end - start); // 작업 걸린 시간 출력
		
		
		is.close();
		os.close();
		System.out.println("Copy Success!");
	} 

}
