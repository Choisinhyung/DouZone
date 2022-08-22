package ex06.Synchronized;

class Atm {
	private int money;
	
	public Atm(int money) {
		this.money = money;
	}
	
	//입금함수 
	public synchronized void deposit(int amount, String name) {
		money += amount;
		System.out.println(name + " : 입금금액 " + amount);
	}
	
	//출금함수
	public synchronized void withraw(int amount, String name) {
		synchronized(this) {
			if(money - amount > 0) {
				
				Thread.yield(); // ? 이게뭐야 놓침ㅠ
				
				money -= amount;
				System.out.println(name + " : 출금금액 " + amount);
			} else {
				System.out.println(name + " : 잔액이 부족하여 출금을 할 수 없습니다.");			
			} // end if
		} // end synchronized
	}
	
	//통장 잔고 함수
	public void getMoney() {
		System.out.println("           잔액은 : " + money);
	}
	
} // end Atm

class UserAtm extends Thread { // 통장 개설
	Atm obj;
	boolean flag = false;
	
	public UserAtm(Atm obj, String name) {
		super(name); // super는 스레드
		this.obj = obj;
	}
	
	@Override
	public void run() { // 스레드 작업을 해주는 실제 실행부(구현부)
		for (int i = 0; i < 2; i++) { // 입력, 출력 총 2번 돌림
			// 0.05초마다~
			try { sleep(50); } catch (Exception e) { e.printStackTrace(); }
			
			if(flag) {
				obj.deposit((int)(Math.random() * 10 + 2) * 100, getName());
				obj.getMoney();
			} else {
				obj.withraw((int)(Math.random() * 10 + 2) * 100, getName());
				obj.getMoney();
			} // end if
			
			flag = true;
			
		} // end for
		
	} // end run()
	
} // end UserAtm

public class MainEntry {

	public static void main(String[] args) {
		Atm at = new Atm(1000);
		UserAtm user1 = new UserAtm(at, "시녕");
		UserAtm user2 = new UserAtm(at, "시녀엉");
		UserAtm user3 = new UserAtm(at, "시녀어엉");
		
		user1.start();
		user2.start();
		user3.start();

	}

}
