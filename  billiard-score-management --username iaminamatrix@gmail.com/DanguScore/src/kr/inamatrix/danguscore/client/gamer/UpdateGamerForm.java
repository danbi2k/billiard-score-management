/**
 * 
 */
package kr.inamatrix.danguscore.client.gamer;

import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.widget.button.Button;

/**
 * Title: UpdateGamerForm.java<br>
 * Description: <br>
 * Copyright: Copyright(c) 2012 Inamatrix ALL Rights Reserved<br>
 * 
 * @author Jonghwa, Lee
 * @version 1.0
 * @created 2012. 1. 30.
 * @modified 2012. 1. 30.
 */
public class UpdateGamerForm extends ManagementGamerForm {

    Button getOperationButton() {
        Button button = new Button("갱신");
        button.addSelectionListener(new SelectionListener<ButtonEvent>() {
            
            @Override
            public void componentSelected(ButtonEvent ce) {
                // TODO Auto-generated method stub
                
            }
        });
        return button;
    }
}
