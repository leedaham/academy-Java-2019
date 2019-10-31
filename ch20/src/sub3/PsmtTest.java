package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/*
날짜 : 2019/10/31
이름 : 이다함
내용 : PrepareStatement 실습하기
 */

public class PsmtTest {
	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		do {

			System.out.println("사용자 등록 - 종료 : 0, 등록 : 1");
			System.out.print("입력 : ");
			int result = sc.nextInt();

			if(result==0) {
				break;
			}

			System.out.print("아이디 입력 : ");
			String uid = sc.next();
			
			System.out.print("이름 입력 : ");
			String name = sc.next();
			
			System.out.print("전화번호 입력 : ");
			String hp = sc.next();
			
			System.out.print("나이 입력 : ");
			int age = sc.nextInt();
			
			insert(uid, name, hp, age);
			
		}while(true);
		System.out.println("종료했습니다.");
		
		
		
	}
	
	public static void insert(String uid, String name, String hp, int age) throws Exception {
		// DB information
		String host = "jdbc:mysql://192.168.44.9:3306/ldh";
		String user = "ldh";
		String pass = "1234";

		// 1단계 - JDBC 드라이버 로드
		Class.forName("com.mysql.jdbc.Driver");

		// 2단계 - 데이터베이스 접속
		Connection conn = DriverManager.getConnection(host, user, pass);

		// 3단계 - SQL 실행객체 생성 (PrepareStatement)
		String sql = "INSERT INTO `USER2` VALUES ( ?, ?, ?, ?);";
		PreparedStatement psmt = conn.prepareStatement(sql);
		psmt.setString	(1, uid);
		psmt.setString	(2, name);
		psmt.setString	(3, hp);
		psmt.setInt		(4, age);

		// 4단계 - SQL 실행
		psmt.executeUpdate();

		// 5단계 - SELECT 결과셋 처리

		// 6단계 - 데이터 베이스 종료
		conn.close();
		psmt.close();
		
		System.out.println("INSERT COMPLETE...");
	}
	
	
	
	
}
