package view;

import javafx.event.Event;

import javafx.event.EventHandler;
import javafx.scene.control.Label;
import controller.Percentage_Controller;
import event.ValueChangedEvent;
import event.ValueListener;


/**
 * A MVC View of a Percentage as a label.
 * This is not a MVC Controller, so it does not allow to change the Percentage value
 * This class implements ValueListener, to be informed of changes in the Percentage
 */

// // TODO 1 : Make the class implement the right interface for the class PercentageLabel
public class PercentageLabel extends Label implements TODO {

	private static final long serialVersionUID = 1L;

	private final Percentage_Controller myController;

	public PercentageLabel(Percentage_Controller controller) {
		myController = controller;
	}

	// TODO 2 : Implement the method from the interface
}
