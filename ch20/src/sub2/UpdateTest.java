package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
��¥ : 2019/10/31
�̸� : �̴���
���� : UPDATE �ǽ��ϱ�
 */

public class UpdateTest {
	public static void main(String[] args) throws Exception{
		
		// DB information
		String host = "jdbc:mysql://192.168.44.9:3306/ldh";
		String user = "ldh";
		String pass = "1234";
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection(host, user, pass);
		
		Statement stmt = conn.createStatement();
		
		String sql = "UPDATE `USER2` SET `hp` = '010-6666-1234' ";
			   sql += "WHERE `uid`='B101';";
			   
		stmt.executeUpdate(sql);
		
		conn.close();
		
		System.out.println("UPDATE COMPLETE...");
	}
}
