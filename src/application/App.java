package application;

import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import controller.Percentage_Controller;
import model.Percentage_Model;
import view.ConsoleView;
import view.PercentageLabel;
import view.PercentagePieChart;
import view.PercentageSlider;



public class App extends VBox {



	private static final long serialVersionUID = 1L;

	// The "Model" of a Percentage
	Percentage_Model myModel;
	// The "Controller" of a Percentage
	Percentage_Controller myController;

	// A Views
	PercentageLabel myTextView;
	PercentagePieChart myPieViewAndController;
	PercentageSlider mySliderViewAndController;
	ConsoleView myConsoleView;

	/** Construct the application */
	public App() {

		// Create the model and its controller
		myModel = new Percentage_Model(0.33f);
		myController = new Percentage_Controller(myModel);

		// Create the views
		myTextView = new PercentageLabel(myController);
		// TODO 3 : Create other views

		
		// Connect the views to the controller
		myController.addListenerValue(myTextView);
		// TODO 3 : Connect other views
		

		// Initialize the GUI
		initUI();

		// Resize window and make it visible
		setVisible(true);
	}


	private void initUI() {
		Label label1 = new Label("Percentage:");
		myTextView.setDisable(true);
		HBox northPanel = new HBox();
		northPanel.getChildren().addAll(label1,myTextView);
		this.setSpacing(30);
		this.getChildren().addAll(northPanel,myPieViewAndController,mySliderViewAndController); 
	}



}
