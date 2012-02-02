/**
 * 
 */
package kr.inamatrix.danguscore.client.gamer;

import java.util.logging.Logger;

import com.extjs.gxt.ui.client.Style.HorizontalAlignment;
import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.form.Field;
import com.extjs.gxt.ui.client.widget.form.FormPanel;
import com.extjs.gxt.ui.client.widget.form.TextField;

/**
 * Title: RegistGamerForm.java<br>
 * Description: <br>
 * Copyright: Copyright(c) 2012 Inamatrix ALL Rights Reserved<br>
 * 
 * @author Jonghwa, Lee
 * @version 1.0
 * @created 2012. 1. 27.
 * @modified 2012. 1. 27.
 */
public abstract class ManagementGamerForm extends FormPanel {
    
    private static final Logger logger = Logger.getLogger(ManagementGamerForm.class.getName());
    
    private TextField<String> _id;
    private TextField<String> _password;
    private TextField<String> _passwordConfirm;
    private TextField<String> _name;
    private TextField<String> _score;
    private TextField<String> _email;
    
    private Button _cancel;
    
    ManagementGamerForm() {
        organizedForm();
        setButtonAlign(HorizontalAlignment.CENTER);
        setLabelAlign(LabelAlign.LEFT);
        setFrame(false);
    }
    
    /**
     * 
     */
    private void organizedForm() {
        add(getIdField());
        add(getPasswordField());
        add(getPasswordConfirmField());
        add(getNameField());
        add(getScoreField());
        add(getEmailField());
        addButton(getOperationButton());
        addButton(getCancelButton());
    }
    
    Field<String> getIdField() {
        if ( _id == null ) {
            _id = new TextField<String>();
            _id.setFieldLabel("아 이 디");
            _id.setAllowBlank(false);
        }
        return _id;
    }
    
    TextField<String> getPasswordField() {
        if ( _password == null ) {
            _password = new TextField<String>();
            _password.setFieldLabel("비밀번호");
            _password.setAllowBlank(false);
            _password.setPassword(true);
        }
        return _password;
    }
    
    TextField<String> getPasswordConfirmField() {
        if ( _passwordConfirm == null ) {
            _passwordConfirm = new TextField<String>();
            _passwordConfirm.setFieldLabel("비밀번호 확인");
            _passwordConfirm.setAllowBlank(false);
            _passwordConfirm.setPassword(true);
        }
        return _passwordConfirm;
    }
    
    TextField<String> getNameField() {
        if ( _name == null ) {
            _name = new TextField<String>();
            _name.setFieldLabel("이 름");
            _name.setAllowBlank(false);
        }
        return _name;
    }
    
    TextField<String> getScoreField() {
        if ( _score == null ) {
            _score = new TextField<String>();
            _score.setFieldLabel("점 수");
            _score.setAllowBlank(false);
        }
        return _score;
    }
    
    TextField<String> getEmailField() {
        if ( _email == null ) {
            _email = new TextField<String>();
            _email.setFieldLabel("E-Mail");
        }
        return _email;
    }
    
    private Button getCancelButton() {
        if ( _cancel == null ) {
            _cancel = new Button("취소");
            _cancel.addSelectionListener(new SelectionListener<ButtonEvent>() {
                @Override
                public void componentSelected(ButtonEvent ce) {
                    logger.fine("Cancel clicked.");
                }
            });
        }
        return _cancel;
    }
    
    /**
     * 
     */
    public static void convertManagementGamerForm() {
        // TODO Auto-generated method stub
        
    }
    
    abstract Button getOperationButton();
}
