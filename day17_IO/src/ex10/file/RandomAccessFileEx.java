package ex10.file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {

	public static void main(String[] args) throws IOException {
		
		RandomAccessFile raf = new RandomAccessFile("sanpme.txt", "rw");
//		RandomAccessFile raf = new RandomAccessFile("\\user\\user", "rw");
		
		//기존에 파일이 있으면 추가하고 없으면 생성
		
		for(int i = 0; i <= 10; i++) {
			//100씩 건너뛰면서 값 쓰기    
			raf.seek(i * 100); // 예외발생
//			String str = "hello";
			raf.writeInt(i);
//			raf.writeUTF(str);
		}	
		
		for(int i = 0; i <= 10; i++) {
			raf.seek(i * 100); // 예외발생
			System.out.println(raf.readInt());
		}	
		
		System.out.println("success!!");
		raf.close();
	}

}
