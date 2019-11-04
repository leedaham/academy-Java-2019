package sub1;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			//라벨 추가
			Label label = new Label();
			label.setText("Hello JavaFX!!");
			label.setFont(new Font(30));
			
			//버튼 추가
			Button btn = new Button();
			btn.setText("확인");
			
			//BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("HelloFx.fxml"));
			VBox root = new VBox();
			
			root.getChildren().add(label);
			root.getChildren().add(btn);
			
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
