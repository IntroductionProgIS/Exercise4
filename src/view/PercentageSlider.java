package view;

import javafx.beans.value.ObservableValue;
import javafx.event.Event;
import javafx.scene.control.Slider;
import controller.Controller_Interface;
import controller.Percentage_Controller;
import event.ValueChangedEvent;
import event.ValueListener;

/**
 * A PercentagePieSlider acts boths as a MVC View and Controller of a Percentage
 * It maintains a reference to its model in order to update it.
 */
// TODO 1 : Make the class implement the right interface for the class PercentageSlider
public class PercentageSlider extends Slider implements TODO {

	private static final long serialVersionUID = 1L;
	
	private final Percentage_Controller myController;

	public PercentageSlider(Percentage_Controller controller) {
		myController = controller;
		setMin(0);
		setMax(100);

		this.setMinorTickCount(5);
		this.setMajorTickUnit(10);
		this.setShowTickLabels(true);
		this.setShowTickMarks(true);
		this.setBlockIncrement(10);
		this.setSnapToTicks(true);

		// "Controller" behaviour : when the value of the slider changes,
		// The model must be updated
		valueProperty().addListener(new javafx.beans.value.ChangeListener<Number>() {
            @Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				//Do something with the controller                
			}
		});
	}

	
	// TODO 2 : Implement the methods from the interface


	//getter of the controller
    public Controller_Interface getController() {
        return controller;
    }
}
