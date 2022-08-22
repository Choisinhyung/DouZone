package ex07.innerClass;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InnerMain { // outer class


	public static void main(String[] args) {
		Frame frame = new Frame("이벤트 처리 - innerClass"); // 프레임 (UI구현)
		Button btn = new Button("Button = Start");
		
		// 1.
//		EventHandler handler = new InnerMain().new EventHandler(); // innerMain에있는 이벤트 객체 생성
//		btn.addActionListener(handler); // 버튼에 액션이벤트(클릭하는 기능) 추가
		
		btn.addActionListener(new ActionListener() { // 익명(무명) 클래스
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("이벤트 발생~");
				System.out.println(e.getActionCommand()); // 발생한 액션 이벤트를 출력해라
				System.out.println(e.getSource()); // 버튼의 정보 (좌표점, 너비높이 ... )
				System.out.println();
			}
		});
		
		// 프레임에 이벤트를 붙이자
		frame.addWindowListener(new WindowAdapter() { // 익명 클래스

			@Override
			public void windowClosing(WindowEvent e) { // 닫기 이벤트
				System.exit(0);
			}
		
		});
		frame.add(btn); // 프레임에 버튼 컴포넌트를 추가
		frame.setVisible(true); // 프레임 인스턴스 생성, 화면 보여주기
		frame.setSize(300, 200); // 프레임 크기 설정(너비, 높이)
		frame.setLocation(300, 150); // 보여질 프레임의 위치 지정 (default 0,0)

	}

}

/*public class InnerMain { // outer class

	class EventHandler implements ActionListener { // inner Class

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("ActionEvent가 발생했습니다. ");
			
		}
		
	}

	public static void main(String[] args) {
		Frame frame = new Frame("이벤트 처리 - innerClass"); // 프레임 (UI구현)
		Button btn = new Button("Button = Start");
		
		// 1.
		EventHandler handler = new InnerMain().new EventHandler(); // innerMain에있는 이벤트 객체 생성
		btn.addActionListener(handler); // 버튼에 액션이벤트(클릭하는 기능) 추가
		
		frame.add(btn); // 프레임에 버튼 컴포넌트를 추가
		frame.setVisible(true); // 프레임 인스턴스 생성, 화면 보여주기
		frame.setSize(300, 200); // 프레임 크기 설정(너비, 높이)
		frame.setLocation(300, 150); // 보여질 프레임의 위치 지정 (default 0,0)

	}

}*/
