/**
 * 
 */
package kr.inamatrix.danguscore.client.main;

import kr.inamatrix.danguscore.client.login.LoginServiceForm;

import com.extjs.gxt.ui.client.event.Events;
import com.extjs.gxt.ui.client.widget.Component;
import com.extjs.gxt.ui.client.widget.Viewport;
import com.extjs.gxt.ui.client.widget.layout.CenterLayout;
import com.google.gwt.user.client.ui.Widget;

/**
 * Title: MainViewport.java<br>
 * Description: <br>
 * Copyright: Copyright(c) 2012 Inamatrix ALL Rights Reserved<br>
 * 
 * @author Jonghwa, Lee
 * @version 1.0
 * @created 2012. 1. 31.
 * @modified 2012. 1. 31.
 */
public class MainViewport extends Viewport {
    private static final MainViewport instance = new MainViewport();
    
    public static final MainViewport getInstance() {
        return instance;
    }
    
    private MainViewport() {
        setLayout(new CenterLayout());
        add(LoginServiceForm.newInstance());
    }

    public void setView(Widget w) {
        for(Component c : getItems()) {
            c.hide();
        }
        removeAll();
        add(w);
        w.setVisible(true);
        fireEvent(Events.Resize);
        
//        fireEvent(Events.OnChange);
//        fireEvent(Events.Refresh);
//        fireEvent(Events.Render);
//        fireEvent(Events.Ready);
//        fireEvent(Events.ResizeStart);
//        fireEvent(Events.ResizeEnd);
//        fireEvent(Events.Restore);
//        fireEvent(Events.Scroll);
//        fireEvent(Events.Show);
//        fireEvent(Events.StateChange);
//        fireEvent(Events.Valid);
//        fireEvent(Events.Update);
//        fireEvent(Events.ViewReady);
    }
    
//    public void changeView(Widget w) {
//        
//    }
}
