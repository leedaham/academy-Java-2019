package sub1;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LayerController implements Initializable{

	@FXML private Button btnLogin;
	@FXML private Button btnCancel;
	@FXML private TextField txtUid;
	@FXML private TextField txtPass;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {

		//직접 이벤트 핸들러 구현
		btnLogin.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
		
				String uid = txtUid.getText();
				String pass = txtPass.getText();
				if(uid.equals("hong") && pass.equals("1234")) {
					System.out.println(uid+"님 반갑습니다.");
				}else {
					System.out.println("로그인 실패...");
				}
			}
		});
		
		//람다식을 이용한 이벤트 핸들러 구현
		btnCancel.setOnAction(event->btnCancelClick());
		
	}// initialize end
	
	public void btnCancelClick() {
		System.out.println("취소 버튼 클릭!!!");
	}
	
}
