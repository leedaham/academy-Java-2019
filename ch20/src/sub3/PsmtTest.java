package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/*
��¥ : 2019/10/31
�̸� : �̴���
���� : PrepareStatement �ǽ��ϱ�
 */

public class PsmtTest {
	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		do {

			System.out.println("����� ��� - ���� : 0, ��� : 1");
			System.out.print("�Է� : ");
			int result = sc.nextInt();

			if(result==0) {
				break;
			}

			System.out.print("���̵� �Է� : ");
			String uid = sc.next();
			
			System.out.print("�̸� �Է� : ");
			String name = sc.next();
			
			System.out.print("��ȭ��ȣ �Է� : ");
			String hp = sc.next();
			
			System.out.print("���� �Է� : ");
			int age = sc.nextInt();
			
			insert(uid, name, hp, age);
			
		}while(true);
		System.out.println("�����߽��ϴ�.");
		
		
		
	}
	
	public static void insert(String uid, String name, String hp, int age) throws Exception {
		// DB information
		String host = "jdbc:mysql://192.168.44.9:3306/ldh";
		String user = "ldh";
		String pass = "1234";

		// 1�ܰ� - JDBC ����̹� �ε�
		Class.forName("com.mysql.jdbc.Driver");

		// 2�ܰ� - �����ͺ��̽� ����
		Connection conn = DriverManager.getConnection(host, user, pass);

		// 3�ܰ� - SQL ���ఴü ���� (PrepareStatement)
		String sql = "INSERT INTO `USER2` VALUES ( ?, ?, ?, ?);";
		PreparedStatement psmt = conn.prepareStatement(sql);
		psmt.setString	(1, uid);
		psmt.setString	(2, name);
		psmt.setString	(3, hp);
		psmt.setInt		(4, age);

		// 4�ܰ� - SQL ����
		psmt.executeUpdate();

		// 5�ܰ� - SELECT ����� ó��

		// 6�ܰ� - ������ ���̽� ����
		conn.close();
		psmt.close();
		
		System.out.println("INSERT COMPLETE...");
	}
	
	
	
	
}
