package ex01.collection.set;

import java.util.HashSet;
import java.util.Set;

class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]\n";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode() + age;
	}

	@Override
	public boolean equals(Object obj) {
		
		if( obj instanceof Person) {
			Person temp = (Person)obj;
			return name.equals(temp.name) && age == temp.age;
			
		}
		return false;
	}
	
	
}

public class HashSetEx3 {

	public static void main(String[] args) {
//		A a = new A();
//		B b = new B();
//		A bb = new B();
//		
//		// 객체가 만들어질 수 있는지 t/f로 반환
//		System.out.println( b instanceof A);
//		System.out.println( b instanceof B);
//		System.out.println( a instanceof A);
//		System.out.println( a instanceof B);
		
		Set set = new HashSet();
		Person ps = new Person("aaa", 55);
		set.add(ps);
		set.add(new String("Happy"));
		set.add(new String("Happy"));
		set.add(new String("virus"));
		set.add(new Person("David", 10));
		set.add(new Person("David", 33));
		set.add(new Person("David", 10));
		set.add(new Person("Sinhyung", 10));
		
		System.out.print(set);

	}

}

//class A {
//	
//}
//
//class B extends A {
//	
//}
