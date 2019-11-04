package sub1;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalcController implements Initializable{

	@FXML private Button btn0;
	@FXML private Button btn1;
	@FXML private Button btn2;
	@FXML private Button btn3;
	@FXML private Button btn4;
	@FXML private Button btn5;
	@FXML private Button btn6;
	@FXML private Button btn7;
	@FXML private Button btn8;
	@FXML private Button btn9;
	@FXML private Button btnPlus;
	@FXML private Button btnMinus;
	@FXML private Button btnMulti;
	@FXML private Button btnDiv;
	@FXML private Button btnEq;
	@FXML private Button btnCancel;
	@FXML private TextField txtDisp;
	
	int temp1 = 0;
	int temp2 = 0;
	int operator = 0;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		btn0.setOnAction(event -> btn0Click());
		btn1.setOnAction(event -> btn1Click());
		btn2.setOnAction(event -> btn2Click());
		btn3.setOnAction(event -> btn3Click());
		btn4.setOnAction(event -> btn4Click());
		btn5.setOnAction(event -> btn5Click());
		btn6.setOnAction(event -> btn6Click());
		btn7.setOnAction(event -> btn7Click());
		btn8.setOnAction(event -> btn8Click());
		btn9.setOnAction(event -> btn8Click());
		btnPlus.setOnAction(event -> btnPlusClick());
		btnMinus.setOnAction(event -> btnMinusClick());
		btnMulti.setOnAction(event -> btnMultiClick());
		btnDiv.setOnAction(event -> btnDivClick());
		btnEq.setOnAction(event -> btnEqClick());
		btnCancel.setOnAction(event -> btnCancelClick());
		
	} //Initialize end
	
	public void btn0Click () {}
	public void btn1Click () {
		temp1 = 1;
		txtDisp.setText("1");
	}
	public void btn2Click () {
		temp2 = 2;
		txtDisp.setText("2");
	}
	public void btn3Click () {}
	public void btn4Click () {}
	public void btn5Click () {}
	public void btn6Click () {}
	public void btn7Click () {}
	public void btn8Click () {}
	
	public void btnPlusClick () {
		operator = 1;
	}
	public void btnMinusClick () {
		operator = 2;
	}
	public void btnMultiClick () {
		operator = 3;
	}
	public void btnDivClick () {
		operator = 4;
	}
	
	public void btnEqClick () {
		int result = 0;
		if(operator == 1) {
			result = temp1 + temp2;
		}else if(operator == 2) {
			result = temp1 - temp2;
		}else if(operator == 3) {
			result = temp1 * temp2;
		}else if(operator == 4) {
			result = temp1 / temp2;
		}
		txtDisp.setText(""+result);
	}
	public void btnCancelClick () {}
	
	
}
