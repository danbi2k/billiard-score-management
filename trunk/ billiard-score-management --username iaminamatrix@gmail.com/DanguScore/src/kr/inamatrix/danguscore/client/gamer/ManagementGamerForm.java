/**
 * 
 */
package kr.inamatrix.danguscore.client.gamer;

import java.util.logging.Logger;

import kr.inamatrix.danguscore.client.login.LoginServiceForm;
import kr.inamatrix.danguscore.client.main.MainViewport;
import kr.inamatrix.danguscore.shared.common.StringUtil;
import kr.inamatrix.danguscore.shared.exceptions.IdIsNotAvailableException;
import kr.inamatrix.danguscore.shared.exceptions.PasswordDoesNotConfirmException;
import kr.inamatrix.danguscore.shared.exceptions.ScoreIsNotAvailableException;
import kr.inamatrix.danguscore.shared.models.GamerInfoModel;

import com.extjs.gxt.ui.client.Style.HorizontalAlignment;
import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.form.Field;
import com.extjs.gxt.ui.client.widget.form.FormButtonBinding;
import com.extjs.gxt.ui.client.widget.form.FormPanel;
import com.extjs.gxt.ui.client.widget.form.NumberField;
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
    
    ManagementGamerDelegate _delegate = new ManagementGamerDelegate();
    
    Field<Object> _id;
    private TextField<String> _password;
    private TextField<String> _passwordConfirm;
    private TextField<String> _name;
    private NumberField _score;
    private TextField<String> _email;
    
    private Button _cancel;
    
    public enum Operation {
        REGIST("등록"), UPDATE("갱신"), DELETE("삭제");
        String _title;
        Operation(String title) {
            _title = title;
        }
        
        String getTitle(){
            return _title;
        }
    }
    
    ManagementGamerForm() {
        logger.info("ManagementGamerForm() start!!");
        
        setButtonAlign(HorizontalAlignment.CENTER);
        setLabelAlign(LabelAlign.RIGHT);
        setLabelWidth(90);
        setFrame(true);
        setSize(340, 240);
        organizedForm();
        
        FormButtonBinding binding = new FormButtonBinding(this);
        binding.addButton(getOperationButton());
        
        logger.info("ManagementGamerForm() End!!");
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
    
    Field<Object> getIdField() {
        if ( _id == null ) {
            _id = new TextField<Object>();
            _id.setFieldLabel("아 이 디");
            ((TextField<Object>)_id).setAllowBlank(false);
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
    
    NumberField getScoreField() {
        if ( _score == null ) {
            _score = new NumberField();
            _score.setFieldLabel("점 수");
            _score.setAllowBlank(false);
            _score.setMinLength(3);
        }
        return _score;
    }
    
    TextField<String> getEmailField() {
        if ( _email == null ) {
            _email = new TextField<String>();
            _email.setFieldLabel("E-Mail");
            _email.setAllowBlank(true);
        }
        return _email;
    }
    
    private Button getCancelButton() {
        if ( _cancel == null ) {
            _cancel = new Button("취소");
            _cancel.addSelectionListener(new SelectionListener<ButtonEvent>() {
                @Override
                public void componentSelected(ButtonEvent ce) {
                    logger.info(getClass() + " : Cancel button clicked.");
                    MainViewport.getInstance().setView(LoginServiceForm.getInstance());
                }
            });
        }
        return _cancel;
    }
    
    @Override
    protected void beforeRender() {
        super.beforeRender();
    }
    
    GamerInfoModel getGamerInfo() throws PasswordDoesNotConfirmException, ScoreIsNotAvailableException, IdIsNotAvailableException {
        if (StringUtil.isEmptyString(getIdField().getValue())) {
            throw new IdIsNotAvailableException();
        }
        
        GamerInfoModel.Builder builder = new GamerInfoModel.Builder(getIdField().getValue().toString(), getPasswordField().getValue());
        builder.setPasswordConfirm(getPasswordConfirmField().getValue());
        try {
            builder.setScore(getScoreField().getValue().intValue());            
        } catch (Exception e) {
            throw new ScoreIsNotAvailableException();
        }
        builder.setEmail(getEmailField().getValue());
        builder.setRegistDate(System.currentTimeMillis());
        return builder.build();
    }
    
    public ManagementGamerForm createManagementForm(Operation oper) {
        ManagementGamerForm form = null;
        switch ( oper ) {
            case REGIST :
                form =  new RegistGamerForm();
                break;
            case UPDATE :
                form =  new UpdateGamerForm();
                break;
            case DELETE :
                form =  new DeleteGamerForm();
                break;
        }
        form.setHeading(oper.getTitle());
        return form;
    }
    
    abstract Button getOperationButton();
    abstract void setEditable();
}
