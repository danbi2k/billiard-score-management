/**
 * 
 */
package kr.inamatrix.danguscore.client.login;

import com.google.gwt.core.client.EntryPoint;

/**
 * Title: LoginEntryPoint.java<br>
 * Description: <br>
 * Copyright: Copyright(c) 2012 Inamatrix ALL Rights Reserved<br>
 * 
 * @author Jonghwa, Lee
 * @version 1.0
 * @created 2012. 1. 26.
 * @modified 2012. 1. 26.
 */
public class LoginServiceEntryPoint implements EntryPoint {

    /* (non-Javadoc)
     * @see com.google.gwt.core.client.EntryPoint#onModuleLoad()
     */
    @Override
    public void onModuleLoad() {
        LoginServiceForm.newInstance();
    }
    
}
