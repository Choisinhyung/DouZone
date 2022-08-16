package ex03.collection.map;
import java.util.*;
class TreeMapEx1 {
	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		tm.put("aa",1000);
		tm.put("bb",1000);
		tm.put("cc",1000);
		tm.put("dd",1000);
		System.out.println("name : "+tm.get("aa"));
		System.out.println(tm);
	}
}
