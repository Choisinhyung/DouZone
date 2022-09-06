package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MainEntry {

	static Scanner in = new Scanner(System.in);
	static Connection conn;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		while (true) {
			System.out.println("0.전체조회 1.선택조회 2.추가 3.수정 4.삭제");
			switch (in.nextInt()) {
			case 0:
				// 0.전체조회
				selectAll();
				break;
			case 1:
				// 1.조회
				System.out.println("조회하고 싶은 상품번호를 입력하세요.");
				selectByGno(in.nextInt());
				break;
			case 2:
				// 2.추가
				System.out.println("추가하고 싶은 상품번호를 입력하세요.");
				insertByGno(in.nextInt());
				selectAll();
				break;
			case 3:
				// 3.수정
				System.out.println("수정하고 싶은 상품번호를 입력하세요.");
				UpdateByGno(in.nextInt());
				break;
			case 4:
				// 4.삭제
				System.out.println();
				deleteByGno();
				break;
			default:
				System.out.println("프로그램 종료!!");
				System.exit(0);
			}
		}

	}
	public static void connection() throws ClassNotFoundException, SQLException {
		System.out.println("로딩중....");
		Class.forName("oracle.jdbc.OracleDriver"); // exception
		String url = "jdbc:oracle:thin:@kosadb_high?TNS_ADMIN=/Users/meat/Wallet_kosaDB/";
		String uid = "user06";
		String pwd = "xxxxxxAt22cc";
		conn = DriverManager.getConnection(url, uid, pwd);// exception
	}

	// selectAll
	public static void selectAll() throws ClassNotFoundException, SQLException {

		connection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM GIFT");// cmd+shift+x :대문자
		System.out.println("상품번호\t상품명\t최저가\t최고가");
		while (rs.next()) {
			int gno = rs.getInt(1);
			String gname = rs.getString(2);
			int g_s = rs.getInt(3);
			int g_e = rs.getInt(4);

			System.out.println(gno + "\t" + gname + "\t" + g_s + "\t" + g_e);
		} // while end

		rs.close();
		stmt.close();
		conn.close();

	}

	public static void selectByGno(int gno) throws ClassNotFoundException, SQLException {

		connection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM GIFT WHERE GNO=" + gno);

		// 3.사용(DML-Select)
		System.out.println("해당 " + gno + "번 정보는 다음과 같습니다.");
		System.out.println("상품번호\t상품명\t최저가\t최고가");
		while (rs.next()) {
			int gn = rs.getInt(1);
			String gname = rs.getString(2);
			int g_s = rs.getInt(3);
			int g_e = rs.getInt(4);

			System.out.println(gn + "\t" + gname + "\t" + g_s + "\t" + g_e);
		}
		// 4.닫기(자원반환)
		rs.close();
		stmt.close();
		conn.close();
	}

	// insert
	public static void insertByGno(int gno) throws ClassNotFoundException, SQLException {
		connection();

		// 3.사용(DML-Select)
		String sql = "INSERT INTO GIFT VALUES(" + gno + ",?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		System.out.println("상품명 / 최저가 / 최고가 를 입력하세요.");
		pstmt.setString(1, in.next());
		pstmt.setInt(2, in.nextInt());
		pstmt.setInt(3, in.nextInt());
		pstmt.executeUpdate();
		System.out.println("추가 완료!!!");
		// 4.닫기(자원반환)
		pstmt.close();
		conn.close();
	}

	// update
	public static void UpdateByGno(int gno) throws ClassNotFoundException, SQLException {
		connection();

		// 3.사용(DML-Select)
		// UPDATE GIFT SET GNO/GNAME/G_START/G_END=1 WHERE GNO=10;
		System.out.println("수정할 조건을 번호로 입력하세요 : 1번호/2이름/3최저가/4최고가");
		String option ;
		String value;
		switch (in.nextInt()) {
		case 1:
			option = "GNO";
			System.out.println("값은 ? : ");
			value = in.next();
			break;
		case 2:
			option = "GNAME";
			System.out.println("내용 ? : ");
			value = in.next();
			break;
		case 3:
			option = "G_START";
			System.out.println("값은 ? : ");
			value = in.next();
			break;
		case 4:
			option = "G_END";
			System.out.println("값은 ? : ");
			value = in.next();
			break;
		default:
			System.out.println("오입력");
			return;
		}
		String sql = "UPDATE GIFT SET "+option+"="+value + " WHERE gno="+gno;
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.executeUpdate();
		// 4.닫기(자원반환)
		stmt.close();
		conn.close();
	}

	// delete
	public static void deleteByGno() throws SQLException {
		System.out.println("상품번호를 입력해주세요.");
		int gno = in.nextInt();
		Statement stmt = conn.createStatement();
		String sql = "Delete GIFT where gno =" + gno;
		ResultSet rs = stmt.executeQuery(sql);
		System.out.println(gno + "번 삭제");
	}

}