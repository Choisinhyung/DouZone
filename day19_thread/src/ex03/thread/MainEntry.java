package ex03.thread;

public class MainEntry {

	public static void main(String[] args) {
		//currentThread() : 현재 실행중인 프로그램의 이름
		
		long id = Thread.currentThread().getId();
		
		String name = Thread.currentThread().getName();
		
		//우선순위 : default를 바꾸려면 상태값을 setting하면 됨 (세팅 최고는 10 / 기본은 5)
		// 숫자가 클수록 우선순위가 높다. 
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		
		int priority = Thread.currentThread().getPriority();
		
		//상태값 꺼내기
		Thread.State state = Thread.currentThread().getState();
		
		System.out.println("현재 스레드 ID : " + id);
		System.out.println("현재 스레드 Name : " + name);
		System.out.println("현재 스레드 State : " + state);
		System.out.println("현재 스레드 Priority : " + priority);

	}

}
