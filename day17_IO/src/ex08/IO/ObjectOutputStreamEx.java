package ex08.IO;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectOutputStreamEx {

	public static void main(String[] args) throws Exception { 
		Grade vo = new Grade();
		vo.setSubject("미술");
		vo.setScore(80);
		vo.setSubject("전산");
		vo.setScore(95);
		
		System.out.println(vo);
		//파일에 저장
		OutputStream os = new FileOutputStream("grade.dat");
		ObjectOutputStream oos = new ObjectOutputStream(os);
		
		oos.writeObject(vo);
		oos.close();
		
	}

}
