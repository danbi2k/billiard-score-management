/**
 * 
 */
package kr.inamatrix.danguscore.client.login;

import java.util.logging.Logger;

import kr.inamatrix.danguscore.client.gamer.RegistGamerForm;
import kr.inamatrix.danguscore.client.main.MainViewport;

import com.extjs.gxt.ui.client.Style.HorizontalAlignment;
import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.widget.MessageBox;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.form.FormButtonBinding;
import com.extjs.gxt.ui.client.widget.form.FormPanel;
import com.extjs.gxt.ui.client.widget.form.TextField;
import com.google.gwt.core.client.GWT;

/**
 * Title: LoginWindow.java<br>
 * Description: 로그인 서비스를 하는 form panel<br>
 * Copyright: Copyright(c) 2012 Inamatrix ALL Rights Reserved<br>
 * 
 * @author Jonghwa, Lee
 * @version 1.0
 * @created 2012. 1. 26.
 * @modified 2012. 1. 26.
 */
public class LoginServiceForm extends FormPanel {
    private static final Logger logger = Logger.getLogger(LoginServiceForm.class.getName());
    
    private static LoginServiceForm instance;
    
    private TextField<String> _name;
    private TextField<String> _password;
    
    private Button _login;
    private Button _regist;
    
    private LoginServiceDelegate _loginServiceDelegate = new LoginServiceDelegate();
    
    private LoginServiceForm() {
        initialize();
    }
    
    public static final LoginServiceForm newInstance() {
        return getInstance();
    }
    
    public static final LoginServiceForm getInstance() {
        if (instance == null) {
            instance = new LoginServiceForm();
        }
        return instance;        
    }
    
    private void initialize() {
        logger.fine("initialize() start");
        setButtonAlign(HorizontalAlignment.CENTER);
        setLabelAlign(LabelAlign.LEFT);
        setFrame(false);
        setSize(310, 140);
        
        add(getNameTextfield());
        add(getPasswordField());
        addButton(getLoginButton());
        addButton(getRegistButton());
        bindingButtonWithForm();
        logger.fine("initialize() end");
    }
    
    private void bindingButtonWithForm() {
        FormButtonBinding binding = new FormButtonBinding(this);
        binding.addButton(_login);
    }
    
    private TextField<String> getNameTextfield() {
        if ( _name == null ) {
            _name = new TextField<String>();
            _name.setFieldLabel("Name");
            _name.setAllowBlank(false);
        }
        return _name;
    }
    
    private TextField<String> getPasswordField() {
        if ( _password == null ) {
            _password = new TextField<String>();
            _password.setFieldLabel("Password");
            _password.setPassword(true);
            _password.setAllowBlank(false);
        }
        return _password;
    }
    
    private Button getLoginButton() {
        if ( _login == null ) {
            _login = new Button("로그인");
            _login.addSelectionListener(new SelectionListener<ButtonEvent>() {
                @Override
                public void componentSelected(ButtonEvent ce) {
                    logger.info("login button clicked.");
                    _loginServiceDelegate.login(_name.getValue(), _password.getValue());
                }
            });
        }
        return _login;
    }
    
    private Button getRegistButton() {
        if ( _regist == null ) {
            _regist = new Button("선수등록");
            _regist.addSelectionListener(new SelectionListener<ButtonEvent>() {
                @Override
                public void componentSelected(ButtonEvent ce) {
                    logger.info("regiest button clicked.");
                    processRegistGamer();
                }
            });
        }
        return _regist;
    }

    /**
     * 
     */
    public void processLoginSuccess() {
        // TODO : show success message and change the page.
    }

    private void processRegistGamer() {
        GWT.log("processRegistGamer()");
        MainViewport.getInstance().setView(new RegistGamerForm());
    }
    
    /**
     * @param caught
     */
    public void showLoginErrorMessage(Throwable caught) {
        // TODO Auto-generated method stub
        MessageBox.alert("Login", "이름 또는 비밀번호가 틀립니다.", null);
    }

    /**
     * 
     */
    public void showLoginFailed() {
        MessageBox.alert("Login", "이름 또는 비밀번호가 틀립니다.", null);
    }
}
