package ex07.IO;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class DataOutputStreamEx {

	public static void main(String[] args) throws Exception { // 예외처리 위임
		
		File file = new File("text.txt");
		FileOutputStream fos = new FileOutputStream(file);
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeBoolean(true);
		dos.writeChar(65); // A
		dos.writeShort(100);
		dos.writeInt(5000);
		dos.writeLong(88880000);
		dos.writeFloat(12.34f);
		dos.writeDouble(8.8);
		dos.flush(); // 버퍼를 비워주는 역할
		
		System.out.println("text.txt 파일에 " + dos.size() + " byte save");
		dos.close();
		
		
		

	}

}
