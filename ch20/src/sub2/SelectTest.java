package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
날짜 : 2019/10/31
이름 : 이다함
내용 : SELECT 실습하기
 */

public class SelectTest {
	public static void main(String[] args) throws Exception {
		// DB information
		String host = "jdbc:mysql://192.168.44.9:3306/ldh";
		String user = "ldh";
		String pass = "1234";
		

		// 1단계 - JDBC 드라이버 로드
		Class.forName("com.mysql.jdbc.Driver");
		
		
		// 2단계 - 데이터베이스 접속
		Connection conn = DriverManager.getConnection(host, user, pass);
		
		// 3단계 - SQL 실행객체 생성
		Statement stmt = conn.createStatement();
		
		// 4단계 - SQL 실행
		String	sql = "SELECT * FROM `USER2`;";

		ResultSet rs = stmt.executeQuery(sql);
		
		// 5단계 - SELECT 결과셋 처리
		
		while(rs.next()){
			System.out.println("==========================");
			System.out.println("아이디	: "+rs.getString(1));
			System.out.println("이름		: "+rs.getString(2));
			System.out.println("전화번호	: "+rs.getString(3));
			System.out.println("나이		: "+rs.getString(4));
			System.out.println("--------------------------");
			
		}
		
		// 6단계 - 데이터 베이스 종료
		conn.close();
		rs.close();
		stmt.close();
		System.out.println("SELECT COMPLETE...");
	}
}

