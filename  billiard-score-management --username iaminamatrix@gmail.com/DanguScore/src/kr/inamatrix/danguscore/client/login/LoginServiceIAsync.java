/**
 * 
 */
package kr.inamatrix.danguscore.client.login;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * Title: LoginServiceIAsync.java<br>
 * Description: <br>
 * Copyright: Copyright(c) 2012 Inamatrix ALL Rights Reserved<br>
 * 
 * @author Jonghwa, Lee
 * @version 1.0
 * @created 2012. 1. 26.
 * @modified 2012. 1. 26.
 */
public interface LoginServiceIAsync {

    /**
     * @param textToServer
     * @param asyncCallback
     */
    void greetServer(String textToServer, AsyncCallback<String> asyncCallback);
    
}
