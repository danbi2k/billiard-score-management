/**
 * 
 */
package kr.inamatrix.danguscore.client.gamer;

import kr.inamatrix.danguscore.shared.exceptions.PasswordDoesNotConfirmException;
import kr.inamatrix.danguscore.shared.exceptions.ScoreIsNotAvailableException;

import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.widget.MessageBox;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.form.Field;
import com.google.gwt.core.client.GWT;

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
    
    Field<String> getIdField(){
        
//        _id = new IdDuplicatedCheckField();
        return super.getIdField();
    }
    
    Button getOperationButton() {
        Button button = new Button("가입");
        button.addSelectionListener(new SelectionListener<ButtonEvent>() {
            
            @Override
            public void componentSelected(ButtonEvent ce) {
                GWT.log("Regist button clicked !!");
                try {
                    _delegate.regiestGamer(getGamerInfo());
                } catch ( PasswordDoesNotConfirmException e ) {
                    MessageBox.alert(getHeading(), "동일한 비밀번호를 입력해주세요. ", null);                    
                } catch ( ScoreIsNotAvailableException s) {
                    MessageBox.alert(getHeading(), "점수를 입력해주세요. ", null);
                }
            }
        });
        return button;
    }

    /* (non-Javadoc)
     * @see kr.inamatrix.danguscore.client.gamer.ManagementGamerForm#setEditable()
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
    
    // 아이디 중복 검사 field 구현하기
//    private class IdDuplicatedCheckField extends TextField<String> {
//        private Button getCheckDuplicatedIdButton() {
//            Button button = new Button("아이디 중복 검사");
//            button.addSelectionListener(new SelectionListener<ButtonEvent>() {
//                @Override
//                public void componentSelected(ButtonEvent ce) {
//                    // TODO Auto-generated method stub
//                    
//                }
//            });
//            return button;
//        }
//    }
}
