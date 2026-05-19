import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColleagueButton extends Button implements Colleague {
    private Mediator mediator;

    public ColleagueButton(String label) {
        super(label);
        addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
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