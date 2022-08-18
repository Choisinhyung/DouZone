package ex01.generic;

public class MainEntry {

	public static void main(String[] args) {
		//객체 생성시 타입을 결정한다. 타입의 유연성을 보장한다.
		GenericEx<String> t1 = new GenericEx();
		String[] str = {"abc", "kbs", "dirotor"};
		t1.set(str);
		t1.print();
		System.out.println("\n--------------------");
		
		GenericEx<Integer> t2 = new GenericEx();
		Integer[] num = {1,2,3,4,5,6,7,8};
		t2.set(num);
		t2.print();
		System.out.println("\n--------------------");

		GenericEx<Double> t3 = new GenericEx();
		Double[] dou = {10.5, 15.2, 15.7};
		t3.set(dou);
		t3.print();
		System.out.println("\n--------------------");
	}

}
