package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
��¥ : 2019/10/31
�̸� : �̴���
���� : SELECT �ǽ��ϱ�
 */

public class SelectTest {
	public static void main(String[] args) throws Exception {
		// DB information
		String host = "jdbc:mysql://192.168.44.9:3306/ldh";
		String user = "ldh";
		String pass = "1234";
		

		// 1�ܰ� - JDBC ����̹� �ε�
		Class.forName("com.mysql.jdbc.Driver");
		
		
		// 2�ܰ� - �����ͺ��̽� ����
		Connection conn = DriverManager.getConnection(host, user, pass);
		
		// 3�ܰ� - SQL ���ఴü ����
		Statement stmt = conn.createStatement();
		
		// 4�ܰ� - SQL ����
		String	sql = "SELECT * FROM `USER2`;";

		ResultSet rs = stmt.executeQuery(sql);
		
		// 5�ܰ� - SELECT ����� ó��
		
		while(rs.next()){
			System.out.println("==========================");
			System.out.println("���̵�	: "+rs.getString(1));
			System.out.println("�̸�		: "+rs.getString(2));
			System.out.println("��ȭ��ȣ	: "+rs.getString(3));
			System.out.println("����		: "+rs.getString(4));
			System.out.println("--------------------------");
			
		}
		
		// 6�ܰ� - ������ ���̽� ����
		conn.close();
		rs.close();
		stmt.close();
		System.out.println("SELECT COMPLETE...");
	}
}

