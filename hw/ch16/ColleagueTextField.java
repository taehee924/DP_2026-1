import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class ColleagueTextField extends TextField implements Colleague {
    private Mediator mediator;

    public ColleagueTextField(int columns) {
        super(columns);
        addTextListener(new TextListener() {
            public void textValueChanged(TextEvent e) {
                mediator.colleagueChanged();
            }
        });
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }
}