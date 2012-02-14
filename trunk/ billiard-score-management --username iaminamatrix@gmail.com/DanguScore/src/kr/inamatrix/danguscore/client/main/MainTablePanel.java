/**
 * 
 */
package kr.inamatrix.danguscore.client.main;

import kr.inamatrix.danguscore.client.game.RegistGameTabItem;
import kr.inamatrix.danguscore.client.result.RetrieveResultTabItem;
import kr.inamatrix.danguscore.shared.exceptions.NoSessionFoundException;

import com.extjs.gxt.ui.client.widget.MessageBox;
import com.extjs.gxt.ui.client.widget.TabPanel;

/**
 * Title: MainTablePanel.java<br>
 * Description: 로그인 성공 시 출력되는 Main Tab Panel <br>
 * Copyright: Copyright(c) 2012 Inamatrix ALL Rights Reserved<br>
 * 
 * @author Jonghwa, Lee
 * @version 1.0
 * @created 2012. 2. 6.
 * @modified 2012. 2. 6.
 */
public class MainTablePanel extends TabPanel {
    /**
     * 
     */
    public MainTablePanel() {
        setResizeTabs(true);
        setAnimScroll(true);
        
        initialize();
    }
    
    private void initialize() {
        try {
            if (SessionInfo.getInstance().isAdmin()) {
                add(new RegistGameTabItem());
            }
        } catch ( NoSessionFoundException e ) {
            MessageBox.alert("Dangu Score", "Session 정보가 존재 하지 않습니다.", null);
        }
        add(new RetrieveResultTabItem());
    }
}
