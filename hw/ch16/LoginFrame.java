import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.CheckboxGroup;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class LoginFrame extends Frame implements Mediator {
    private ColleagueCheckbox checkGuest;
    private ColleagueCheckbox checkLogin;
    private ColleagueLabel labelUserName;
    private ColleagueTextField textUserName;
    private ColleagueLabel labelPassword;
    private ColleagueTextField textPassword;
    private ColleagueButton buttonOk;
    private ColleagueButton buttonCancel;
    private ColleagueLabel statusLabel;

    public LoginFrame(String title) {
        super(title);
        setBackground(Color.lightGray);
        createColleagues();
        pack();
        show();
    }

    public void createColleagues() {
        setLayout(new GridLayout(5, 2));
        
        // Guest / Login Selection
        checkGuest = new ColleagueCheckbox("Guest", new CheckboxGroup(), true);
        checkLogin = new ColleagueCheckbox("Login", checkGuest.getCheckboxGroup(), false);
        
        checkGuest.setMediator(this);
        checkLogin.setMediator(this);
        
        add(checkGuest);
        add(checkLogin);
        
        // Username Field
        labelUserName = new ColleagueLabel();
        labelUserName.setText("Username:");
        textUserName = new ColleagueTextField(10);
        
        labelUserName.setMediator(this);
        textUserName.setMediator(this);
        
        add(labelUserName);
        add(textUserName);
        
        // Password Field
        labelPassword = new ColleagueLabel();
        labelPassword.setText("Password:");
        textPassword = new ColleagueTextField(10);
        textPassword.setEchoChar('*');
        
        labelPassword.setMediator(this);
        textPassword.setMediator(this);
        
        add(labelPassword);
        add(textPassword);
        
        // OK / Cancel Buttons
        buttonOk = new ColleagueButton("OK");
        buttonCancel = new ColleagueButton("Cancel");
        
        buttonOk.setMediator(this);
        buttonCancel.setMediator(this);
        
        add(buttonOk);
        add(buttonCancel);
        
        // Status Label (로그인 가능 여부)
        statusLabel = new ColleagueLabel();
        statusLabel.setMediator(this);
        add(statusLabel);
        add(new Label()); // 빈 공간 채우기
        
        // Window Close Event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
        colleagueChanged();
    }

    public void colleagueChanged() {
        if (checkGuest.getState()) {
            // Guest 모드: 입력 필드 비활성화
            textUserName.setColleagueEnabled(false);
            textPassword.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(true);
            statusLabel.setColleagueEnabled(true);
        } else {
            // Login 모드: 입력 필드 활성화
            textUserName.setColleagueEnabled(true);
            textPassword.setColleagueEnabled(true);
            
            // Username과 Password가 4자 이상이면 OK 버튼 활성화
            boolean isValid = textUserName.getText().length() >= 4 &&
                            textPassword.getText().length() >= 4;
            
            buttonOk.setColleagueEnabled(isValid);
            statusLabel.setColleagueEnabled(isValid);
        }
    }
}