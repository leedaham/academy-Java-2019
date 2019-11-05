package sub1;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class UserController implements Initializable{

	@FXML private TextField txtUid;
	@FXML private TextField txtName;
	@FXML private TextField txtHp;
	@FXML private ComboBox<String> cbPos;
	@FXML private ComboBox<String> cbDep;
	@FXML private Button btnRegister;
	
	ObservableList<String> posList = FXCollections.observableArrayList("���", "�븮", "����", "����", "����");
	ObservableList<String> depList = FXCollections.observableArrayList("101", "102", "103", "104", "105");
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		//�޺��ڽ� ������ �߰�
		cbPos.setItems(posList);
		cbDep.setItems(depList);
		
		btnRegister.setOnAction(event -> btnRegisterClick());
		
	}// initialize end
	
	public void btnRegisterClick() {
		//����� �Է� ���� ��������
		String uid = txtUid.getText();
		String name = txtName.getText();
		String hp = txtHp.getText();
		String pos = cbPos.getValue();
		String dep = cbDep.getValue();
		
		//DB information
		String host = "jdbc:mysql://192.168.44.9:3306/ldh";
		String user = "ldh";
		String pass = "1234";
		Connection conn = null;
		
		try {
		//1�ܰ� - JDB ����̺� �ε�
		Class.forName("com.mysql.jdbc.Driver");
		
		//2�ܰ�
		conn = DriverManager.getConnection(host, user, pass);
		
		//3�ܰ�
		String sql = "INSERT INTO `MEMBER` VALUES ( ?, ?, ?, ?, ?, NOW());";
		PreparedStatement psmt = conn.prepareStatement(sql);
		
		psmt.setString(1, uid);
		psmt.setString(2, name);
		psmt.setString(3, hp);
		psmt.setString(4, pos);
		psmt.setString(5, dep);
		
		// 4�ܰ� - SQL ����
		psmt.executeUpdate();
		
		// 5�ܰ� - SELECT ����� ó��
		
		// 6�ܰ� - ������ ���̽� ����
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

		txtUid.setText("");
		txtName.setText("");
		txtHp.setText("");
		//cbPos.
		// cbDep.setItems(depList);
		//����â, ����â �����
		//����̳� ������ �޼��� �����ֱ�
	}
}
