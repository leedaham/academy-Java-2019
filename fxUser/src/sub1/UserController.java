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
	
	ObservableList<String> posList = FXCollections.observableArrayList("사원", "대리", "과장", "차장", "부장");
	ObservableList<String> depList = FXCollections.observableArrayList("101", "102", "103", "104", "105");
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		//콤보박스 데이터 추가
		cbPos.setItems(posList);
		cbDep.setItems(depList);
		
		btnRegister.setOnAction(event -> btnRegisterClick());
		
	}// initialize end
	
	public void btnRegisterClick() {
		//사용자 입력 정보 가져오기
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
		//1단계 - JDB 드라이브 로드
		Class.forName("com.mysql.jdbc.Driver");
		
		//2단계
		conn = DriverManager.getConnection(host, user, pass);
		
		//3단계
		String sql = "INSERT INTO `MEMBER` VALUES ( ?, ?, ?, ?, ?, NOW());";
		PreparedStatement psmt = conn.prepareStatement(sql);
		
		psmt.setString(1, uid);
		psmt.setString(2, name);
		psmt.setString(3, hp);
		psmt.setString(4, pos);
		psmt.setString(5, dep);
		
		// 4단계 - SQL 실행
		psmt.executeUpdate();
		
		// 5단계 - SELECT 결과셋 처리
		
		// 6단계 - 데이터 베이스 종료
		
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
		//수정창, 삭제창 만들기
		//등록이나 삭제후 메세지 보여주기
	}
}
