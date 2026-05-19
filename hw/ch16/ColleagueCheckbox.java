import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ColleagueCheckbox extends Checkbox implements Colleague {
    private Mediator mediator;

    public ColleagueCheckbox(String label, CheckboxGroup group, boolean state) {
        super(label, group, state);
        addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
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