package ex09.Abstract;

public class Subway extends Trans{

	@Override
	public void start(String name) {
		System.out.println(name + "이 출발합니다. ");
		
	}

	@Override
	public void stop(String name) {
		System.out.println(name + "이 멈춥니다. ");
		
	}
	
}
