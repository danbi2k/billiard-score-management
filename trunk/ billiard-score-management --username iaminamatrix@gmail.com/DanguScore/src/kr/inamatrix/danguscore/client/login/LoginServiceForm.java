/**
 * 
 */
package kr.inamatrix.danguscore.client.login;

import java.util.logging.Logger;

import com.extjs.gxt.ui.client.Style.HorizontalAlignment;
import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.widget.MessageBox;
import com.extjs.gxt.ui.client.widget.Viewport;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.form.FormButtonBinding;
import com.extjs.gxt.ui.client.widget.form.FormPanel;
import com.extjs.gxt.ui.client.widget.form.FormPanel.LabelAlign;
import com.extjs.gxt.ui.client.widget.form.TextField;
import com.extjs.gxt.ui.client.widget.layout.CenterLayout;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

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
public class LoginServiceForm {
    private static final Logger logger = Logger.getLogger(LoginServiceForm.class.getName());
    
    private static LoginServiceForm instance;
    private FormPanel _form;
    
    private TextField<String> _name;
    private TextField<String> _password;
    
    private Button _login;
    private Button _regist;
    
    private LoginServiceDelegate _loginServiceDelegate = new LoginServiceDelegate();
    
    private LoginServiceForm() {
        initialize();
    }
    
    public static final void newInstance() {
        getInstance();
    }
    
    public static final LoginServiceForm getInstance() {
        if (instance == null) {
            instance = new LoginServiceForm();
        }
        return instance;        
    }
    
    private void initialize() {
        logger.fine("initialize() start");
        getFormPanel().add(getNameTextfield());
        getFormPanel().add(getPasswordField());
        getFormPanel().addButton(getLoginButton());
        getFormPanel().addButton(getRegistButton());
        bindingButtonWithForm();
                
        RootPanel.get().add(getViewport());
        logger.fine("initialize() end");
    }
    
    /**
     * @return
     */
    private Widget getViewport() {
        Viewport view = new Viewport();
        view.setLayout(new CenterLayout());
        view.add(getFormPanel());
        return view;
    }

    /**
     * 
     */
    private void bindingButtonWithForm() {
        FormButtonBinding binding = new FormButtonBinding(_form);
        binding.addButton(_login);
    }
    
    private FormPanel getFormPanel() {
        if ( _form == null ) {
            _form = new FormPanel();
            _form.setButtonAlign(HorizontalAlignment.CENTER);
            _form.setLabelAlign(LabelAlign.LEFT);
            _form.setFrame(false);
            _form.setSize(350, 140);
        }
        return _form;
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
                    GWT.log("login button clicked.");
                    logger.info("login button clicked.");
                    _loginServiceDelegate.login(_name.getValue(), _password.getValue());
                    MessageBox.alert("Login", "이름 또는 비밀번호가 틀립니다.", null);
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
                }
            });
        }
        return _regist;
    }

    /**
     * 
     */
    public void processLoginSuccess() {
        _form.hide();
        // TODO : show success message and change the page.
    }

    /**
     * @param caught
     */
    public void showLoginErrorMessage(Throwable caught) {
        // TODO Auto-generated method stub
    }

    /**
     * 
     */
    public void showLoginFailed() {
        MessageBox.alert("Login", "이름 또는 비밀번호가 틀립니다.", null);
    }
}
