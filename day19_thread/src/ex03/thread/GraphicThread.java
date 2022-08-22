package ex03.thread;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;
import javax.swing.JFrame;

public class GraphicThread extends JFrame implements Runnable {
								// Frame : window
	int num, x, y;
	Color color;
	Random random;
	
	public GraphicThread(int num) { // 생성자함수 - 초기화
		this.num = num;
		color = Color.DARK_GRAY;
		random = new Random();
		setSize(500,400); // 프레임(화면) - 너비, 높이 지정
		setVisible(true); // 화면 보여주기
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기
	}
	
	@Override
	public void paint(Graphics g) { // 그림을 그릴 때는 paint가 반드시 필요
		g.setColor(color);
//		g.fillRect(x, y, 10, 10);
		g.fillOval(x, y, 10, 10);
	}

	@Override
	public void run() { // 스레드 실행부(구현부)
		Rectangle rect = getBounds();
		for (int i = 0; i < num; i++) {
			x = random.nextInt(rect.width);
			y = random.nextInt(rect.height);
			
			//그려진 것을 삭제하지말고 계속 그려라 -> 누적
			repaint();
			
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} // end for
		
	}  // end run()
	
	public static void main(String[] args) {
		// - 객체 생성 -
		
		// 1. 자기자신
//		GraphicThread gt = new GraphicThread(100); // 100개만 그려라
		
		// 2. 부모
//		GraphicThread gt = new GraphicThread(1000);
//		Thread t1 = new Thread(gt);
//		t1.start();
		
		// 3. Thread
		new Thread(new GraphicThread(200)).start();
		
	}
	
}
