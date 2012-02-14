/**
 * 
 */
package kr.inamatrix.danguscore.client.gamer;

import java.util.logging.Logger;

import kr.inamatrix.danguscore.shared.common.StringUtil;
import kr.inamatrix.danguscore.shared.exceptions.IdIsNotAvailableException;
import kr.inamatrix.danguscore.shared.exceptions.PasswordDoesNotConfirmException;
import kr.inamatrix.danguscore.shared.exceptions.ScoreIsNotAvailableException;

import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.MessageBox;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.form.AdapterField;
import com.extjs.gxt.ui.client.widget.form.Field;
import com.extjs.gxt.ui.client.widget.form.TextField;
import com.extjs.gxt.ui.client.widget.layout.HBoxLayout;
import com.extjs.gxt.ui.client.widget.layout.HBoxLayoutData;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Widget;

/**
 * Title: RegistGamerForm.java<br>
 * Description: <br>
 * Copyright: Copyright(c) 2012 Inamatrix ALL Rights Reserved<br>
 * 
 * @author Jonghwa, Lee
 * @version 1.0
 * @created 2012. 1. 30.
 * @modified 2012. 1. 30.
 */
public class RegistGamerForm extends ManagementGamerForm {
    private static final Logger logger = Logger.getLogger(RegistGamerForm.class.getName());
    
    Field<Object> getIdField() {
        if ( _id == null ) {
            _id = new IdDuplicatedCheckField(new LayoutContainer(new HBoxLayout()));
        }
        return _id;
    }
    
    Button getOperationButton() {
        Button button = new Button("가입");
        button.addSelectionListener(new SelectionListener<ButtonEvent>() {
            
            @Override
            public void componentSelected(ButtonEvent ce) {
                logger.finest("Regist button clicked !!");
                if ( ((IdDuplicatedCheckField) _id).isDuplicate() ) {
                    MessageBox.alert(getHeading(), "ID가 중복되었습니다.", null);
                    return;
                }
                
                try {
                    _delegate.regiestGamer(getGamerInfo());
                } catch ( PasswordDoesNotConfirmException e ) {
                    MessageBox.alert(getHeading(), "동일한 비밀번호를 입력해주세요. ", null);
                } catch ( ScoreIsNotAvailableException s ) {
                    MessageBox.alert(getHeading(), "점수가 잘못되었습니다. 점수의 범위는 0부터 5000사이입니다.", null);
                } catch ( IdIsNotAvailableException e ) {
                    MessageBox.alert(getHeading(), "ID가 옳바르지 않습니다..", null);
                }
            }
        });
        return button;
    }
    
    /*
     * (non-Javadoc)
     * 
     * @see
     * kr.inamatrix.danguscore.client.gamer.ManagementGamerForm#setEditable()
     */
    @Override
    void setEditable() {
        getIdField().setReadOnly(false);
        getPasswordField().setReadOnly(false);
        getPasswordConfirmField().setReadOnly(false);
        getNameField().setReadOnly(false);
        getScoreField().setReadOnly(false);
        getEmailField().setReadOnly(false);
    }
    
    private class IdDuplicatedCheckField extends AdapterField {
        private TextField<String> _textField;
        private Button _checkButton;
        private boolean _duplicate;
        
        /**
         * @param widget
         */
        public IdDuplicatedCheckField(Widget widget) {
            super(widget);
            _textField = new TextField<String>();
            _textField.setFieldLabel("ID");
            _checkButton = new Button("ID 확인");
            _checkButton.addSelectionListener(new SelectionListener<ButtonEvent>() {
                @Override
                public void componentSelected(ButtonEvent ce) {
                    GWT.log("ID Check button clicked.");
                    _delegate.checkIdDuplicate(getValue());
                }
            });
            ((LayoutContainer)widget).add(_textField, new HBoxLayoutData(0, 0, 0, 0));
            ((LayoutContainer)widget).add(_checkButton, new HBoxLayoutData(0, 0, 0, 5));
            setAllowBlank(false);
        }
        
        public String getValue() {
            return StringUtil.isEmptyString(_textField.getValue()) ? "" : _textField.getValue();
        }
        
        public void setReadOnly(boolean readOnly) {
            _textField.setReadOnly(readOnly);
        }
        
        public void setAllowBlank(boolean allowBlank) {
            _textField.setAllowBlank(allowBlank);
        }
        
        public boolean isValid(boolean preventMark) {
            return _textField.isValid(preventMark);
        }
        
        public boolean isDuplicate() {
            return _duplicate;
        }
        
        public String getFieldLabel() {
            return "아 이 디";
        }
    }
}
