package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
날짜 : 2019/10/31
이름 : 이다함
내용 : DELETE 실습하기
 */

public class DeleteTest {
	public static void main(String[] args){
		// DB information
		String host = "jdbc:mysql://192.168.44.9:3306/ldh";
		String user = "ldh";
		String pass = "1234";
		
		try {
			// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.jdbc.Driver");
			
			
			// 2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 3단계 - SQL 실행객체 생성
			Statement stmt = conn.createStatement();
			
			// 4단계 - SQL 실행
			String	sql = "DELETE FROM `USER2` WHERE `uid`='B101';";
			stmt.executeUpdate(sql);
			
			// 5단계 - SELECT 결과셋 처리
			// 6단계 - 데이터 베이스 종료
			conn.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("DELETE COMPLETE...");
	}
}
