/**
 * 
 */
package kr.inamatrix.danguscore.client.gamer;

import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.widget.MessageBox;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.google.gwt.core.client.GWT;

/**
 * Title: DeleteGamerForm.java<br>
 * Description: <br>
 * Copyright: Copyright(c) 2012 Inamatrix ALL Rights Reserved<br>
 * 
 * @author Jonghwa, Lee
 * @version 1.0
 * @created 2012. 1. 30.
 * @modified 2012. 1. 30.
 */
public class DeleteGamerForm extends ManagementGamerForm {
    
    Button getOperationButton() {
        Button button = new Button("삭제");
        button.addSelectionListener(new SelectionListener<ButtonEvent>() {
            
            @Override
            public void componentSelected(ButtonEvent ce) {
                GWT.log("Delete Button Clicked!!");
                try {
                    _delegate.deleteGamer(getGamerInfo());
                } catch ( Exception e ) {
                    MessageBox.alert(getHeading(), "동일한 비밀번호를 입력하여야 합니다. ", null);
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
        getIdField().setReadOnly(true);
        getPasswordField().setReadOnly(false);
        getPasswordConfirmField().setReadOnly(false);
        getNameField().setReadOnly(true);
        getScoreField().setReadOnly(true);
        getEmailField().setReadOnly(true);
    }
}
