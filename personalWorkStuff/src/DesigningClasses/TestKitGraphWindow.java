package DesigningClasses;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TestKitGraphWindow {
	private static Stage window;
	private static Scene scene1;
	private static Label title;
	public TestKitGraphWindow() {
		
	}
	
	public static void create() {
		window = new Stage();
		window.setTitle("Test Kit Plot Graph v0.0.1a");
		window.setMinWidth(250);
		title = new Label("This is a test window.");
		VBox vBox = new VBox();
		scene1 = new Scene(vBox, 1280, 720);
		window.setScene(scene1);
		window.show();
	}
}
