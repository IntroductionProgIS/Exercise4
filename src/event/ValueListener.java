package event;

import javafx.event.Event;
import event.ValueChangedEvent;

import java.util.EventListener;


//Interface of a Listener of the value
public interface ValueListener extends EventListener {
        public void valueChanged(ValueChangedEvent event);
}
