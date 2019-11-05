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
	boolean isFirst = true;
	
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
		btn9.setOnAction(event -> btn9Click());
		btnPlus.setOnAction(event -> btnPlusClick());
		btnMinus.setOnAction(event -> btnMinusClick());
		btnMulti.setOnAction(event -> btnMultiClick());
		btnDiv.setOnAction(event -> btnDivClick());
		btnEq.setOnAction(event -> btnEqClick());
		btnCancel.setOnAction(event -> btnCancelClick());
		
	} //Initialize end
	
	public void setOperation(int type) {
		
		operator = type;
		String getNum = txtDisp.getText();
		temp1 = Integer.parseInt(getNum);
		isFirst = true;
		
	}
	public void setNum(int num) {
		if(isFirst) {
			
			txtDisp.setText(""+num);
			
			isFirst = false;
		}else {
			String getNum = txtDisp.getText();
			String totNum = getNum + num;
			
			int cNum =  Integer.parseInt(totNum);
			
			txtDisp.setText(""+cNum);
		}
	}
	
	public void btn0Click () {setNum(0);}
	public void btn1Click () {setNum(1);}
	public void btn2Click () {setNum(2);}
	public void btn3Click () {setNum(3);}
	public void btn4Click () {setNum(4);}
	public void btn5Click () {setNum(5);}
	public void btn6Click () {setNum(6);}
	public void btn7Click () {setNum(7);}
	public void btn8Click () {setNum(8);}
	public void btn9Click () {setNum(9);}
	
	public void btnPlusClick	() {setOperation(1);}
	public void btnMinusClick	() {setOperation(2);}
	public void btnMultiClick	() {setOperation(3);}
	public void btnDivClick		() {setOperation(4);}
	
	public void btnEqClick () {
		
		String getNum = txtDisp.getText();
		temp2 = Integer.parseInt(getNum);
		
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
	public void btnCancelClick () {
		temp1 = 0;
		temp2 = 0;
		operator = 0;
		
		txtDisp.setText("0");
	}
}
