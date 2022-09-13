import java.text.SimpleDateFormat;
import java.util.Date;

public class asd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// long ss = ((System.currentTimeMillis()) / 1000000000) / 60;
		// System.out.println(ss);

		String curTime = new SimpleDateFormat("HH시간 mm분 ss초").format(new Date());
		System.out.println(curTime);

		// 오라클.......dual sysdate

//		while (true) {
//
//			// 오라클에서 sysdate 받아와서 사용
//			// 밀리 세컨
//
//			long start = ((System.currentTimeMillis()) / 1000) * 2;
//
////			try {
////				Thread.sleep(1000);
////			} catch (Exception e) {
////				e.printStackTrace();
////			}
//
//			long end = (System.currentTimeMillis()) / 1000;
//			System.out.println("시간 : " + (end - start));
//
//		}
	}

}
