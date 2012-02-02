/**
 * 
 */
package kr.inamatrix.danguscore.client.gamer;

import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.form.Field;

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
                // TODO Auto-generated method stub
                
            }
        });
        return button;
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
