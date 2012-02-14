/**
 * 
 */
package kr.inamatrix.danguscore.client.result;

import com.extjs.gxt.ui.client.widget.TabItem;
import com.extjs.gxt.ui.client.widget.layout.FitLayout;

/**
 * Title: RetrieveResultTabItem.java<br>
 * Description: <br>
 * Copyright: Copyright(c) 2012 Inamatrix ALL Rights Reserved<br>
 * 
 * @author Jonghwa, Lee
 * @version 1.0
 * @created 2012. 2. 6.
 * @modified 2012. 2. 6.
 */
public class RetrieveResultTabItem extends TabItem {
    public RetrieveResultTabItem() {
        setClosable(false);
        setText("게임 결과 조회");
        setLayout(new FitLayout());
        
        initialize();
    }
    
    private void initialize() {
        
    }
}
