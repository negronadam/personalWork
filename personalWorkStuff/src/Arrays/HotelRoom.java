package Arrays;

import java.util.Scanner;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class HotelRoom {
	/*The character legend for type is as included:
	 * s = single
	 * d = double
	 *
	 */
	private double cost;
	private char type;
	private int number;
	private boolean isReserved;
	public HotelRoom(double cost, char type, int number, boolean isReserved)
	{
		this.cost = cost;
		this.type = type;
		this.number = number;
		this.isReserved = isReserved;
	}
	
	public double getCost()
	{
		return cost;
	}
	
	public char getType()
	{
		return type;
	}
	
	public int getRoomNum()
	{
		return number;
	}
	
	public boolean getReservedStatus()
	{
		return isReserved;
	}
	
	public void setRoomTaken()
	{
		isReserved = true;
	}
	
	public void setRoomVacant()
	{
		isReserved = false;
	}
	
	public void changePrice(int newCost)
	{
		cost = newCost;
	}
	
	public void changeType(char newType)
	{
		type = newType;
	}
}
