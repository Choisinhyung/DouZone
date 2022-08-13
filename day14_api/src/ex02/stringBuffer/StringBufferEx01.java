package ex02.stringBuffer;

public class StringBufferEx01 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(); // 초기 용량 16
		
		System.out.println("length      /	  capacity");
		int len = sb.length();		int size = sb.capacity();
		System.out.println(len + "          /            " + size);
		System.out.println("---------------------------------");
		
		sb.append("kosa");
		len = sb.length();		size = sb.capacity();
		System.out.println(len + "         /             " + size);
		System.out.println("---------------------------------");
		
		sb.append("121343245355 4958340do");
		len = sb.length();		size = sb.capacity();
		System.out.println(len + "       /             " + size);
		System.out.println("---------------------------------");

	}

}
